
public class ReverseString

{

   public static void main(String[] args) {

      String string = "Roshan ";

      System.out.println("Original string: " + string);
      StringBuilder reverseString = new StringBuilder(string);
      reverseString.reverse();
      String result = reverseString.toString();
      System.out.println("Reversed string: " + result);

   }

}