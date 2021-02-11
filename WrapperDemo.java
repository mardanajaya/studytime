package jaya;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i=10;
     Integer ii = new Integer(i);//Boxing in Wrapper class// ie Converting primitive to object//
     Integer value = i;////Auto boxing //converting primitive to object automatically//
     int k = ii.intValue();//unBoxing in Wrapper class//
     int l = value;//Auto Unboxing //
     System.out.println(ii);
     System.out.println(value);
     System.out.println(l);
	}

}
