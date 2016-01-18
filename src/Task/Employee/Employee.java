package Task.Employee;

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allwork;

	Employee(String name) {
		if (name.equals(" ")) {
			System.out.println("Invalid name");
		} else {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.equals(" ")) {
			System.out.println("Invalid name");
		} else {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft < 0) {
			System.out.println("Invalid hoursLeft");
		} else {
			this.hoursLeft = hoursLeft;
		}
	}
	
	public static AllWork getAllwork() {
		return allwork;
	}

	public static void setAllwork(AllWork allwork) {
		Employee.allwork = allwork;
	}
	
	public void startWorkingDay(){
		this.hoursLeft = 8;
	}

	public void work() {
		if (this.getCurrentTask() != null) {
			System.out.println(this.getName() + " start working on task " +  this.getCurrentTask().name);
			int workingHours = this.currentTask.getWorkingHours()- this.getHoursLeft();
			if (workingHours < 0) {
				workingHours = 0;
			}
			this.setHoursLeft(this.currentTask.getWorkingHours() > this.getHoursLeft() ? 0 : this.getHoursLeft() - this.currentTask.getWorkingHours());
			this.currentTask.setWorkingHours(workingHours);
		} else {
			System.out.println("The Employee has no task");
		}
	}



	void showReport() {
		System.out.println(this.getName());
		System.out.println(this.getCurrentTask().getName());
		System.out.println(this.getHoursLeft());
		System.out.println(this.getCurrentTask().getWorkingHours());
	}

}
