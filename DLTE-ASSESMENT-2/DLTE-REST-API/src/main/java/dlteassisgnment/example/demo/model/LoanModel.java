package dlteassisgnment.example.demo.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;

@Data
    @AllArgsConstructor
    @NoArgsConstructor

    @Entity
    public class LoanModel {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "loan_seq")
        private long loanNumber;
        @Column(nullable = false)
        private int requested_amount;
        @Column(nullable = false)
        private int cibil;
        @Column(nullable = false)
        private long adar;
        @Column(nullable = false)
        private String pan;
        @Column(nullable = false)
        private String  profession;
        @Column(nullable = false)
        private long incomeperyear;

        private String status;

        @Temporal(TemporalType.DATE)
        private Date dateOfTheRequest;
}
