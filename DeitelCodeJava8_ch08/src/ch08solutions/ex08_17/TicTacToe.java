package ch08solutions.ex08_17;

// Exercise 8.17 Solution: TicTacToe.java
// Program that plays the game of tic-tac-toe.
import java.util.Scanner;

public class TicTacToe {
   private final int BOARDSIZE = 3; // size of the board
   private enum Status { WIN, DRAW, CONTINUE }; // game states
   private char[][] board; // board representation
   private boolean firstPlayer; // whether it's player 1's move
   private boolean gameOver; // whether game is over

   // Constructor
   public TicTacToe() {
      board = new char[BOARDSIZE][BOARDSIZE];
      firstPlayer = true;
      gameOver = false;
   } 

   // start game
   public void play() {
      Scanner input = new Scanner(System.in);
      int row; // row for next move
      int column; // column for next move

      System.out.println("Player X's turn.");
      
      while (!gameOver) {
         char player = (firstPlayer ? 'X' : 'O');

         // player's turn
         do {
            System.out.printf(
               "Player %c: Enter row (0, 1 or 2): ", player);
            row = input.nextInt();
            System.out.printf(
               "Player %c: Enter column (0, 1 or 2): ", player);
            column = input.nextInt();
         } while (!validMove(row, column));

         board[row][column] = player;

         firstPlayer = !firstPlayer;

         printBoard();
         printStatus(player);
      } 
   }

   // show game status in status bar
   private void printStatus(int player) {
      Status status = gameStatus();

      // check game status
      switch (status) {
         case WIN:
            System.out.printf("Player %c wins.", player);
            gameOver = true;
            break;
         case DRAW:  
            System.out.println("Game is a draw.");
            gameOver = true;
            break;
         case CONTINUE:  
            if (player == 'X')
               System.out.println("Player O's turn.");
            else
               System.out.println("Player X's turn.");
            break;
      }
   }

   // get game status
   private Status gameStatus() {
      int a;

      // check for a win on diagonals
      if (board[0][0] != 0 && board[0][0] == board[1][1] &&
         board[0][0] == board[2][2]) {
         return Status.WIN;
      }
      else if (board[2][0] != 0 && board[2][0] == 
         board[1][1] && board[2][0] == board[0][2]) {
         return Status.WIN;
      }

      // check for win in rows
      for (a = 0; a < 3; a++) {
         if (board[a][0] != 0 && board[a][0] == 
              board[a][1] && board[a][0] == board[a][2]) {
            return Status.WIN;
         }
      }

      // check for win in columns
      for (a = 0; a < 3; a++) {
         if (board[0][a] != 0 && board[0][a] == 
              board[1][a] && board[0][a] == board[2][a]) {
            return Status.WIN;
         }
      }

      // check for a completed game
      for (int r = 0; r < 3; r++) {
         for (int c = 0; c < 3; c++) {
            if (board[r][c] == 0) {
               return Status.CONTINUE; // game is not finished
            }
         }
      }

      return Status.DRAW; // game is a draw
   } 

   // display board
   public void printBoard() {
      System.out.println(" _______________________ ");

      for (int row = 0; row < BOARDSIZE; row++) {
         System.out.println("|       |       |       |");

         for (int column = 0; column < BOARDSIZE; column++) {
            printSymbol(column, board[row][column]);
         }

         System.out.println("|_______|_______|_______|");
      } 
   } 

   // print moves
   private void printSymbol(int column, char value) {
      System.out.printf("|   %c   ", value);

	   if (column == 2) {
         System.out.println("|");
      }
   } 

   // validate move
   private boolean validMove(int row, int column) {
      return row >= 0 && row < 3 && column >= 0 && column < 3 &&
         board[row][column] == 0;
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
