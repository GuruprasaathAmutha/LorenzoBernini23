package selvan.ponniyin.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import selvan.ponniyin.dto.Tasks;

public interface TaskRepo extends JpaRepository<Tasks, Integer> {
	List<Tasks> findByStatusOrderByTaskidDesc(String status);

	@Query("select taskid from Tasks")
	List<Integer> getIds();
}
