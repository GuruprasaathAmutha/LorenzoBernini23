package selvan.ponniyin.dto;


import selvan.ponnyin.Enum.Status;

public class Tasks {

	int Taskid;
	String Task;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	Status status ;
	
	public Tasks(int id,String task) {
		this.Taskid=id;
		this.Task=task;
		this.status=Status.Pending;
	}
	
	
}
