package jaya;
import java.util.Arrays;

public class CastingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] doubles = { 1, 2, 3 };
		for(int j:doubles) {
			System.out.println(doubles);
			}
		double[] numbers = Arrays.copyOf(doubles,doubles.length, Integer[].class);
		for(int i:numbers) {
		System.out.println(numbers);
		}
	}

}
