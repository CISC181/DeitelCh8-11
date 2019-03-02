package ch10solutions.ex10_16;

// Fig. 10.13: Employee.java
// Employee abstract superclass implements Payable.

public abstract class Employee implements Payable {
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;

   // three-argument constructor
   public Employee(String first, String last, String ssn) {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
   }

   // set first name
   public void setFirstName(String first) {
      firstName = first; // should validate
   }

   // return first name
   public String getFirstName() {
      return firstName;
   }

   // set last name
   public void setLastName(String last) {
      lastName = last; // should validate
   }

   // return last name
   public String getLastName() {
      return lastName;
   }

   // set social security number
   public void setSocialSecurityNumber(String ssn) {
      socialSecurityNumber = ssn; // should validate
   }

   // return social security number
   public String getSocialSecurityNumber() {
      return socialSecurityNumber;
   }

   // return String representation of Employee object
   @Override
   public String toString() {
      return String.format("%s %s\nsocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber());
   }

   // Note: We do not implement Payable method getPaymentAmount here so  
   // this class must be declared abstract to avoid a compilation error.
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
