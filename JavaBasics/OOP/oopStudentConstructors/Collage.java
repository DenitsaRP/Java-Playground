package oopStudentConstructors;

public class Collage {

	public static void main(String[] args) {

		Student spiro = new Student("Spiridon", 22, "mathematics");
		spiro.grade = 5.6;
		spiro.yearInCollage = 3;
		spiro.money = 120.80;

		Student mina = new Student("Mina", 19, "mathematics");
		mina.grade = 6;
		mina.yearInCollage = 2;
		mina.money = 520.40;

		Student ivan = new Student("Ivan", 20, "english");
		ivan.money = 1200.20;
		ivan.yearInCollage = 4;

		Student rali = new Student("Ralitsa", 23, "mathematics");
		rali.grade = 4.5;
		rali.money = 80.1;

		Student kali = new Student("Kalina", 26, "mathematics");
		kali.grade = 5.8;
		kali.yearInCollage = 4;
		kali.money = 568;

		Student vesko = new Student("Veselin", 33, "mathematics");
		vesko.grade = 4.25;
		vesko.yearInCollage = 2;
		vesko.money = 1230.88;

		Student yana = new Student("Yana", 25, "mathematics");
		yana.money = 658.4;

		rali.upYaer();
		System.out.println();
		
		spiro.upYaer();
		System.out.println();

		System.out.println("Could Kali get scolarship and how much money does she have?");
		System.out.println("Before scolarship, Kali has " + kali.money + " in her account");
		System.out.println("After scolarship Kali has " + kali.receiveScholarship(4.5, 250.20) + " in her account");
		System.out.println();
		
		System.out.println("Before scolarship, " + vesko.name + " has " + vesko.money + " in his account");
		System.out.println(vesko.receiveScholarship(4, 250.2));
		System.out.println();
		
		StudentGroup math = new StudentGroup("mathematics");
		
		math.addStudent(spiro);
		math.addStudent(mina);
		math.addStudent(vesko);
		math.addStudent(kali);
		math.addStudent(ivan);
		math.addStudent(yana);
		math.addStudent(rali);
		System.out.println();
		
		math.printStudentsInGroup();
		System.out.println();
		
		System.out.print("the best student in mathematics group is: ");
		System.out.print(math.theBestStudent());
		System.out.println();
		
		//math.emptyGroup();
		//math.printStudentsInGroup();
		
		
		
		
		
	}

}
