package java8;

import java.util.Arrays;
import java.util.List;

public class filterdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> names=Arrays.asList("jaya","swapna","vallaba","sri","teja");
     for(String name:names) {
    	 System.out.println(name);
     }
     names.stream()
     .filter(name -> !name.contentEquals("sri"))
     .forEach(System.out :: println);
     
	}
   
}
