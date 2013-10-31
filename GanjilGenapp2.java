public class GanjilGenapp2 {
    public static void main(String[] args) {
        int deretBilangan [] = {2,4,10,11,13,16,19,200,45,41,23,89,111}; 
        String genap="";
        String ganjil="";        
        for (int i = 0; i < deretBilangan.length; i++) {
            if (deretBilangan[i]%2==1) {
                genap+=deretBilangan[i]+" ";
            }else{
                ganjil+=deretBilangan[i]+" ";                
            }
        }
        
        System.out.println("Genap : "+genap);
        System.out.println("Ganjil : "+ganjil);
    }
}
