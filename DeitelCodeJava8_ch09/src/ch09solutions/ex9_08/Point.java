package ch09solutions.ex9_08;

// Exercise 9.8 Solution: Point.java
// Class Point definition

public class Point { 
   private double x; // x coordinate
   private double y; // y coordinate
 
   // two-argument constructor
   public Point(double x, double y) {
      this.x = x; 
      this.y = y;
   } 

   // return x
   public double getX() {
      return x;
   } 

   // return y
   public double getY() {
      return y;
   }
   
   // return string representation of Point object
   @Override
   public String toString() {
      return String.format("(%.1f, %.1f)", getX(), getY());
   }
}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and Prentice      *
 * Hall. All Rights Reserved.                                             *
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