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

    // Accessors for day, month and year //
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // mutators for day, month, and year //
    public void setDay(int pDay) {
        switch (month) { // <- uses current value for month for validation to see what month it is//
            case 1, 3, 5, 8, 10, 12:
                if (pDay >= 1 && pDay <= 31) {
                    day = pDay;
                }
            case 4, 6, 7, 9, 11:
                if (pDay >= 1 && pDay <= 30) {
                    day = pDay;
                }
            case 2:
                if (year % 4 == 0) {     // <- uses current value for year for validation of if it is a leap year //
                    if (pDay >= 1 && pDay <= 29) {
                        day = pDay;
                    }
                } else {
                    if (pDay >= 1 && pDay <= 28) {
                        day = pDay;
                    }
                }


        }
    }

    public void setMonth(int pMonth) {
        if (pMonth >= 1 && pMonth <= 12) {
            month = pMonth;
        }
    }

    public void setYear(int pYear) {
        if (pYear >= 1970) {
            year = pYear;
        }
    }

    // accessors for toString and equals //
    public String toString() {
        String dateString;
        dateString = "Day is " + day + ", Month is " + month + ", Year is " + year;
        return dateString;
    }

    public boolean equals(Object inObject) {
        boolean isEqual = false;
        Date inDate;
        if (inObject instanceof Date) {
            inDate = (Date) inObject;
            if (day == inDate.getDay()) {
                if (month == inDate.getMonth()) {
                    if (year == inDate.getYear()) {
                        isEqual = true;
                    }
                }
            }
        }
        return isEqual;
    }

}
