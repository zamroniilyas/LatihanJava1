public class GanjilGenap {
    public static void main(String[] args) {
        String genap="";
        String ganjil="";
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                genap+=i+" ";
            }else{
                ganjil+=i+" ";
            }
        }
        System.out.println("Bilangan genap : "+genap);
        System.out.println("Bilangan ganjil : "+ganjil);        
    }  
}
