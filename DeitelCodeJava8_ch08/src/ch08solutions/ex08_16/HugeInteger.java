package ch08solutions.ex08_16;

// Exercise 8.16 Solution: HugeInteger.java
// HugeInteger class definition

public class HugeInteger {
   private final int DIGITS = 40;
   private int[] integer; // array containing the integer
   private boolean positive; // whether the integer is positive

   // no-argument constructor
   public HugeInteger() {
      integer = new int[DIGITS];
      positive = true;
   }
   
   // convert a String to HugeInteger
   public void parse(String inputString) {
      // check if input is a negative number
      if (inputString.charAt(0) == '-')  {
         positive = false;
      }

      if (positive) {
         integer[DIGITS - inputString.length()] = 
            inputString.charAt(0) - '0';
      }

      // convert string to integer array
      for (int i = 1; i < inputString.length(); i++) {
         integer[DIGITS - inputString.length() + i] = 
            inputString.charAt(i) - '0';
      }
   }
   
   // add two HugeIntegers
   public HugeInteger add(HugeInteger addValue) {
      HugeInteger temp = new HugeInteger(); // temporary result

      // both HugeIntegers are positive or negative
      if (positive == addValue.positive) {
         temp = addPositives(addValue);
      }
      // addValue is negative
      else if (positive && (!addValue.positive)) {
         addValue.positive = true;

         if (isGreaterThan(addValue)) {
            temp = subtractPositives(addValue);
         }
         else {
            temp = addValue.subtractPositives(this);
            temp.positive = false;
         }
         
         addValue.positive = false; // reset sign for addValue
      }
      // this is negative
      else if (!positive && addValue.positive) {
         addValue.positive = false;

         if (isGreaterThan(addValue)) {
            temp = addValue.subtractPositives(this);
         }
         else {
            temp = subtractPositives(addValue);
            temp.positive = false;
         }

         addValue.positive = true; // reset sign for addValue
      }
      
      return temp; // return the sum
   }
   
   // add two positive HugeIntegers
   public HugeInteger addPositives(HugeInteger addValue) {
      HugeInteger temp = new HugeInteger();
      int carry = 0;

      // iterate through HugeIntegers
      for (int i = 39; i >= 0; i--) {
         temp.integer[i] = 
            integer[i] + addValue.integer[i] + carry;

         // determine whether to carry a 1
         if (temp.integer[i] > 9) {
            temp.integer[i] %= 10;  // reduce to 0-9
            carry = 1;
         }
         else {
            carry = 0;
         }
      }

      // if both are negative, set the result to negative
      if (!positive) {
         temp.positive = false;
      }

      return temp;
   }
   
   // subtract two HugeIntegers
   public HugeInteger subtract(HugeInteger subtractValue) {
      HugeInteger temp = new HugeInteger();   // temporary result
   
      // subtractValue is negative
      if (positive && (!subtractValue.positive)) {
         temp = addPositives(subtractValue);
      }
      // this HugeInteger is negative
      else if (!positive && subtractValue.positive) {
         temp = addPositives(subtractValue);
      }
      // at this point, both HugeIntegers have the same sign
      else {
         boolean isPositive = positive; // original sign
         boolean resultPositive = positive; // sign of the result

         // set both to positive so we can compare absolute values
         positive = true;
         subtractValue.positive = true;

         if (this.isGreaterThan(subtractValue)) {
            temp = this.subtractPositives(subtractValue);
         }
         else {
            temp = subtractValue.subtractPositives(this);
            resultPositive = !isPositive; // flip the sign
         }
         
         positive = isPositive;
         subtractValue.positive = isPositive;
         temp.positive = resultPositive;
      }
      
      return temp;
   }
   
   // subtract two positive HugeIntegers
   public HugeInteger subtractPositives(HugeInteger subtractValue) {
      HugeInteger temp = new HugeInteger();

      // iterate through HugeInteger
      for (int i = 39; i >= 0; i--) {
         // borrow if needed
         if (integer[i] < subtractValue.integer[i]) {
            integer[i] += 10;
            subtractValue.integer[i - 1]--;
         }
         
         temp.integer[i] = integer[i] - subtractValue.integer[i];
      }
      
      return temp; // return difference of two HugeIntegers
   }
   
   // find first non-zero position of two HugeIntegers
   public int findFirstNonZeroPosition() {
      // find first non-zero position for first HugeInteger
      for (int i = 0; i < DIGITS; i++) {
         if (integer[i] > 0) {
            return i;
         }
      }
      
      return DIGITS - 1;
   }
   
   // get string representation of HugeInteger
   public String toString() {
      String output = "";

      if (!positive) {
         output = "-";
      }

      // get HugeInteger values without leading zeros
      for (int i = findFirstNonZeroPosition(); i < DIGITS; i++) {
         output += integer[i];
      }

      return output;
   }
   
   // test if two HugeIntegers are equal
   public boolean isEqualTo(HugeInteger compareValue) {
      // compare the sign
      if (positive != compareValue.positive) {
         return false;
      }
      
      // compare each digit
      for (int i = 0; i < DIGITS; i++) {
         if (integer[i] != compareValue.integer[i]) {
            return false;
         }
      }
      
      return true;
   }
   
   // test if two HugeIntegers are not equal
   public boolean isNotEqualTo(HugeInteger compareValue) {
      return !isEqualTo(compareValue);
   }
   
   // test if one HugeInteger is greater than another
   public boolean isGreaterThan(HugeInteger compareValue) {
      // different signs
      if (positive && (!compareValue.positive)) {
         return true;
      }
      else if (!positive && compareValue.positive) {
         return false;
      }

      // same sign
      else {
         // first number's length is less than second number's length
         if (findFirstNonZeroPosition() > 
            compareValue.findFirstNonZeroPosition()) {
            return !positive;
         }
            
         // first number's length is larger than that of second number
         else if (findFirstNonZeroPosition() < 
            compareValue.findFirstNonZeroPosition()) {
            return positive;
         }

         // two numbers have same length
         else {
            for (int i = 0; i < DIGITS; i++) {
               if (integer[i] > compareValue.integer[i]) {
                  return positive;
               }
               else if (integer[i] < compareValue.integer[i]) {
                  return !positive;
               }
            }
         }
      }
      
      return false;
   }
   
   // test if one HugeInteger is less than another
   public boolean isLessThan(HugeInteger compareValue) {
      return !(isGreaterThan(compareValue) || 
         isEqualTo(compareValue));
   }
   
   // test if one HugeInteger is greater than or equal to another
   public boolean isGreaterThanOrEqualTo(HugeInteger compareValue) {
      return !isLessThan(compareValue);
   }
   
   // test if one HugeInteger is less than or equal to another
   public boolean isLessThanOrEqualTo(HugeInteger compareValue) {
      return !isGreaterThan(compareValue);
   }
   
   // test if one HugeInteger is zero
   public boolean isZero() {
      // compare each digit
      for (int i = 0; i < DIGITS; i++) {
         if (integer[i] != 0) {
            return false;
         }
      } 
      
      return true;
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
