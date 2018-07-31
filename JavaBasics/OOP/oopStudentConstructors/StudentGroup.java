package oopStudentConstructors;

public class StudentGroup {
	
	String groupSubject;
	Student[] students;
	int freePlaces;
	
	StudentGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	StudentGroup(String groupSubject){
		this();
		this.groupSubject = groupSubject;
	}
	
	void addStudent(Student s) {
		if(s.subject.equalsIgnoreCase(groupSubject)) {
			if (this.freePlaces == 0) {
				System.out.println("Thre is no free place in " + groupSubject + " for " + s.name);
			} else {
				this.students[students.length - this.freePlaces] = s;
				this.freePlaces--;	
				System.out.println(s.name + " is sighed in " + groupSubject + " class");

			}
		} else {
			System.out.println(s.name + " has to sign in " + s.subject + " group.");
		}
	}
	
	void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
		System.out.println("There is new group for subject " + this.groupSubject);
	}
	
	String theBestStudent() {
		double maxGrade = this.students[0].grade;
		String nameOfBestStudentGrade = this.students[0].name;
		for (int i = 1; i < this.students.length; i++) {
			if (this.students[i].grade > maxGrade) {
				maxGrade = this.students[i].grade;
				nameOfBestStudentGrade = this.students[i].name;
			}
		}
		return nameOfBestStudentGrade;
	}
	
	void printStudentsInGroup() {
		for (int i = 0; i < this.students.length - freePlaces; i++) {
			System.out.print("Name: " + this.students[i].name + "; ");
			System.out.print("Grade: " + this.students[i].grade + "; ");
			System.out.print("Age: " + this.students[i].age + "; ");
			System.out.print("Year in collage: " + this.students[i].yearInCollage + "; ");
			System.out.print("Is degree - " + this.students[i].isDegree + "; ");
			System.out.println();
		}
		if(this.students.length -freePlaces == 0) {
			System.out.println("No one is signed for this group");
		}
		
	}

}
