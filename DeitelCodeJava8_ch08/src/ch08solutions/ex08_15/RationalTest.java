package ch08solutions.ex08_15;

// Exercise 8.15 Solution: RationalTest.java
// Program tests class Rational.
import java.util.Scanner;

public class RationalTest {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int numerator; // the numerator of a fraction
      int denominator; // the denominator of a fraction
      int digits; // digits to display in floating point format
      Rational rational1; // the first rational number
      Rational rational2; // second rational number
      Rational result; // result of performing an operation

      // read first fraction
      System.out.print("Enter numerator 1: ");
      numerator = input.nextInt();
      System.out.print("Enter denominator 1: ");
      denominator = input.nextInt();
      rational1 = new Rational(numerator, denominator);
      
      // read second fraction
      System.out.print("Enter numerator 2: ");
      numerator = input.nextInt();
      System.out.print("Enter denominator 2: ");
      denominator = input.nextInt();
      rational2 = new Rational(numerator, denominator);

      System.out.print("Enter precision: ");
      digits = input.nextInt();

      int choice = getMenuChoice(); // user's choice in the menu
      
      while (choice != 5) {
         switch (choice) {
            case 1:
               result = rational1.sum(rational2);
               System.out.printf("a + b = %s = %s%n",
                  result.toString(),
                  result.toFloatString(digits));
               break;
            case 2:
               result = rational1.subtract(rational2);
               System.out.printf("a - b = %s = %s%n",
                  result.toString(),
                  result.toFloatString(digits));
               break;
            case 3:
               result = rational1.multiply(rational2);
               System.out.printf("a * b = %s = %s%n",
                  result.toString(),
                  result.toFloatString(digits));
               break;
            case 4:
               result = rational1.divide(rational2);
               System.out.printf("a / b = %s = %s%n",
                  result.toString(),
                  result.toFloatString(digits));
               break;
         }
         
         choice = getMenuChoice();
      }
   }
   
   // prints a menu and returns a value corresponding to the menu choice
   private static int getMenuChoice() {
      Scanner input = new Scanner(System.in);
      
      System.out.println("1. Add");
      System.out.println("2. Subtract");
      System.out.println("3. Multiply");
      System.out.println("4. Divide");
      System.out.println("5. Exit");
      System.out.print("Choice: ");
      
      return input.nextInt();
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
