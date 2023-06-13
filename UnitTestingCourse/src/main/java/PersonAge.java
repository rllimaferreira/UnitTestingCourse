import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonAge {

    public static long getPersonAge(LocalDate birthDate) {
        return ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }
}
