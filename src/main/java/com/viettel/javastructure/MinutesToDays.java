package com.viettel.javastructure;

import java.util.Scanner;

/**
 * The MinutesToDays allows input the number of minutes and convert approximately to pair value: year and day
 *
 * @author HuanNT
 */
public class MinutesToDays {

    /**
     * get input data and use convertMinutesToDays method then print out the result
     *
     * @param args Unused
     * @return Nothing
     */
    public static void main(String[] args) {
        long minutes = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input a the number of minutes: ");
            try {
                minutes = scanner.nextLong();
            } catch (Exception ex) {
                scanner.next();
            }
        } while (minutes < 0);
        DatePair datePairResult = convertMinutesToDays(minutes);
        System.out.println(minutes + " minutes is approximately " + datePairResult.getYear() + " years and " + datePairResult.getDay() + " days");
    }

    /**
     * Convert the number of minutes to a DatePair
     *
     * @param minutes the number of minutes
     * @return DatePair
     */
    public static DatePair convertMinutesToDays(long minutes) {
        int minutesOfDay = 24 * 60;
        int minutesOfYear = minutesOfDay * 365;
        long numberOfYear = minutes / minutesOfYear;
        int numberOfDay = Math.round((float) (minutes % minutesOfYear) / minutesOfDay);
        return new DatePair(numberOfYear, numberOfDay);
    }
}
