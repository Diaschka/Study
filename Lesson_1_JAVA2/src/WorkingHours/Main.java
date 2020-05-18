package WorkingHours;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // От заданной вручную даты
        DayOfWeek today = DayOfWeek.MONDAY;
        int dayNumber = today.getDayNumber();

        int hoursSum = 0;
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.getDayNumber() >= dayNumber) {
                hoursSum += dayOfWeek.getDuration();
                //System.out.println(hoursSum); // для проверки вывода часов
            }
        }

        if (hoursSum != 0) {
            System.out.println(hoursSum + " working hours remain till the end of this week.");
        } else {
            System.out.println("Today is a day off. Relax!");
        }

//
//        for(DayOfWeek dayOfWeek : DayOfWeek.values()){
//            System.out.println(dayOfWeek + " contains " + dayOfWeek.getDuration() + " working hours.");
//        }

    }
}



