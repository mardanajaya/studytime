package jaya;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableEmptyListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flowers flowers = new Flowers();
	      System.out.println(flowers);
	      flowers = new Flowers("Rose", "Violet", "Marigold");
	      System.out.println(flowers);
	   }
	}



class Flowers
{
   private List<String> flowers;

   Flowers()
   {
      flowers = Collections.emptyList();
   }

   Flowers(String... flowerNames)
   {
      flowers = new ArrayList<String>();
      for (String flowerName: flowerNames)
         flowers.add(flowerName);
   }

   //@Override
   public String toString()//object class method to print the whole constructor in main method we use this//
   {
      return flowers.toString();
   }
}


