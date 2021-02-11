package jaya;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Listfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //jagged arrays//
		int[][] table={
				{ 1},
				{1,2,3}
		};
		for(int[] tables: table) {
			for(int tabless:tables) {
			System.out.println(tabless);
		}
	}
	//List from array by using//
    //1)Arrays.asList method()//	
		String[] g = {"jaya","jayan","etc","ahha"};
		List<String> li = new ArrayList<String> (Arrays.asList(g));
		System.out.println(li);
	//we can also add extra elements to the list//
		li.add("jeevana");
		li.add("good");
		System.out.println(li);
	//2)addAll()
		String[] h = {"jaya","jayan","etc","ahha"};
		List<String> list = new ArrayList<String> ();
		list.addAll(Arrays.asList(h));
		System.out.println(list);
	//3)collections.addAll()
		
		String[] j = {"jaya","jayan","etc","ahha"};
		List<String> lists = new ArrayList<String> ();
		Collections.addAll(lists,j);
		System.out.println(lists);
	//use of Arrays.asList().contains()	
	Integer[] arr = {1, 2, 3}; // object array of Integer (wrapper for int)//
	System.out.println(Arrays.asList(arr).contains(1));
	}


}
