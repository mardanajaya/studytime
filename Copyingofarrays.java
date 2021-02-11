package jaya;
import java.util.Arrays;

public class Copyingofarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //1.for loops
		int[] a = { 4, 1, 3, 2 };
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
		 b[i] = a[i];
		}
		for(int bs : b) {
			System.out.println(bs);
		}
	//2.by object.clone() method
		int[] c = { 4, 1, 3, 2 };
		int[] d = c.clone(); // [4, 1, 3, 2]
		System.out.println(c[0]==d[0]);
		for(int ds : d) {
			
			System.out.println(ds);
		}
	
	//3.Arrays.copyof()
		int[] e = {4, 1, 3, 2};
		int[] f = Arrays.copyOf(e, e.length); 
		
	for(int fs:f) {
		System.out.println(fs);
	}
	//4.system.arraycopy//(Object src, int srcPos, Object dest, int destPos, int length)//

	int[] g = { 4, 1, 3, 2 };
	int[] h = new int[ g.length];
	System.arraycopy(g, 0, h, 0,  g.length); 
	for(int hs:h) {
		System.out.println(hs);
	}
	int[] i = { 4, 10, 30, 20 };
	int[] j = Arrays.copyOfRange(i, 2, i.length); 
	for(int js:j) {
		System.out.println(js);
	}
}

}
