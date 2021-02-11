package jaya;

public class toStringmethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Fruits f = new Fruits("Mango","Apple");
       System.out.println(f);//without tostring method//it prints package name follewed by classname with the object placed hexadecimal hash code//
       System.out.println(f.seasonal);//it prints mango//
       //but in order to print the total constructor only by using object is done as below by toString method//
       System.out.println(f);
	}

}
class Fruits{
	String seasonal;
	String Unseasonal;
    public Fruits(String seasonal,String Unseasonal) {
    	this.seasonal=seasonal;
    	this.Unseasonal=Unseasonal;
    }
    //@overide
    public String toString() {
    	return seasonal+" "+Unseasonal;
    }
}
