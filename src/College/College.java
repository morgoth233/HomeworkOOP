package College;

public class College {

	public static void main(String[] args) {
		
		Student pesho = new Student("Pesho","Java", 19);
		Student gosho = new Student("Gosho","Java", 21);
				
		StudentGroup java = new StudentGroup("Java");
		StudentGroup web = new StudentGroup("Web Development");
		
		
		java.addStudent(pesho);
		java.addStudent(gosho);
		java.printStudentsInGroup();
	}

}
