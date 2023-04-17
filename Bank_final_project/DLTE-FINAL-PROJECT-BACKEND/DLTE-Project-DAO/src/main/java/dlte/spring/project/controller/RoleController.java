package dlte.spring.project.controller;

import dlte.spring.project.model.Role;
import dlte.spring.project.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/template")
public class RoleController {
    @Autowired
    private RoleService service;
    private Logger logger= LoggerFactory.getLogger(RoleController.class);
    @GetMapping("/")
    public List<Role> callList(){
        logger.info("Controller about print All the records");
        return service.listAll();
    }

    @GetMapping("/byname/{name}/{pass}")
    public List<Role> callReadByName(@PathVariable("name") String name,@PathVariable("pass") String pass){
        logger.warn("Through the name of "+name+" controller trying to find the records");
        return service.readNames(name,pass);
    }
}
