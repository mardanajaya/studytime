package jaya;

public class varargsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo1 obj=new Demo1();
      obj.takeobj(2,3,4,5);
      obj.takeobj(2);
	}
}
class Demo1
{
   public void takeobj(int ... a) {//varargs...(allowing multiple arguments without using an array
	   //but similar as array.Before varargs either we use overloaded method or take an array as the metho//
	   for(int i : a) {
     System.out.println("What"+i);
	   }
    }
   public void takeobj(int a) {//but one single argument is passed the normal args takes precedence over the varargs//
	  
     System.out.println(a);
	  
    }
 }
//Rules for varargs://
/*There can be only one variable argument in the method.
Variable argument (varargs) must be the last argument.*/

