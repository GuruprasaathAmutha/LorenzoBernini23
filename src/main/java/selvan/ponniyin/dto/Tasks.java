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
	int Taskid;
	String Task;
	String status ;
	
	public Tasks(int id,String task,String status) {
		this.Taskid=id;
		this.Task=task;
		this.status=status;
	}
	
	
	public Tasks(String task, String status) {
		super();
		Task = task;
		this.status = status;
	}


	public Tasks() {

	}

	public int getTaskid() {
		return Taskid;
	}

	public void setTaskid(int taskid) {
		Taskid = taskid;
	}

	public String getTask() {
		return Task;
	}

	public void setTask(String task) {
		Task = task;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	

	
	
}
