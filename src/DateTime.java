public class DateTime extends Date {

    private int hours, minutes, seconds;

    // Parameters Constructor //
    public DateTime(int pDay, int pMonth, int pYear, int pHours, int pMinutes, int pSeconds) {

        super(pDay, pMonth, pYear);
        hours = pHours;
        minutes = pMinutes;
        seconds = pSeconds;
    }

    // Copy constructor //
    public DateTime(DateTime pDateTime) {

        super(pDateTime);
        hours = pDateTime.getHours();
        minutes = pDateTime.getMinutes();
        seconds = pDateTime.getSeconds();

    }

    // Default Constructor //
    public DateTime() {

        super();
        hours = 1;
        minutes = 23;
        seconds = 45;
    }

    // Accessors for hours minutes and seconds //
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Mutators for hours minutes and seconds //
    public void setHours(int pHours) {
        if (pHours >= 0 && pHours <= 23) {
            hours = pHours;
        }
    }

    public void setMinutes(int pMinutes) {
        if (pMinutes >= 0 && pMinutes <= 59) {
            minutes = pMinutes;
        }
    }

    public void setSeconds(int pSeconds) {
        if (pSeconds >= 0 && pSeconds <= 59) {
            seconds = pSeconds;
        }
    }

    public String toString() {
        String dateString = super.toString();
        String dateTimeString;
        dateTimeString = "Hour is " + hours + ", minute is " + minutes + ", second is " + seconds + dateString + " ";
        return dateTimeString;
    }

    public boolean equals(Object pObject) {
        boolean isEqual = false;
        DateTime inDateTime;
        if (pObject instanceof DateTime) {
            inDateTime = (DateTime) pObject;
            if (super.equals(inDateTime)) {
                if (hours == inDateTime.getHours()) {
                    if (minutes == inDateTime.getMinutes()) {
                        if (seconds == inDateTime.getSeconds()) {
                            isEqual = true;
                        }
                    }
                }
            }
        }
        return isEqual;
    }
}
