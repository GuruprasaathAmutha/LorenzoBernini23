package selvan.ponniyin.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import selvan.ponniyin.dto.Tasks;

public interface TaskRepo extends JpaRepository<Tasks, Integer> {
	List<Tasks> findBystatus(String status);
}
