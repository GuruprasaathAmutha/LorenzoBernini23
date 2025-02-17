package selvan.ponniyin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ControllerOne {

	@GetMapping("/path")
	public ResponseEntity<Map<String, String>> getMethodName() {
		
		
		Map<String,String> pendingTasks = new HashMap();
		pendingTasks.put("message", "one");
		pendingTasks.put("message", "one");
		pendingTasks.put("message", "one");
		pendingTasks.put("message", "one");
		
		pendingTasks.put("message", "one");
		pendingTasks.put("message", "one");
		pendingTasks.put("message", "one");
		pendingTasks.put("message", "one");
		pendingTasks.put("message", "one");
		
		
		pendingTasks.put("message", "one");
		pendingTasks.put("message", "one");
		

		

		return ResponseEntity.ok(pendingTasks);
	}
	
	
	
//	@GetMapping("/pathone")
//	public  getMethod() {
//
//		return 
//	}
	
	
	
	
	
}
