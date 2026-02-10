package utility;

import java.time.LocalDate;

public class DateValidator {
    public static boolean validateDate(LocalDate startDate, LocalDate endDate)
    {
        if(endDate.isAfter(startDate))
            return true;
        return false;
    }
}
