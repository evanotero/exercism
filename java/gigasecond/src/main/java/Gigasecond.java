import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private static final double GIGASECOND = Math.pow(10, 9);
    private final LocalDateTime startDate;

    Gigasecond(LocalDate date) {
        this.startDate = date.atTime(0, 0);
    }

    Gigasecond(LocalDateTime date) {
        this.startDate = date;
    }

    public LocalDateTime getDate() {
        return startDate.plusSeconds((long) GIGASECOND);
    }
}
