package ch09solutions.ex9_08;

// Exercise 9.8 Solution: Trapezoid.java
// Class Trapezoid definition

public class Trapezoid extends Quadrilateral {
   private double height; // height of trapezoid

   // constructor
   public Trapezoid(double x1, double y1, double x2, double y2,
      double x3, double y3, double x4, double y4) {
      super(x1, y1, x2, y2, x3, y3, x4, y4);
   } 

   // return height
   public double getHeight() {
      if (getPoint1().getY() == getPoint2().getY()) {
         return Math.abs(getPoint2().getY() - getPoint3().getY());
      }
      else {
         return Math.abs(getPoint1().getY() - getPoint2().getY());
      }
   } 

   // return area
   public double getArea() {
      return getSumOfTwoSides() * getHeight() / 2.0;
   } 

   // return the sum of the trapezoid's two sides
   public double getSumOfTwoSides() {
      if (getPoint1().getY() == getPoint2().getY()) {
         return Math.abs(getPoint1().getX() - getPoint2().getX()) + 
            Math.abs(getPoint3().getX() - getPoint4().getX());
      }
      else {
         return Math.abs(getPoint2().getX() - getPoint3().getX()) +
            Math.abs(getPoint4().getX() - getPoint1().getX());
      }
   } 

   // return string representation of Trapezoid object
   @Override
   public String toString() {
      return String.format("\n%s:\n%s%s: %s\n%s: %s\n", 
         "Coordinates of Trapezoid are", getCoordinatesAsString(), 
         "Height is", getHeight(), "Area is", getArea());
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