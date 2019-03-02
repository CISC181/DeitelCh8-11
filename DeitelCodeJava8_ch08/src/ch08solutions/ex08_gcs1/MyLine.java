package ch08solutions.ex08_gcs1;

// GUI Case Study Exercise 8.1: MyLine.java
// MyLine class represents a line.
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine {
   private double x1;
   private double y1;
   private double x2;
   private double y2;
   private double strokeThickness; 
   private Color strokeColor; 

   // constructor with input values
   public MyLine(double x1, double y1, double x2, double y2, 
      double strokeThickness, Color strokeColor) {

      this.x1 = x1; 
      this.y1 = y1; 
      this.x2 = x2; 
      this.y2 = y2; 
      this.strokeThickness = strokeThickness;
      this.strokeColor = strokeColor;
   } 
   
   // draw the line in the specified color
   public void draw(GraphicsContext gc) {
      gc.setStroke(strokeColor);
      gc.setLineWidth(strokeThickness);
      gc.strokeLine(x1, y1, x2, y2);
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