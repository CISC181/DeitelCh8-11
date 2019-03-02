package ch11solutions.ex11_17;

// Exercise 11.17 Solution: Demo2.java
// Catching Exception exception.
import java.io.IOException;

public class Demo2 {
   // execute application
   public static void main(String[] args) {
      try {
         throw new ExceptionA();
      } 
      catch (Exception exception) {
         System.out.println(exception);
      }

      try {
         throw new ExceptionB();
      } 
      catch (Exception exception) {
         System.out.println(exception);
      } 

      try {
         throw new NullPointerException();
      }
      catch (Exception exception) {
         System.out.println(exception);
      } 

      try {
         throw new IOException();
      }
      catch (Exception exception) {
         System.out.println(exception);
      } 
   } 
}

// subclass of Exception
class ExceptionA extends Exception {
   // empty class body
} 

// subclass of ExceptionA
class ExceptionB extends ExceptionA {
   // empty class body
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