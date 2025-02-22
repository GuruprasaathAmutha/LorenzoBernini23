package selvan.ponniyin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import selvan.ponniyin.dto.Tasks;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ControllerOne {

	@GetMapping("/Pending")
	public ResponseEntity<List<Tasks>> pending() {
		

		Tasks one = new Tasks(1, "task one");
		Tasks two= new Tasks(2, "task two");
		
		List<Tasks> allTasks = new ArrayList<Tasks>();
		allTasks.add(one);
		allTasks.add(two);
		return ResponseEntity.ok(allTasks);
	}
	
	@GetMapping("/onProgress")
	public ResponseEntity<List<Tasks>> onProgress() {
		


		Tasks three = new Tasks(3, "task three");
		Tasks four= new Tasks(4, "task four");

		
		List<Tasks> allTasks = new ArrayList<Tasks>();

		allTasks.add(three);
		allTasks.add(four);

		return ResponseEntity.ok(allTasks);
	}
	
	@GetMapping("/Completed")
	public ResponseEntity<List<Tasks>> completed() {
		

		Tasks five= new Tasks(5, "task five");
		
		List<Tasks> allTasks = new ArrayList<Tasks>();
		allTasks.add(five);

		return ResponseEntity.ok(allTasks);
	}
	
	
	
	
}
