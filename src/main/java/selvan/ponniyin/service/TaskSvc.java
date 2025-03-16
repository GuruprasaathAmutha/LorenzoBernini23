package selvan.ponniyin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import selvan.ponniyin.dto.Tasks;
import selvan.ponniyin.repo.TaskRepo;

@Service
public class TaskSvc {

	@Autowired
	private TaskRepo trepo;
	
	public List<Tasks> allTasks() {
		return trepo.findAll();
	}
	
	public Tasks addTask(Tasks t) {
		return trepo.save(t);
	}
}
