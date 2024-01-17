import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateHandlerTest {

    DateHandler dateHandlerObj = new DateHandler();
    @org.junit.jupiter.api.Test
    void stampaDataFormattata() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = dateHandlerObj.stampaDataFormattata(dateTime);

        assertEquals("01 marzo 2023", result, "test del metodo");
    }

    @Test
    void stampaDataFormattataSeNull(){
        OffsetDateTime dateTime = null;
        try{
            String result = dateHandlerObj.stampaDataFormattata(dateTime);
        } catch (NullPointerException e){
            System.out.println(e);
            System.out.println("Se l'oggetto da formattare è null throw new NullPointer");
        }
    }
}