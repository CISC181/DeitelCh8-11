package ch10solutions.ex10_16;

// Fig. 10.15: Invoice.java
// Invoice class implements Payable.

public class Invoice implements Payable {
   private String partNumber; 
   private String partDescription;
   private int quantity;
   private double pricePerItem;

   // four-argument constructor
   public Invoice(String part, String description, int count, 
      double price) {
      partNumber = part;
      partDescription = description;
      setQuantity(count); // validate and store quantity
      setPricePerItem(price); // validate and store price per item
   }

   // set part number
   public void setPartNumber(String part) {
      partNumber = part; // should validate
   }

   // get part number
   public String getPartNumber() {
      return partNumber;
   }

   // set description
   public void setPartDescription(String description) {
      partDescription = description; // should validate
   }

   // get description
   public String getPartDescription() {
      return partDescription;
   }

   // set quantity
   public void setQuantity(int count) {
      quantity = (count < 0) ? 0 : count; // quantity cannot be negative
   }

   // get quantity
   public int getQuantity() {
      return quantity;
   }

   // set price per item
   public void setPricePerItem(double price) {
      pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
   }

   // get price per item
   public double getPricePerItem() {
      return pricePerItem;
   }

   // return String representation of Invoice object
   @Override
   public String toString() {
      return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
         "invoice", "part number", getPartNumber(), getPartDescription(), 
         "quantity", getQuantity(), "price per item", getPricePerItem());
   } 

   // method required to carry out contract with interface Payable
   @Override
   public double getPaymentAmount() {
      return getQuantity() * getPricePerItem(); // calculate total cost
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
