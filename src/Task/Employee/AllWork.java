package Task.Employee;

public class AllWork {
	
	public Task[] tasks;
	public int freePlacesForTasks;
	public int currentUnassignedTask;
	
	AllWork(){
		tasks = new Task[10];
		freePlacesForTasks = 10;
		currentUnassignedTask = 0;
	}
	
	void addTask(Task newTask){
		tasks[freePlacesForTasks-1] = newTask; 
		freePlacesForTasks--;
	}
	
	Task getNextTask(){
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
