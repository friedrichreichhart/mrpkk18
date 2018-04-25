package prog;

import data.Person;
import data.Student;

public class Prog {

	public static void main(String[] args) {
		new Prog();
	}
	
	public Prog() {
		//
		Person p1 = new Person();
		p1.setVorname("Anna");
		p1.setNachname("Mayer");
		p1.setFemale(true);
		System.out.println(p1);
		Person.getPersonenListe().add(p1);
		//
		Person p2 = new Person();
		p2.setVorname("Hans");
		p2.setNachname("Huber");
		//p2.setFemale(false);
		System.out.println(p2);
		Person.getPersonenListe().add(p2);
		//
		Student s1 = new Student();
		s1.setVorname("Paul");
		s1.setNachname("Rinner");
		//s1.setFemale(false);
		s1.setGrade(2018);
		System.out.println(s1);
		Person.getPersonenListe().add(s1);
		//
		//Student s2 = (Student) p2;
		Person p3 = s1;
		Person.getPersonenListe().add(p3);
		//
		System.out.println("----");
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof Student);
		System.out.println("----");
		System.out.println(s1 instanceof Person);
		System.out.println(s1 instanceof Student);
		System.out.println("----");
		System.out.println(p3 instanceof Person);
		System.out.println(p3 instanceof Student);
		//
		// for (int i = 0; i < Person.getPersonenListe().size(); i++) {
		// Person p = Person.getPersonenListe().get(i);
		// }
		for (Person p : Person.getPersonenListe()) {
			System.out.println(p.getVorname() + " " + p.getNachname());
			//
			if (p instanceof Student) {
				Student s = (Student) p;
				System.out.println(s.getGrade());
			}
		}
		//
		
		
		
	}

}
