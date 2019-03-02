package ch09solutions.ex9_08;

// Exercise 9.8 Solution: Square.java
// Class Square definition

public class Square extends Parallelogram  {
   // constructor
   public Square(double x1, double y1, double x2, double y2,
      double x3, double y3, double x4, double y4) {
      super(x1, y1, x2, y2, x3, y3, x4, y4);
   } 

   // return string representation of Square object
   @Override
   public String toString() {
      return String.format("\n%s:\n%s%s: %s\n%s: %s\n",
         "Coordinates of Square are", getCoordinatesAsString(), 
         "Side is", getHeight(), "Area is", getArea());
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