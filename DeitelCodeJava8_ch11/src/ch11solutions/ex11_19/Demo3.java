package ch11solutions.ex11_19;

// Exercise 11.19 Solution: Demo3.java
// Constructor that throws an exception.

class SomeClass {
   // constructor throws exception
   public SomeClass() throws Exception {
      throw new Exception();
   } 
} 

public class Demo3 {
   public static void main(String[] args) {
      SomeClass testObject;

      try { // instantiate SomeException object 
         testObject = new SomeClass();
      } 
      catch (Exception exception) {
         System.out.println(exception);
      }
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