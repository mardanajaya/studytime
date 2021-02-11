package java8;

public class demo1 {
	
	public static void main(String[] args) {
		demo1 d =new demo1();
		
		mylambda lambdafunction = ()->System.out.println("hello world");
		lambdafunction.foo();
		
	}

}
interface mylambda{
	void foo();
}