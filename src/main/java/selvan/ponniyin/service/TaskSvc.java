package selvan.ponniyin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import selvan.ponniyin.dto.Tasks;
import selvan.ponniyin.repo.TaskRepo;

@Service
public class TaskSvc {

	@Autowired
	private TaskRepo trepo;

	public Tasks addTask(Tasks t) {
		return trepo.save(t);
	}

	public  Optional <List<Tasks>> findByStatusOrderByTaskidDesc(String status) {
		return trepo.findByStatusOrderByTaskidDesc(status);
	}

	public boolean updateOnprogressbyId(int id) {
		Optional<Tasks> existingtask = trepo.findById(id);
		if (existingtask.isPresent()) {
			Tasks t = existingtask.get();
			t.setStatus("OnProgress");
			return trepo.save(t) != null ? true : false;
		}
		System.out.println("Task with taskid " + id + " is not present");
		return false;
	}


	public List<Integer> getallIds(){
		return trepo.getIds();
	}

	public boolean updateToCompleted(int id) {
		Optional<Tasks> existing = trepo.findById(id);
		if (existing.isPresent()) {
			Tasks t = existing.get();
			t.setStatus("Completed");
			return trepo.save(t) != null ? true : false;
		}
		return false;
	}

}
