package selvan.sasi.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import selvan.sasi.Repo.EmpRepo;
import selvan.sasi.Repo.Employee;

@Controller
public class ControllerS {


    EmpRepo empRepo;


    @PostMapping("/addEmp")
    public ResponseEntity<Employee> addEmp(@RequestParam String name) {
        System.out.println("guru");
        return ResponseEntity.ok(empRepo.save(new Employee(name)));
    }


}

