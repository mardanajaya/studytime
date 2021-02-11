package jaya;

public class AccessModifiersDemo2 extends MyClass {

	
		public AccessModifiersDemo2(){
			 super();
			 System.out.println(super.variable);
			 }
	public static void main(String...args) {
		AccessModifiersDemo2 b = new AccessModifiersDemo2();
	
	}

}
class MyClass{
	 protected int variable; //This is the variable that we are trying to access
	 public MyClass(){
	 variable = 2;
	 }
	}
