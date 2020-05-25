package WorkingHours;


public enum DayOfWeek {
    MONDAY(8,1), TUESDAY(8,2), WEDNESDAY(8,3),THURSDAY(8,4), FRIDAY(8,5), SATURDAY(0,6),SUNDAY(0,7);

    private int duration;
    private int dayNumber;

    public int getDuration(){
        return duration;
    }

    DayOfWeek(int duration, int dayNumber) {
        this.duration = duration;
        this.dayNumber = dayNumber;
    }
    public int getDayNumber(){
        return dayNumber;
    }

}
