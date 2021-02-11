import java.util.*;
public class MapIntroDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maps cannot contain duplicate values//
         /* 1.hash Map(1.2) it is fast.allows one null key
          * 2.keys and value
          * 3.put and get method
          * contains and containsValue
          * 4.map(interface) entry(interface)  
          * 5.hash table(from starting) it is slow.not allows null key       */
		Map<Integer,String> mymap = new HashMap<Integer,String>(); 
		mymap.put(11,"jaya");
		mymap.put(2,"sri");
		mymap.put(0,"sam");
		mymap.get(11);
		
	}

}
