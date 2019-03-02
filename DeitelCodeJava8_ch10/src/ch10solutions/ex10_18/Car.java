package ch10solutions.ex10_18;

// Exercise 10.18: Car.java
public class Car implements CarbonFootprint {
   private double gallons;

   public Car(double gallons) {
      this.gallons = gallons;
   } 

   // one gallon of gas yields 20 pounds of CO2
   // http://www.enviroduck.com/carbon_footprint_calculations.php
   public void GetCarbonFootprint() {
      System.out.printf("Car that has used %.2f gallons of gas: %.2f\n",
         gallons, gallons * 20);
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
 **************************************************************************/
