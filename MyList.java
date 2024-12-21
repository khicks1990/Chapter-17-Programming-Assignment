import java.util.ArrayList;

/**
   MyList Class
*/

public class MyList<T extends Number>
{
   private ArrayList<T> list;
   
   /**
      Constructor
   */
   
   public MyList()
   {
      list = new ArrayList<T>();
   }
   
   /**
      The add method adds a value to the list.
      @param value The value to add.
   */
   
   public void add(T value)
   {

   }
   
   /**
      The largest method returns the largest value
      in the list.
      @return The largest value in the list.
   */
   
   public T largest()
   {

   }

   /**
      The smallest method returns the smallets value
      in the list.
      @return The smallest value in the list.
   */
   
   public T smallest()
   {

   }
}