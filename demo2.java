package java8;

import java.util.List;
import java.util.Arrays;


public class demo2{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//this is using java 7
    List<Integer> listofintegers=Arrays.asList(2,3,4,5,6);
    
    
    System.out.println(printsavgoflist(listofintegers));
    
    
	}
	protected static float printsavgoflist(List<Integer> listofintegers) {
		
		int sum=0;
		if(!listofintegers.isEmpty()) {
			
			for(int i:listofintegers) {
		    	sum=sum+i;
		    }
			float avg=(float) sum/listofintegers.size();
			return avg;
		}
		 
		return 0;
	}

    
	
	
}
