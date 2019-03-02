package ch08solutions.ex08_06;

// Exercise 8.6 Solution: SavingAccount
// SavingAccount class definition

public class SavingsAccount {
   // interest rate for all accounts
   private static double annualInterestRate = 0;
   
   private double savingsBalance; // balance for currrent account

   // constructor, creates a new account with the specified balance
   public SavingsAccount(double savingsBalance) {
      if (savingsBalance < 0.0) {
         throw new IllegalArgumentException("savingsBalance must be non-negative");
      }

      this.savingsBalance = savingsBalance;
   } 

   // calculate monthly interest based on savingsBalance and annualInterestRate
   public void calculateMonthlyInterest() {
      savingsBalance += savingsBalance * (annualInterestRate / 12.0);
   }
   
   // modify interest rate
   public static void modifyInterestRate(double newRate) {
      if (newRate >= 0 && newRate <= 1.0) {
         annualInterestRate = newRate;
      }
      else {
         throw new IllegalArgumentException("rate must be 0.0-1.0");
      }
   } 

   // get string representation of SavingsAccount
   public String toString() {
      return String.format("$%.2f", savingsBalance);
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
