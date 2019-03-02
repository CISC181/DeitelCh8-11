package ch08solutions.ex08_11;

// Exercise 8.11: ComplexTest.java
// Test the Complex number class

public class ComplexTest {
   public static void main(String[] args) {
      // initialize two numbers
      Complex a = new Complex(9.5, 7.7);
      Complex b = new Complex(1.2, 3.1);
 
      System.out.printf("a = %s%n", a.toString());
      System.out.printf("b = %s%n", b.toString());
      System.out.printf("a + b = %s%n", a.add(b).toString());
      System.out.printf("a - b = %s%n", a.subtract(b).toString());
   } 
}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
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
