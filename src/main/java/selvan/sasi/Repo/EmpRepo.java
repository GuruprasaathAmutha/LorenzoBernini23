package selvan.sasi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface EmpRepo extends JpaRepository<Employee,Integer> {
}
