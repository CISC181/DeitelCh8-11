package ch10solutions.ex10_15;

// Exercise 10.15 Solution: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest  {
   public static void main(String[] args)  {
      // create five-element Employee array
      Employee[] employees = new Employee[5]; 

      // initialize array with Employees
      employees[0] = new SalariedEmployee(
         "John", "Smith", "111-11-1111", 800.00);
      employees[1] = new HourlyEmployee(
         "Karen", "Price", "222-22-2222", 16.75, 40);
      employees[2] = new CommissionEmployee(
         "Sue", "Jones", "333-33-3333", 10000, .06); 
      employees[3] = new BasePlusCommissionEmployee(
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300);
      employees[4] = new PieceWorker(
         "Rick", "Bridges", "555-55-5555", 2.25, 400);

      System.out.println("Employees processed polymorphically:\n");
      
      // generically process each element in array employees
      for (Employee currentEmployee : employees) {
         System.out.println(currentEmployee); // invokes toString
         System.out.printf(
            "earned $%,.2f\n\n", currentEmployee.earnings());
      }
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
