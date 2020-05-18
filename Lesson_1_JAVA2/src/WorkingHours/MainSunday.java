package WorkingHours;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;
import java.util.Date;

public class MainSunday {
    public static void main(String[] args) {

        // От текущей даты
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        int dayNumber = calendar.get(Calendar.DAY_OF_WEEK);

        int hoursSum = 0;
        for (DayOfWeekSunday dayOfWeekSunday : DayOfWeekSunday.values()) {
            if (dayOfWeekSunday.getDayNumber() >= dayNumber) {
                hoursSum += dayOfWeekSunday.getDuration();
                System.out.println(hoursSum);
            }else{
                System.out.println("Что-то не то...");
            }
        }

        if (hoursSum != 0) {
            System.out.println(hoursSum + " working hours remain till the end of this week.");
        } else {
            System.out.println("Today is a day off. Relax!");
        }
    }
}

