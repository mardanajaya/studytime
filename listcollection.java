package jaya;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class listcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer>values = new ArrayList<Integer>();
			values.add(2);
			values.add(3);
			values.add(4);
			values.remove(0);
			
			System.out.println(values);//prints like list
			
			for(Object value:values) { //using loop and iterating the values;
				System.out.println(value);
			}
		
	values.add(456);//adding one more value
	
	Iterator i = values.iterator(); //using iterator inteface and its methods hasNext and next
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	//List <object>
	Integer[] nums=new Integer[] {1,2,3}; 
	String[] names=new String[] {"jaya","sri","vani","veena"};
	List<Object[]> list=new ArrayList<>();
	list.add(nums);
	list.add(names);
	for( Object[] a : list ) {
		for(Object j : a) {
			System.out.println(j);
		}
		System.out.println("\n");
	}
	
	
	}


	}


