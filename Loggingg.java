import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chromatics
 */
public class Loggingg {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Test Logger");
        try {
            
            Handler handler = new FileHandler("file-log.log");
            logger.addHandler(handler);
            
            logger.info("aplikasi berjalan");
            
            logger.info("melakukan perulangan");
            for (int i = 0; i < 10; i++) {
                logger.info("info i sekarang : "+i);                
            }
            logger.info("perulangan selesai");
            
            logger.info("aplikasi selesai");
            
        } catch (IOException ex) {
            logger.info("");
        } catch (SecurityException ex) {
            Logger.getLogger(Loggingg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
