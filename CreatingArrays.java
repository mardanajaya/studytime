package jaya;
import java.util.Arrays;

public class CreatingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  */
		// Array of type1//
		/*  */
		double[] header = new double[] { 4.56, 332.267, 7.0, 0.3367, 10.0 };
		for(double i:header) {
		System.out.println(i);
		}
		/*  */
		//Array of type 2//
		/*  */
		int[] array = new int[5];
		Arrays.setAll(array, i ->i);
		
		for(int i : array) {
		System.out.println(i);
		}
		/*  */
		 //Array of type3//
		/*  */
		String[] obj = new String[] {"jaya","sri","jeev","pata"};
		Arrays.fill(obj,"abc");
		Arrays.fill(obj,1,3 ,"pj");
		for(String objs:obj) {
		System.out.println(objs);
		}
	}

}
