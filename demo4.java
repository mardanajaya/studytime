package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Person> listofstrings= new ArrayList();

      listofstrings.add(new Person("jaya"));
      listofstrings.add(new Person("abi"));
      listofstrings.add(new Person("avara"));
      listofstrings.add(new Person("badhu"));
      listofstrings.add(new Person("ara"));
      
      
      getConditionalString(listofstrings,p->p.getName().startsWith("a")&&p.getName().length()==3);
	}

	private static void getConditionalString(List<Person> listofstrings,Predicate<Person> check) {
		// TODO Auto-generated method stub
		for(Person person : listofstrings) {
			if(check.test(person)) {
				System.out.println(person.getName());
			}
		}
		
	}
}

class Person {
Person getName;
private String name;

public Person(String name) {
this.name = name;

}

public String getName() { 
	return name; 
}
}
