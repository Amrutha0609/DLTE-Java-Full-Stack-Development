package dlteassisgnment.example.demo.service;
        import dlteassisgnment.example.demo.model.LoanModel;
        import dlteassisgnment.example.demo.remote.LoanRemote;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

@Service
public class LoanService {
    @Autowired
    private LoanRemote loanRepository;

    public void implementUpdate(){
        loanRepository.updateStatus();
    }
}












