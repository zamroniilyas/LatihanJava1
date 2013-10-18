import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chromatics
 */
public class StringParseDate {
    public static void main(String[] args) {
        try {
            String string = "Januari 2, 2010";
            String string1 = "04 Juli 1991";
            Date date = new SimpleDateFormat("dd MMMM yyyy", new Locale("in", "ID")).parse(string1);
            DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);                                   
            System.out.println(df.format(date));
        } catch (ParseException ex) {
            Logger.getLogger(StringParseDate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
