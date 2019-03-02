package ch10solutions.ex10_gcs1;

// GCS Exercise 8.2 Solution: DrawRandomShapesController.java
// Drawing random Shapes.
import java.util.ArrayList;
import java.security.SecureRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class DrawRandomShapesController { 
   private static final SecureRandom randomNumbers = new SecureRandom();
   private final ArrayList<MyShape> shapes = new ArrayList<>();
   private final int SHAPES = 100;
   @FXML private Canvas canvas;
   @FXML private Label statusLabel;

   // draws random shapes
   @FXML
   void drawButtonPressed(ActionEvent event) {
      // get the GraphicsContext, which is used to draw on the Canvas
      GraphicsContext gc = canvas.getGraphicsContext2D();
      
      final int width = (int) canvas.getWidth();
      final int height = (int) canvas.getHeight();
      final int[] shapeCount = new int[3]; // statistic on the number of each shape

      // create lines
      for (int count = 0; count < SHAPES; count++) {
         // generate random coordinates
         int x1 = randomNumbers.nextInt(width);
         int y1 = randomNumbers.nextInt(height);
         int x2 = randomNumbers.nextInt(width);
         int y2 = randomNumbers.nextInt(height);
         
         // generate a random color
         Color color = Color.rgb(randomNumbers.nextInt(256), 
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
         
         int shapeType = randomNumbers.nextInt(3);
         ++shapeCount[shapeType];

         switch (shapeType) {
            case 0: // line
               shapes.add(new MyLine(x1, y1, x2, y2, color));
               break;
            case 1: // oval
               shapes.add(new MyOval(x1, y1, x2, y2, color, randomNumbers.nextBoolean()));
               break;
            case 2: // rectangle
               shapes.add(new MyRectangle(x1, y1, x2, y2, color, randomNumbers.nextBoolean()));
               break;
         } 
      } 

      // clear the Canvas then draw the lines
      gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); 

      statusLabel.setText(String.format(" %s: %d, %s: %d, %s: %d",
         "Lines", shapeCount[0], "Ovals", shapeCount[1],
         "Rectangles", shapeCount[2]));

      for (MyShape shape : shapes) {
         shape.draw(gc);
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
