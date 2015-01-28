package ba.bitcamp.exercise.Benjo.XMLpractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedList;

public class NewPersonTest {

	public static void main(String[] args) {
		
		Person p1= new Person("Emina", "M.");
		Person p2= new Person("Naida", "D.");
		Person p3= new Person("Nedim", "O.");
		Person p4= new Person("Adnan", "S.");
		Person p5= new Person("Hikmet", "D.");
		Person p6= new Person("Jesenko", "G.");		
		
		// add kids:
		
		// Emina
		p1.addChild(new Person ("Rambo", "M."));
		p1.addChild(new Person ("Sumaher", "M."));
		// Naida
		p2.addChild(new Person ("Necko", "D."));
		p2.addChild(new Person ("Zlocko", "D."));
		// Nedim
		p3.addChild(new Person ("Nada", "O."));
		// Adnan
		p4.addChild(new Person ("Aida", "S."));
		// Hikmet
		p5.addChild(new Person ("Necko", "D."));
		p5.addChild(new Person ("Zlocko", "D."));
		// Jesenko
		p6.addChild(new Person ("Zina", "G."));
		p6.addChild(new Person ("Lara", "G."));
		p6.addChild(new Person ("Necko", "D."));
		p6.addChild(new Person ("Maja", "D."));
		
		LinkedList<Person> people =  new LinkedList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		
//		System.out.println(people.toString());
		
		try {
			Person.personToXML(people, new FileOutputStream("./XML/peopleChild.xml"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
