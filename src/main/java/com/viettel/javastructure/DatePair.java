package com.viettel.javastructure;

/**
 * class DatePair consist pair value: the number of year and the number of day
 *
 * @author HuanNT
 */
public class DatePair {
    private long year;
    private int day;

    public DatePair(long year, int day) {
        this.year = year;
        this.day = day;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

}
