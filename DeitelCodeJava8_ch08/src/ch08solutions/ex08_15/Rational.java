package ch08solutions.ex08_15;

// Exercise 8.15 Solution: Rational.java
// Rational class definition.
// NOTE: We assume all Rational numbers are positive numbers in 
// this solution.

public class Rational {
   private int numerator; // numerator of the fraction
   private int denominator; // denominator of the fraction

   // no-argument constructor, initializes this Rational to 1
   public Rational() {
      this(1, 1);
   }
   
   // initialize numerator part to n and denominator part to d
   public Rational(int numerator, int denominator) {
      this.numerator = numerator;
      this.denominator = denominator;
      reduce();
   }
   
   // add two Rational numbers
   public Rational sum(Rational right) {
      int resultDenominator = denominator * right.denominator;
      int resultNumerator = numerator * right.denominator +
         right.numerator * denominator;

      return new Rational(resultNumerator, resultDenominator);
   }
   
   // subtract two Rational numbers
   public Rational subtract(Rational right) {
      int resultDenominator = denominator * right.denominator;
      int resultNumerator = numerator * right.denominator -
         right.numerator * denominator;

      return new Rational(resultNumerator, resultDenominator);
   }
   
   // multiply two Rational numbers
   public Rational multiply(Rational right) {
      return new Rational(numerator * right.numerator,
         denominator * right.denominator);
   }
   
   // divide two Rational numbers
   public Rational divide(Rational right) {
      return new Rational(numerator * right.denominator,
         denominator * right.numerator);
   }
   
   // reduce the fraction
   private final void reduce() {
      int gcd = 0;
      int smaller;

      // find the greatest common denominator of the two numbers
      smaller = Math.min(numerator, denominator);

      for (int divisor = smaller; divisor >= 2; divisor--) {
         if (numerator % divisor == 0 && denominator % divisor == 0) {
            gcd = divisor;
            break;
         }
      }

      // divide both the numerator and denominator by the gcd
      if (gcd != 0) {
         numerator /= gcd;
         denominator /= gcd;
      }
   }

   // return String representation of a Rational number
   public String toString() {
      return numerator + "/" + denominator;
   }

   // return floating-point String representation of
   // a Rational number
   public String toFloatString(int digits) {
      double value = (double) numerator / denominator;
      // builds a formatting string that specifies the precision
      // based on the digits parameter
      return String.format("%." + digits + "f", value);
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
