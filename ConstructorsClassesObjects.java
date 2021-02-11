package jaya;

public class ConstructorsClassesObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Classes describe the behaviour and state(methods) of an object
		 * 1.method overloading(same name of methods but different functionality or different parameters or
		 *  different parameters with different datatypes or return type or order of parameters
		 * 2.method overrriding(same name without any change in above parameters)
		 * Note: Methods cannot be overloaded by changing just the return type (int method() is considered the same as String
method() and will throw a RuntimeException if attempted). If you change the return type you must also change the
parameters in order to overload.
		 */


		Shape b1 = new Shape();
	
		
		System.out.println(b1.area(10,10));
		System.out.println(b1.area(10));
	
		

	}

	
}
class Shape{
	 //It could be a circle or rectangle or square
	 private String type;
	 int length;
	 int breadth;
	 int radius;
	 
	 

	 

	 //To calculate area of rectangle
	 public int area(int length,int breadth){
	 return  (length * breadth);
	 }

	 //To calculate area of a circle
	 public int  area(int radius){
	 return (int)( 3.14 * radius * radius);
	 }
	}
