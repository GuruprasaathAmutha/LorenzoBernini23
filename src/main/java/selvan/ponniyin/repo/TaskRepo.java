package selvan.ponniyin.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import selvan.ponniyin.dto.Tasks;

public interface TaskRepo extends JpaRepository<Tasks, Integer> {



	 Optional<List<Tasks>>  findByStatusOrderByTaskidDesc(String status);

	@Query("select taskid from Tasks")
	List<Integer> getIds();
}
