import org.joda.time.DateTime;

public class Meetup {
    private DateTime dateStart;

    public Meetup(int month, int year) {
        dateStart = new DateTime(year, month, 1, 0 , 0);
    }

    public DateTime day(int day, MeetupSchedule schedule) {
        DateTime current = cycleToNext(day, dateStart);
        switch (schedule) {
            case FIRST:
                break;
            case SECOND:
                current = current.plusWeeks(1);
                break;
            case THIRD:
                current = current.plusWeeks(2);
                break;
            case FOURTH:
                current = current.plusWeeks(3);
                break;
            case TEENTH:
                while (current.getDayOfMonth() < 13)
                    current = current.plusWeeks(1);
                break;
            case LAST:
                current = cycleToPrev(day, dateStart.plusMonths(1).minusDays(1));
                break;
            default:
                break;
        }
        return current;
    }

    private DateTime cycleToPrev(int day, DateTime current) {
        while (current.getDayOfWeek() != day)
            current = current.minusDays(1);
        return current;
    }

    private DateTime cycleToNext(int day, DateTime current) {
        while (current.getDayOfWeek() != day)
            current = current.plusDays(1);
        return current;
    }
}
