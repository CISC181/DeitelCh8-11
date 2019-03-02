package ch08solutions.ex08_12;

// Exercise 8.12 Solution: DateAndTime.java
// DateAndTime class definition.

public class DateAndTime {
   private static int[] daysPerMonth =
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // > 0
   private int hour; // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59

   // no argument constructor
   public DateAndTime() {
      this(1, 1, 2000, 0, 0, 0);
   }

   // constructor
   public DateAndTime(int month, int day, int year,
      int hour, int minute, int second) {
      if (!checkYear(year)) {
         throw new IllegalArgumentException("year must be > 0");
      }

      if (!checkMonth(month)) {
         throw new IllegalArgumentException("month must be > 0 and <= 12");
      }

      if (!checkDay(day, month, year)) {
         throw new IllegalArgumentException("day must be in range for specified month");
      }

      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }

      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      }

      this.year = year;
      this.month = month;
      this.day = day;
      this.hour = hour;
      this.minute = minute; 
      this.second = second; 
   }

   // Set a new date value. Perform validity checks on data
   public void setDate(int month, int day, int year) {
      if (!checkYear(year)) {
         throw new IllegalArgumentException("year must be > 0");
      }

      if (!checkMonth(month)) {
         throw new IllegalArgumentException("month must be > 0 and <= 12");
      }

      if (!checkDay(day, month, year)) {
         throw new IllegalArgumentException("day must be in range for specified month");
      }

      this.year = year;
      this.month = month;
      this.day = day;
   }

   // Set a new time value using universal time. Perform
   // validity checks on data. 
   public void setTime(int hour, int minute, int second) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }

      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      }

      this.hour = hour;
      this.minute = minute; 
      this.second = second; 
   }

   // validate and set hour 
   public void setHour(int hour) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      this.hour = hour;
   } 

   // validate and set minute 
   public void setMinute(int minute) {
      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }

      this.minute = minute; 
   } 

   // validate and set second 
   public void setSecond(int second) {
      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      }

      this.second = second; 
   } 

   // Get Methods
   // get hour value
   public int getHour() {
      return hour; 
   } 

   // get minute value
   public int getMinute() {
      return minute; 
   } 

   // get second value
   public int getSecond() {
      return second; 
   }

   // Tick the time by one second
   public void tick() {
      int tempSecond = getSecond();

      if (tempSecond < 59) {
         setSecond(tempSecond + 1);
      }
      else {
         setSecond(0);
         incrementMinute();
      }
   }

   // Increment the minute
   public void incrementMinute() {
      int tempMinute = getMinute();

      if (tempMinute < 59) {
         setMinute(tempMinute + 1);
      }
      else {
         setMinute(0);
         incrementHour();
      }
   }

   // Increment the hour
   public void incrementHour() {
      if (getHour() < 23) {
         setHour(getHour() + 1);
      }
      else {
         setHour(0);
         nextDay();
      }
   }

   // utility method to confirm proper year value
   private static boolean checkYear(int testYear) {
      return (testYear > 0);
   }
   
   // utility method to confirm proper month value
   private static boolean checkMonth(int testMonth) {
      return (testMonth > 0 && testMonth <= 12);
   }

   // utility method to confirm proper day value based on month and year
   private static boolean checkDay(int day, int month, int year) {
      // check if day in range for month
      if (day > 0 && day <= daysPerMonth[month]) {
         return true;
      }

      // check for leap year
      if (month == 2 && day == 29 && (year % 400 == 0 ||
           (year % 4 == 0 && year % 100 != 0))) {
         return true;
      }
   
      return false;
   }
   
   // increment the day and check if doing so will change the month
   public void nextDay() {
      // check if day in range for month
      if ((day + 1) > daysPerMonth[month] && !(month == 2 && day == 29)) {
         day = 1;
         nextMonth();
      }
      else {
         ++day;
      }
   }

   // increment the month and check if doing so will change the year
   public void nextMonth() {
      if (month + 1 == 13) {
         month = 1;
         ++year;
      }
      else {
         ++month;
      }
   } 

   // convert to String in universal-time format
   public String toUniversalString() {
      return String.format("%d/%d/%d: %02d:%02d:%02d",
         month, day, year, getHour(), getMinute(), getSecond());
   }
   
   // convert to String in standard-time format
   public String toString() {
      return String.format("%d/%d/%d: %d:%02d:%02d %s",
         month, day, year,
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
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
