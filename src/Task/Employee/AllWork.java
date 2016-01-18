package Task.Employee;

public class AllWork {
	
	public Task[] tasks;
	protected int freePlacesForTasks;
	protected int currentUnassignedTask;
	
	AllWork(){
		tasks = new Task[10];
		freePlacesForTasks = 10;
		currentUnassignedTask = 0;
	}
	
	void addTask(Task newTask){
		tasks[-(freePlacesForTasks-10)] = newTask; 
		freePlacesForTasks--;
	}
	
	Task getNextTask(){
		if (currentUnassignedTask > tasks.length) {
			System.out.println("no more tasks");
			return null;
		}
		return tasks[currentUnassignedTask];
	}
	
	boolean isAllWorkDone(){
		for (int i = 0; i < tasks.length; i++) {
			if (tasks[i].workingHours == 0) {
				continue;
			} else { 
				return false;
			}
		}
		return true;
	}
	

}
