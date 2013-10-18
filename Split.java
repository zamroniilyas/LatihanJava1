public class Split {
    public static void main(String[] args) {
        String dir = "Rp.1000";
        String[] splt= dir.split("Rp.");
        
//        for (int i = 0; i < splt.length; i++) {
//            System.out.println(splt[i]);
//        }
        System.out.println(splt[1]);
    }
}
