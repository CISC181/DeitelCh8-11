package ch10solutions.ex10_gcs2;

// GCS Exercise 10.2 Solution: MyOval.java
// Declaration of class MyOval.
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyOval extends MyBoundedShape {
   // call default superclass constructor
   public MyOval() {}

   // call superclass constructor passing parameters
   public MyOval(int x1, int y1, int x2, int y2,
      Color color, boolean filled) {
      super(x1, y1, x2, y2, color, filled);
   } 

   // draw oval
   public void draw(GraphicsContext gc) {      
      if (isFilled()) {
         gc.setFill(getColor());
         gc.fillOval(getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight());
      }
      else {
         gc.setStroke(getColor());
         gc.strokeOval(getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight());
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