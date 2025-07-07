package selvan.sasi.Repo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private int EmpId;
    private String name;


    public Employee(String name){
        this.name=name;
    }
}
