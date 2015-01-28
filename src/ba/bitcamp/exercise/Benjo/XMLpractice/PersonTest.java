package ba.bitcamp.exercise.Benjo.XMLpractice;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PersonTest {

	public static void main(String[] args) {
		Person p1= new Person("Emina", "M.");
		Person p2= new Person("Naida", "D.");
		Person p3= new Person("Nedim", "O.");
		Person p4= new Person("Adnan", "S.");
		Person p5= new Person("Hikmet", "D.");
		Person p6= new Person("Jesenko", "G.");
		
		LinkedList<Person> people =  new LinkedList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		
//		System.out.println(people.toString());
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
		
//		Person.personToXML(people, new DataOutputStream(System.out));
		try {
			Person.personToXML(people, new FileOutputStream("./XML/people.xml"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
