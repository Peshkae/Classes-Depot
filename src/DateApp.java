
import java.util.*;

public class DateApp {

    public static void main(String[] args) {

        DateTime dT = new DateTime(23, 5, 1975, 12, 13, 13);
        DateTime dT2 = new DateTime(23, 5, 1975, 12, 13, 13);
        DateTime dT3 = new DateTime(dT);

        if (dT.equals(dT2)) {
            System.out.println("matching dates");
        } else {
            System.out.println("not matching dates");
        }

        dT2.setDay(6);
        if (dT.equals(dT2)) {
            System.out.println("matching dates");
        } else {
            System.out.println("not matching dates");
            System.out.println(dT);
            System.out.println(dT2);
        }

        if (dT.equals(dT3)) {
            System.out.println("matching dates");
            System.out.println(dT);
            System.out.println(dT3);
        } else {
            System.out.println("not matching dates");
            System.out.println(dT);
            System.out.println(dT3);
        }
    }

}
