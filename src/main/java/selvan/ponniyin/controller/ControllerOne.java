package selvan.ponniyin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import selvan.ponniyin.dto.Tasks;
import selvan.ponniyin.repo.TaskRepo;
import selvan.ponniyin.service.TaskSvc;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ControllerOne {

	@Autowired
	TaskSvc ts;

	@PostMapping("/newTask")
	public ResponseEntity<List<Tasks>> newTask(@RequestParam String task) {
		Tasks create = new Tasks(task, "pending");
		List<Tasks> createdTask = new ArrayList<Tasks>();
		createdTask.add(ts.addTask(create));
		return ResponseEntity.ok(createdTask);

	}

	@GetMapping("/Pending")
	public ResponseEntity<List<Tasks>> pending() {

		List<Tasks> allTasks = ts.allTasks();
		return ResponseEntity.ok(allTasks);
	}

	@GetMapping("/onProgress")
	public ResponseEntity<List<Tasks>> onProgress() {

		Tasks one = new Tasks(1, "taskone", "pending");

		ts.addTask(one);
		List<Tasks> allTasks = new ArrayList<Tasks>();
		allTasks.add(one);

		return ResponseEntity.ok(allTasks);
	}

	@GetMapping("/Completed")
	public ResponseEntity<List<Tasks>> completed() {

		List<Tasks> allTasks = new ArrayList<Tasks>();

		return ResponseEntity.ok(allTasks);
	}

}
