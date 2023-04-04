package dlteassisgnment.example.demo.remote;

import dlteassisgnment.example.demo.model.LoanModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
        import java.util.Optional;

@Repository
public interface LoanRemote extends CrudRepository<LoanModel,Long> {
    Optional<LoanModel> findByloanNumber(Integer loanNumber);

    List<LoanModel> findByProfession(String selfemployee, String profession);

    Optional<LoanModel> findByCibil(int cibil);

    List<LoanModel> findAllByIncomeperyear(Integer income);

    @Modifying
    @Transactional
    @Query("update LoanModel set status='Approved' where cibil>700 and profession in ('salaried','self-employed') and incomeperyear>= requested_amount*3")
    void updateStatus();


}
