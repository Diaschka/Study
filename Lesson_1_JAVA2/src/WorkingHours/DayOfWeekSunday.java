package WorkingHours;

public enum DayOfWeekSunday {
    MONDAY(8,2), TUESDAY(8,3), WEDNESDAY(8,4),THURSDAY(8,5), FRIDAY(8,6), SATURDAY(0,7),SUNDAY(0,1);

    private int duration;
    private int dayNumber;

    public int getDuration(){
        return duration;
    }

    DayOfWeekSunday(int duration, int dayNumber) {
        this.duration = duration;
        this.dayNumber = dayNumber;
    }
    public int getDayNumber(){
        return dayNumber;
    }
}
