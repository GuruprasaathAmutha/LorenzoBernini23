package selvan.kaala.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import selvan.kaala.Repo.EmpRepo;
import selvan.kaala.Repo.Employee;

@Controller
public class ControllerS {


    EmpRepo empRepo;


    @PostMapping("/addEmp")
    public ResponseEntity<Employee> addEmp(@RequestParam String name) {
        System.out.println("guru");
        return ResponseEntity.ok(empRepo.save(new Employee(name)));
    }


}

