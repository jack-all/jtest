import java.util.*;

/**
 * This is the first sample program in Core Java Chapter 3
 * @version 1.01 1997-03-22
 * @author Gary Cornell
 */
public class FirstSample
{

   public static void main(String[] args)
   {
      Integer i = 10;
      Integer j = 100;

      int hashcode;
      hashcode = Objects.hash(i);
      System.out.print(hashcode);

   }
}

