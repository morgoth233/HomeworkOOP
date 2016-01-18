package Task.Employee;

public class Demo {
	
//zadachata ne e syvsem gotova i ne raboti kakto trqbva, shte si q doopravq v git

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
			
		
		Employee misho = new Employee("Misho");
		Employee pesho = new Employee("Pesho");
		Employee gosho = new Employee("Gosho");
		Employee kiro = new Employee("Kiril");
		
		Employee[] AllEmploiees = new Employee[4];
		AllEmploiees[0] = misho;
		AllEmploiees[1] = pesho;
		AllEmploiees[2] = gosho;
		AllEmploiees[3] = kiro;
		
		misho.setCurrentTask(allTasks.getNextTask());
		allTasks.currentUnassignedTask++;
		pesho.setCurrentTask(allTasks.getNextTask());
		allTasks.currentUnassignedTask++;
		gosho.setCurrentTask(allTasks.getNextTask());
		allTasks.currentUnassignedTask++;
		kiro.setCurrentTask(allTasks.getNextTask());
		
				
		while(!(allTasks.isAllWorkDone())){
			//day counter
			System.out.println("new work day starts");
			for (int i = 0; i < AllEmploiees.length; i++) {
				AllEmploiees[i].startWorkingDay();
			}
			for (int j = 0; j < AllEmploiees.length; j++) {
				if(AllEmploiees[j].getCurrentTask().workingHours > 0){//rabotnika si prodyljava rabota po syshtata zadacha, ako ne q e svyrshil
					AllEmploiees[j].work();
				} else {
				allTasks.currentUnassignedTask++;	
				AllEmploiees[j].setCurrentTask(allTasks.getNextTask());
				AllEmploiees[j].work();
				}
				
				
			}
			//proverka dali rabotnika ima vreme za sledvahsta zadacha
			for (int j = 0; j < AllEmploiees.length; j++) {
				while(AllEmploiees[j].getHoursLeft() > 0){
					AllEmploiees[j].setCurrentTask(allTasks.getNextTask());
					AllEmploiees[j].work();
				}
			}
			
		}
		System.out.println("All work is done");
	}

}
