package College;

public class Student {

	public String name;
	public String subject;
	double grade;
	public int yearInCollege;
	private int age;
	public boolean isDegree;
	private double money;
	
	Student(){
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}
	
	Student(String name, String subject, int age){
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	void upYear(){
		if (!this.isDegree) {
			this.yearInCollege++;
		}else{
			System.out.println("Zavyrshil");
		}
	}
		
	double receiveScholarship(double min, double amount){
		if (this.grade >= min && this.age < 30) {
			this.money+=amount;
		}
		return this.money;
	}
	
}
