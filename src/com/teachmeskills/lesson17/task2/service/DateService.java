package com.teachmeskills.lesson17.task2.service;

/**
 * This class contain main method which print day of week.
 */

import java.time.LocalDateTime;

public class DateService {
    public static void printDayOfWeek(){
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate.getDayOfWeek());
    }
}
