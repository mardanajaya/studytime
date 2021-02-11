package jaya;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeClass sc = new SomeClass();

		 // These statement won't compile because SomeClass#variable is private:
		 //sc.variable = 7;
		 //System.out.println(sc.variable);
		 // Instead, you should use the public getter and setter:
		 sc.setVariable(7);
		 System.out.println(sc.getVariable());
	}

}
class SomeClass {
	 private int variable;
	 public int getVariable() {
	 return variable;
	 }
	 public void setVariable(int variable) {
	 this.variable = variable;
	 }
	}