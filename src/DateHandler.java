import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateHandler {

    public String stampaDataFormattata(OffsetDateTime dateToFormat){
        String dateFormatted = dateToFormat.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        return dateFormatted;
    }

}