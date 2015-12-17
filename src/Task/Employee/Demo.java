package Task.Employee;

public class Demo {

	public static void main(String[] args) {
		Task study = new Task("study",999);
		Employee misho = new Employee("Misho");
		misho.setCurrentTask(study);
		misho.setHoursLeft(1000);
		misho.showReport();
		misho.work();
		misho.showReport();
	}

}
