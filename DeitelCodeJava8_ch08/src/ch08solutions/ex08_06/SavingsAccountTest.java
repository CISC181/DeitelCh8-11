package ch08solutions.ex08_06;

// Exercise 8.6 Solution: SavingsAccountTest.java
// Program that tests SavingsAccount class

public class SavingsAccountTest {
   public static void main(String[] args) {
      SavingsAccount saver1 = new SavingsAccount(2000);
      SavingsAccount saver2 = new SavingsAccount(3000);
      SavingsAccount.modifyInterestRate(0.04);

      System.out.println("Monthly balances for one year at .04");
      System.out.println("Balances:");
      
      System.out.printf("%20s%10s%n", "Saver 1", "Saver 2");
      System.out.printf("%-10s%10s%10s%n", "Base",
         saver1.toString(), saver2.toString());
      
      for (int month = 1; month <= 12; month++) {
         String monthLabel = String.format("Month %d:", month);
         saver1.calculateMonthlyInterest();
         saver2.calculateMonthlyInterest();

         System.out.printf("%-10s%10s%10s%n", monthLabel,
            saver1.toString(), saver2.toString());
      } 

      SavingsAccount.modifyInterestRate(.05);
      saver1.calculateMonthlyInterest();
      saver2.calculateMonthlyInterest();
      
      System.out.printf(
         "%nAfter setting interest rate to .05 and calculating monthly interest%n");
      System.out.println("Balances:");
      System.out.printf("%-10s%10s%n", "Saver 1", "Saver 2");
      System.out.printf("%-10s%10s%n",
         saver1.toString(),  saver2.toString());
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
