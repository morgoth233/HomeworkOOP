package College;

public class College {

	public static void main(String[] args) {
		
		StudentGroup java = new StudentGroup("Java");
		StudentGroup web = new StudentGroup("Web Development");
		
		Student pesho = new Student("Pesho",java, 19);
		Student gosho = new Student("Gosho",java, 21);
				
		
		
		
		
		java.addStudent(pesho);
		pesho.upYear();
		java.addStudent(gosho);
		pesho.grade = 4.5;
		pesho.receiveScholarship(4.5, 100);
		java.printStudentsInGroup();
		System.out.println("The best Student is: " + java.theBestStudent());
		java.emptyGroup();
		java.printStudentsInGroup();
	}

}
