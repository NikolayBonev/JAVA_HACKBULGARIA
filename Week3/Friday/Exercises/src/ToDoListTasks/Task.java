package ToDoListTasks;

public class Task {
	private int priority;
	private int timeToDo;
	private String Description;
	private boolean finished;
	private boolean cancelled;
	
	public Task(int priority) {
		this(priority, 1);
	}

	public Task(int priority, int timeToDo) {
		this(priority, timeToDo, null);
	}

	public Task(int priority, int timeToDo, String description) {
		super();
		setPriority(priority);
		setTimeToDo(timeToDo);
		setDescription(description);
		setCancelled(false);
		setFinished(false);
	}
	
	public int getPriority() {
		return this.priority;
	}
	public void setPriority(int priority) {
		if(priority >= 1 && priority <=10){
			this.priority = priority;
		}
	}
	public int getTimeToDo() {
		return this.timeToDo;
	}
	public void setTimeToDo(int timeToDo) {
		if(timeToDo > 0){
			this.timeToDo = timeToDo;
		}
	}
	public String getDescription() {
		return this.Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}

	public boolean isFinished() {
		return this.finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public boolean isCancelled() {
		return this.cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}	
}
