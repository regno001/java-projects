package in.regno.exception.enums.programs;

public enum day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THRUSDAY(true),
    FRIDAY(false),
    SATURDAY( false),
    SUNDAY(false);

    private final boolean isWeekDay;
     day(boolean isWeekday){
        this.isWeekDay=isWeekday;
    }
    public String getType(){
         return isWeekDay ? "WeekDay" : "Weekend";
    }
}
