package dlteassisgnment.example.demo.controller;
import dlteassisgnment.example.demo.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LoanController {
    @Autowired
    private LoanService loanServices;

    @PutMapping("/status")
    public void callStatus(){
        loanServices.implementUpdate();
    }

}

