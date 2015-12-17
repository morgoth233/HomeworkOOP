package College;

public class StudentGroup {

	public String groupSubject;
	public Student[] students;
	public int freePlaces;

	StudentGroup() {
		students = new Student[4];
		freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if (s.subject.groupSubject.equals(this.groupSubject) && this.freePlaces > 0) {
			for (int i = 0; i < this.students.length; i++) {
				if (this.students[i] == null) {
					this.students[i] = s;
					break;
				}
			}
			this.freePlaces--;
		}
	}

	void emptyGroup() {
		for (int i = 0; i < this.students.length; i++) {
			this.students[i] = null;
		}
		this.freePlaces = 5;
	}
	
	String theBestStudent(){
		Student theBestStudent = students[0];
		for (int i = 0; i < this.students.length && this.students[i] != null; i++) {
			if (theBestStudent.grade < this.students[i].grade) {
				theBestStudent = this.students[i];
			}
		}
		return theBestStudent.name;
	}
	
	void printStudentsInGroup(){
		int i = 0;
		while(i<this.students.length && students[i] != null){
			System.out.println("Name: " + this.students[i].name);
			System.out.println("Years: " + this.students[i].getAge());
			System.out.println("Subject: " + this.students[i].subject.groupSubject);
			System.out.println("Grade: " + this.students[i].grade);
			System.out.println("Money: " + this.students[i].money);
			System.out.println("Year in College: " + this.students[i].yearInCollege);
			System.out.println("");
			System.out.println();
			i++;
		}
		if (i==0) {
			System.out.println("No students in the group");
		}
	}
	
}
