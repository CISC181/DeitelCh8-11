package ch08solutions.ex08_gcs2;

// GCS Exercise 8.2 Solution: DrawRandomShapesController.java
// Drawing random Shapes.
import java.security.SecureRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawRandomShapesController { 
   private static final SecureRandom randomNumbers = new SecureRandom();
   @FXML private Canvas canvas;

   // draws random lines
   @FXML
   void drawLinesButtonPressed(ActionEvent event) {
      // get the GraphicsContext, which is used to draw on the Canvas
      GraphicsContext gc = canvas.getGraphicsContext2D();

      MyLine[] lines = new MyLine[100]; // stores the MyLine objects
      
      final int width = (int) canvas.getWidth();
      final int height = (int) canvas.getHeight();

      // create lines
      for (int count = 0; count < lines.length; count++) {
         // generate random coordinates
         int x1 = randomNumbers.nextInt(width);
         int y1 = randomNumbers.nextInt(height);
         int x2 = randomNumbers.nextInt(width);
         int y2 = randomNumbers.nextInt(height);
         
         // generate a random color
         Color color = Color.rgb(randomNumbers.nextInt(256), 
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
         
         // add a new MyLine to the array
         lines[count] = new MyLine(x1, y1, x2, y2, color);
      } 

      // clear the Canvas then draw the lines
      gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); 

      for (MyLine line : lines) {
         line.draw(gc);
      } 
   }

   // draws random ovals
   @FXML
   void drawOvalsButtonPressed(ActionEvent event) {
      // get the GraphicsContext, which is used to draw on the Canvas
      GraphicsContext gc = canvas.getGraphicsContext2D();

      MyOval[] ovals = new MyOval[100]; // stores the MyOval objects
      
      final int width = (int) canvas.getWidth();
      final int height = (int) canvas.getHeight();

      // create lines
      for (int count = 0; count < ovals.length; count++) {
         // generate random coordinates
         int x1 = randomNumbers.nextInt(width);
         int y1 = randomNumbers.nextInt(height);
         int x2 = randomNumbers.nextInt(width);
         int y2 = randomNumbers.nextInt(height);
         
         // generate a random color
         Color color = Color.rgb(randomNumbers.nextInt(256), 
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
         
         // add a new MyOval to the array
         ovals[count] = new MyOval(x1, y1, x2, y2, color, randomNumbers.nextBoolean());
      } 

      // clear the Canvas then draw the lines
      gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); 

      for (MyOval oval : ovals) {
         oval.draw(gc);
      } 
   }
   
   // draws random rectangles
   @FXML
   void drawRectanglesButtonPressed(ActionEvent event) {
      // get the GraphicsContext, which is used to draw on the Canvas
      GraphicsContext gc = canvas.getGraphicsContext2D();

      MyRectangle[] rectangles = new MyRectangle[100]; // stores the MyOval objects
      
      final int width = (int) canvas.getWidth();
      final int height = (int) canvas.getHeight();

      // create lines
      for (int count = 0; count < rectangles.length; count++) {
         // generate random coordinates
         int x1 = randomNumbers.nextInt(width);
         int y1 = randomNumbers.nextInt(height);
         int x2 = randomNumbers.nextInt(width);
         int y2 = randomNumbers.nextInt(height);
         
         // generate a random color
         Color color = Color.rgb(randomNumbers.nextInt(256), 
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
         
         // add a new MyRectangle to the array
         rectangles[count] = new MyRectangle(x1, y1, x2, y2, color, randomNumbers.nextBoolean());
      } 

      // clear the Canvas then draw the lines
      gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); 

      for (MyRectangle rectangle : rectangles) {
         rectangle.draw(gc);
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
