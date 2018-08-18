package oopPersonInheritance;

import oopNaSelo.Animal;

public class Demo {

	public static void main(String[] args) {
		Person[] hora = new Person[10];

		Person ivo = new Person("Ivo", 20, true);
		Person minka = new Person("Minka", 15, false);

		Student miro = new Student("Miro", 14, true, 4.8);
		Student ani = new Student("Ani", 22, false, 6);

		Employee krasi = new Employee("Krasi", 34, true, 85);
		Employee radka = new Employee("Radka", 26, false, 145);

		hora[0] = ivo;
		hora[1] = minka;
		hora[2] = miro;
		hora[3] = ani;
		hora[4] = krasi;
		hora[5] = radka;

		for (int i = 0; i < hora.length; i++) {
			if (hora[i] != null) {
				hora[i].showPersonInfo();
				System.out.println();
			}
		}

		for (int i = 0; i < hora.length; i++) {
			if (hora[i] instanceof Employee) {
				Employee temp = (Employee) hora[i];
				System.out.println(temp.name + " works 2 extra hours." );
				System.out.println(temp.name + " gets for overtime " + temp.calculteOvertime(2) + "lv");
			}
		}

	}

}
