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

@CrossOrigin(origins = {"https://192.168.68.155:5173","http://localhost:5173"})
@RestController
public class ControllerOne {

	@Autowired
	TaskSvc ts;

	@PostMapping("/newTask")
	public ResponseEntity<List<Tasks>> newTask(@RequestParam	 String task) {
		Tasks create = new Tasks(task, "pending");
		List<Tasks> createdTask = new ArrayList<Tasks>();
		createdTask.add(ts.addTask(create));
		return ResponseEntity.ok(createdTask);
	}

	@GetMapping("/Pending")
	public ResponseEntity<List<Tasks>> pending() {
		return ResponseEntity.ok(ts.findByStatusOrderByTaskidDesc("pending"));
	}


	@GetMapping("/onProgress")
	public ResponseEntity<List<Tasks>> onProgress() {
		return ResponseEntity.ok(ts.findByStatusOrderByTaskidDesc("OnProgress"));
	}

	@GetMapping("/Completed")
	public ResponseEntity<List<Tasks>> completed() {
		return ResponseEntity.ok(ts.findByStatusOrderByTaskidDesc("Completed"));
	}

	
	@PostMapping("/toOnprogress")
	public ResponseEntity<Boolean> toOnprogress(@RequestParam int taskid){
		return ResponseEntity.ok(ts.updateOnprogressbyId(taskid));
	}
	
	
	@PostMapping("/toCompleted")
	public ResponseEntity<Boolean> toCompleted(@RequestParam int taskid){
		return ResponseEntity.ok(ts.updateToCompleted(taskid));
	}
}
