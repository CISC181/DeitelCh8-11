package ch11solutions.ex11_20;

// Exercise 11.20 Solution: Demo4.java
// Rethrowing an exception.

public class Demo4 {
   public static void main(String[] args) {
      try { // call someMethod 
         someMethod();
      }
      catch (Exception exception) {
          System.err.printf("%s\n\n", exception.getMessage());
          exception.printStackTrace();
      }
   } 

   // call someMethod2; rethrow Exceptions back to main
   public static void someMethod() throws Exception {
      try { // call someMethod2 
         someMethod2();
      } 
      catch (Exception exception2) {
         throw exception2; // rethrow the Exception
      } 
   } 

   // throw Exception back to someMethod
   public static void someMethod2() throws Exception {
      throw new Exception("Exception thrown in someMethod2");
   } 
}

/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/