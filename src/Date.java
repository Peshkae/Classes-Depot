
import java.util.*;

public class Date {


    // Class Fields //
    private int day, month, year;

    

    // Parameters Constructor //
    public Date(int pDay, int pMonth, int pYear) {

        day = pDay;
        month = pMonth;
        year = pYear;

    }
    // Copy Constructor //
    public Date(Date pDate) {

       day = pDate.getDay();
       month = pDate.getMonth();
       year = pDate.getYear();

    }
    // Default Constructor //
    public Date() {
        day = 1;
        month = 1;
        year = 2000;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setDay(int pDay) {
        switch(month) { // <- uses current value for month for validation to see what month it is//
            case 1, 3, 5, 8, 10, 12:
                if(pDay >= 1 && pDay <= 31) {
                    day = pDay;
                } else {
                    System.out.println("Day must be between 1 and 31.");
                }
            case 4, 6, 7, 9, 11:
                if(pDay >= 1 && pDay <= 30) {
                    day = pDay;
                } else {
                    System.out.println("Day must be between 1 and 30.");
                }
            case 2:
                if(year % 4 == 0) {     // <- uses current value for year for validation of if it is a leap year //
                    if(pDay >= 1 && pDay <= 29) {
                        day = pDay;
                    } else {
                        System.out.println("Day must be between 1 and 29. Happy Leap Year!");
                    }
                } else {
                    if(pDay >= 1 && pDay <= 28) {
                        day = pDay;
                    } else {
                        System.out.println("Day must be between 1 and 28.");
                    }
                }




        }
    }
    public void setMonth(int pMonth) {
        if(pMonth >= 1 && pMonth <= 12) {
            month = pMonth;
        } else {
            System.out.println("Month must be between 1 and 12.");
        }
    }
    public void  setYear(int pYear) {
        if(pYear > 0) {
            year = pYear;
        } else {
            System.out.println("Year must be greater than 0.");
        }
    }
}

