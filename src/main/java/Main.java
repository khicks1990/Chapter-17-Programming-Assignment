/**
   MyList Class Test Program
*/

public class Main
{
   public static void main(String[] args)
   {
      // Create an instance of MyList to hold Integers.
      MyList<Integer> ilist = new MyList<>();

      // Add some values to the list.
      ilist.add(7);
      ilist.add(2);
      ilist.add(9);
      ilist.add(1);
      ilist.add(12);

      // Get the largest and smallest values in the list.
      System.out.println("The largest value in ilist is " +
                         ilist.largest());
      System.out.println("The smallest value in ilist is " +
                         ilist.smallest());

      // Create an instance of MyList to hold doubles.
      MyList<Double> dlist = new MyList<Double>();

      // Add some values to the list.
      dlist.add(14.7);
      dlist.add(2.1);
      dlist.add(98.6);
      dlist.add(1.1);
      dlist.add(12.5);

      // Get the largest and smallest values in the list.
      System.out.println("The largest value in dlist is " +
                         dlist.largest());
      System.out.println("The smallest value in dlist is " +
                         dlist.smallest());
   }
}