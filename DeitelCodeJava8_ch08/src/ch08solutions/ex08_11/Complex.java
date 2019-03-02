package ch08solutions.ex08_11;

// Exercise 8.11 Solution: Complex.java
// Definition of class Complex

public class Complex {
   private double real;
   private double imaginary;

   // Initialize both parts to 0
   public Complex() {
      this(0.0, 0.0); 
   } 

   // Initialize real part to r and imaginary part to i
   public Complex(double r, double i) {
      real = r;
      imaginary = i;
   }

   // Add two Complex numbers
   public Complex add(Complex right) {
      return new Complex(real + right.real, 
         imaginary + right.imaginary);
   } 

   // Subtract two Complex numbers
   public Complex subtract(Complex right) {
      return new Complex(real - right.real, 
         imaginary - right.imaginary);
   }

   // Return String representation of a Complex number
   public String toString() {
      return String.format("(%.1f, %.1f)", real, imaginary);
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
