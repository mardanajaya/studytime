package jaya;

public class ConstructorsClassesObjects2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.method overriding//
		
		//This will create an object of circle class
		 Shape1 circle = new Circle();
		 //This will create an object of Rectangle class
		 Shape1 rectangle = new Rectangle();

		 // Drumbeats ......
		 //This should print 78.5
		 System.out.println("Shape of circle : "+circle.area());
		 //This should print 50.0
		 System.out.println("Shape of rectangle: "+rectangle.area()); 
	}

}
abstract class Shape1{

	 public abstract Double area();
	}
class Circle extends Shape1 {
	 private Double radius = 5.0;
	 // See this annotation @Override, it is telling that this method is from parent
	 // class Shape and is overridden here
	 @Override
	 public Double area(){
	 return 3.14 * radius * radius;
	 }
	
}
class Rectangle extends Shape1 {
	 private Double length = 5.0;
	 private Double breadth= 10.0;
	 // See this annotation @Override, it is telling that this method is from parent
	 // class Shape and is overridden here
	 @Override
	 public Double area(){
	 return length * breadth;
	 }
}
