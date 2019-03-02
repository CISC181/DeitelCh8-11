package ch08solutions.ex08_07;

// Exercise 8.7 Solution: Time2Test.java
// Demonstrating the Time2 class set and get methods
import java.util.Scanner;

public class Time2Test {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      Time2 time = new Time2();

      System.out.println("Enter the time");
      System.out.print("Hours: ");
      time.setHour(input.nextInt());
      System.out.print("Minutes: ");
      time.setMinute(input.nextInt());
      System.out.print("Seconds: ");
      time.setSecond(input.nextInt());
      
      int choice = getMenuChoice();
      
      while (choice != 5) {
         switch (choice) {
            case 1: // add 1 second
               time.tick();
               break;
               
            case 2: // add 1 minute
               time.incrementMinute();
               break;
            
            case 3: // and 1 hour
               time.incrementHour();
               break;
               
            case 4: // add arbitrary seconds
               System.out.print("Enter seconds to tick: ");
               int ticks = input.nextInt();
               
               for (int i = 0; i < ticks; i++) {
                  time.tick();
               }
               
               break;
         } 
         
         System.out.printf("Hour: %d  Minute: %d  Second: %d%n",
            time.getHour(), time.getMinute(), time.getSecond());
         System.out.printf("Universal time: %s   Standard time: %s%n",
            time.toUniversalString(), time.toString());
         
         choice = getMenuChoice();
      }      
   } 

   // prints a menu and returns a value corresponding to the menu choice
   private static int getMenuChoice() {
      Scanner input = new Scanner(System.in);
      
      System.out.println("1. Add 1 second");
      System.out.println("2. Add 1 minute");
      System.out.println("3. Add 1 hour");
      System.out.println("4. Add seconds");
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
