package Task.Employee;

public class Demo {

	public static void main(String[] args) {
		
		Task study = new Task("study",8);
		Task clean = new Task("clean",16);
		Task sleep = new Task("sleep",24);
		Task workout = new Task("workout",32);
		Task fight = new Task("fight",34);
		Task eat = new Task("eat",44);
		Task drink = new Task("drink",54);
		Task read = new Task("read",12);
		Task code = new Task("code",24);
		Task draw = new Task("draw",16);
		
		AllWork allTasks = new AllWork();
		
		allTasks.addTask(study);
		allTasks.addTask(clean);
		allTasks.addTask(sleep);
		allTasks.addTask(workout);
		allTasks.addTask(fight);
		allTasks.addTask(eat);
		allTasks.addTask(drink);
		allTasks.addTask(read);
		allTasks.addTask(code);
		allTasks.addTask(draw);
				
//		allTasks.tasks[0] = study;
//		allTasks.tasks[1] = clean;
//		allTasks.tasks[2] = sleep;
//		allTasks.tasks[3] = workout;
//		allTasks.tasks[4] = fight;
//		allTasks.tasks[5] = eat;
//		allTasks.tasks[6] = drink;
//		allTasks.tasks[7] = read;
//		allTasks.tasks[8] = code;
//		allTasks.tasks[9] = draw;
				
		Employee misho = new Employee("Misho");
		Employee pesho = new Employee("Pesho");
		Employee gosho = new Employee("Gosho");
		Employee kiro = new Employee("Kiril");
		
		Employee[] AllEmploiees = new Employee[4];
		AllEmploiees[0] = misho;
		AllEmploiees[1] = pesho;
		AllEmploiees[2] = gosho;
		AllEmploiees[3] = kiro;
		
		while(!(allTasks.isAllWorkDone())){
			//day counter
			System.out.println("new work day starts");
			for (int i = 0; i < AllEmploiees.length; i++) {
				AllEmploiees[i].startWorkingDay();
				for (int j = 0; j < AllEmploiees.length; j++) {
					AllEmploiees[j].setCurrentTask(allTasks.getNextTask());
					AllEmploiees[j].work();
					System.out.println(AllEmploiees[j].getName() + " start working on task " +  AllEmploiees[j].getCurrentTask().name);
					allTasks.currentUnassignedTask++;
				}
			}
			
		}
		System.out.println("All work is done");
	}

}
