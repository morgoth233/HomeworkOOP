package College;

public class Student {

	public String name;
	public StudentGroup subject;
	double grade;
	public int yearInCollege;
	private int age;
	public boolean isDegree;
	public double money;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Student(){
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}
	
	Student(String name, StudentGroup subject, int age){
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
