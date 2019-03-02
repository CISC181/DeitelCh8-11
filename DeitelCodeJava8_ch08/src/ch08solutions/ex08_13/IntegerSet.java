package ch08solutions.ex08_13;

// Exercise 8.13 Solution: IntegerSet.java
// IntegerSet class definition

public class IntegerSet {
   private final int SETSIZE = 101;
   private boolean[] set;

   // no-argument constructor, creates an empty set
   public IntegerSet() {
      set = new boolean[SETSIZE];
   }
   
   // constructor creates a set from array of integers
   public IntegerSet(int[] array) {
      set = new boolean[SETSIZE];

      for(int i = 0; i < array.length; i++) {
         insertElement(array[i]);
      }
   }

   // return string representation of set 
   public String toString() {
      boolean empty = true; // assume set is empty
      String setString = "{";
   
      // get set elements
      for (int count = 0; count < 101; count++) {
         if (set[count]) {
            setString += count + " ";
            empty = false; // set is not empty
         }
      }

      // empty set
      if (empty) {
         setString += "---"; // display an empty set
      }
		
      setString += "}";

      return setString;
   }

   // returns the union of two sets
   public IntegerSet union(IntegerSet integerSet) {
      IntegerSet temp = new IntegerSet();

      for (int count = 0; count < 101; count++) {
         temp.set[count] = (set[count] || integerSet.set[count]);
      }

      return temp;
   }

   // returns the intersection of two sets
   public IntegerSet intersection(IntegerSet integerSet) {
      IntegerSet temp = new IntegerSet();

      for (int count = 0; count < 101; count++) {
         temp.set[count] =
            (set[count] && integerSet.set[count]);
      }

      return temp;
   }

   // insert a new integer into this set
   public void insertElement(int insertInteger) {
      if (validEntry(insertInteger))
         set[insertInteger] = true;
   }

   // remove an integer from this set
   public void deleteElement(int deleteInteger) {
      if (validEntry(deleteInteger))
         set[deleteInteger] = false;
   }

   // determine if two sets are equal
   public boolean isEqualTo(IntegerSet integerSet) {
      for (int count = 0; count < 101; count++) {
         if (set[count] != integerSet.set[count]) {
            return false; // sets are not-equal
         }
      } 

      return true; // sets are equal
   }

   // determine if input is valid
   public boolean validEntry(int input) {
      return input >= 0 && input <= 100;
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
