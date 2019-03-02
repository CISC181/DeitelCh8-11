package ch09solutions.ex9_08;

// Exercise 9.8 Solution: Quadrilateral.java
// Class Quadrilateral definition

public class Quadrilateral  {
   private Point point1; // first endpoint
   private Point point2; // second endpoint
   private Point point3; // third endpoint
   private Point point4; // fourth endpoint

   // eight-argument constructor
   public Quadrilateral(double x1, double y1, double x2, double y2,
      double x3, double y3, double x4, double y4) {
      point1 = new Point(x1, y1);
      point2 = new Point(x2, y2);
      point3 = new Point(x3, y3);
      point4 = new Point(x4, y4);
   } 

   // return point1
   public Point getPoint1() {
      return point1;
   }

   // return point2
   public Point getPoint2() {
      return point2;
   } 

   // return point3
   public Point getPoint3() {
      return point3;
   }

   // return point4
   public Point getPoint4() {
      return point4;
   }

   // return string representation of a Quadrilateral object
   @Override
   public String toString() {
      return String.format("%s:\n%s", 
         "Coordinates of Quadrilateral are", getCoordinatesAsString()); 
   } 

   // return string containing coordinates as strings
   public String getCoordinatesAsString() {
      return String.format(
         "%s, %s, %s, %s\n", point1, point2, point3, point4);
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