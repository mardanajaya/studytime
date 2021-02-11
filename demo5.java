package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persons> personList = new ArrayList<Persons>();
		personList.add(new Persons("Jeroen"));
		personList.add(new Persons("bajab"));
		personList.add(new Persons("avava"));
		print(personList, p ->  p.getName().contentEquals(p.getName().substring(p.getName().length()-1, 0)));
		}
		private static void print(List<Persons> personList, Predicate<Persons> checker) {
		for (Persons person : personList) {
		if (checker.test(person)) {
		System.out.print(person.getName() + " matches your expression.");
		} else {
		System.out.println(person.getName() + " doesn't match your expression.");
		}
		}
	}
}

class Persons {
private String name;

public Persons(String name) {
this.name = name;

}

public String getName() { return name; }
}