package ch08solutions.ex08_12;

// Exercise 8.12 Solution: DateAndTimeTest.java
// Demonstrating the DateAndTime class methods
import java.util.Scanner;

public class DateAndTimeTest  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the date and time");
      System.out.print("Month: ");
      int month = input.nextInt();
      System.out.print("Day: ");
      int day = input.nextInt();
      System.out.print("Year: ");
      int year = input.nextInt();

      System.out.print("Hours: ");
      int hour = input.nextInt();
      System.out.print("Minutes: ");
      int minute = input.nextInt();
      System.out.print("Seconds: ");
      int seconds = input.nextInt();
      
      DateAndTime dateTime = new DateAndTime(
         month, day, year, hour, minute, seconds);
      
      int choice = getMenuChoice();
      
      while (choice != 7) {
         switch (choice) {
            case 1: // add 1 second
               dateTime.tick();
               break;
               
            case 2: // add 1 minute
               dateTime.incrementMinute();
               break;
            
            case 3: // and 1 hour
               dateTime.incrementHour();
               break;
               
            case 4: // add 1 day
               dateTime.nextDay();
               break;
               
            case 5: // add 1 month
               dateTime.nextMonth();
               break;
               
            case 6: // add arbitrary seconds
               System.out.print("Enter seconds to tick: ");
               int ticks = input.nextInt();
               
               for (int i = 0; i < ticks; i++) {
                  dateTime.tick();
               }
               
               break;
         } 
         
         System.out.printf("Universal date and time: %s%n",
            dateTime.toUniversalString());
         System.out.printf("Standard date and time: %s%n",
            dateTime.toString());         
         
         choice = getMenuChoice();
      }  
   } 

   // prints a menu and returns a value corresponding to the menu choice
   private static int getMenuChoice() {
      Scanner input = new Scanner(System.in);
      
      System.out.printf("%n1. Add 1 second%n");
      System.out.println("2. Add 1 Minute");
      System.out.println("3. Add 1 Hour");
      System.out.println("4. Add 1 Day");
      System.out.println("5. Add 1 Month");
      System.out.println("6. Add seconds");
      System.out.println("7. Exit");
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
