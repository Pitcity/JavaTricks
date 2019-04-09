package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class NewDateApi {
    public static void main(String... args) {
        //LocalDateTime localDateTime = new LocalDateTime();  just private constructors
        LocalTime localTime = LocalTime.now();
        //LocalDateTime localTimeDate = localTime.of(1,1,1); cannot use this one for converting from LocalTime to LocalDateTime
        //localTime.plus(1, ChronoUnit.CENTURIES);// compile error
        localTime.plus(1, ChronoUnit.HOURS);

        System.out.println(localTime);
        System.out.println(localTime.plus(1, ChronoUnit.HOURS)); // does not change instance value, returns new one
        System.out.println(localTime);

        Period period = Period.ofMonths(2).ofDays(2);
        System.out.println("\n\n" + localTime);
        //System.out.println(localTime.plus(period)); // compile error (days/months in localTime), just Duration
        Duration duration = Duration.ofMinutes(20).ofDays(2); //days is ok here but do not change anything
        Duration duration1 = Duration.ofMinutes(20).ofHours(2); //just last duration counts (hours)
        System.out.println(localTime.plus(duration1)); //any plus do not modify source object
        System.out.println(localTime);

    }
}
