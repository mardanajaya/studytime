package java8;
import java.util.Arrays;
import java.util.List;

public class demo3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//this is using java 7
    List<Integer> listofintegers=Arrays.asList(2,3,4,5,6);
    
    
    System.out.println(printsavgoflist(listofintegers));
    
    
	}
	protected static int printsavgoflist(List<Integer> listofintegers) {
		return  (int) listofintegers.stream().mapToInt(i->i).average().orElse(0);
		/*int sum=0;
		if(!listofintegers.isEmpty()) {
			
			for(int i:listofintegers) {
		    	sum=sum+i;
		    }
			float avg=(float) sum/listofintegers.size();
			return avg;
		}
		 
		return 0;*/
	}

    
	
	
}
		
