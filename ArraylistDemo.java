package jaya;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ArraylistDemo {
	public static void main(String args[]) {
		List<String> names = new ArrayList<>(Arrays.asList("Clementine", "Duran", "Mike"));
		names.forEach(System.out::println);
	}
	

}
