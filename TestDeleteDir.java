import java.io.File;

/**
 *
 * @author Rony
 */
public class TestDeleteDir {
    public static void main(String[] args) {
        new TestDeleteDir().deleteDir(new File("Barcode"));
    }
    
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        // The directory is now empty so delete it
        return dir.delete();
    }
}
