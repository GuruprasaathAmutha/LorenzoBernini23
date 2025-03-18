package selvan.ponniyin.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tasks")
public class Tasks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int taskid;
	private String task;
	private String status ;
	
	public Tasks(int id,String task,String status) {
		this.taskid=id;
		this.task=task;
		this.status=status;
	}
	
	
	public Tasks(String task, String status) {
		super();
		this.task = task;
		this.status = status;
	}


	public Tasks() {

	}


	public int getTaskid() {
		return taskid;
	}


	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}


	public String getTask() {
		return task;
	}


	public void setTask(String task) {
		this.task = task;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	

	
	
}
