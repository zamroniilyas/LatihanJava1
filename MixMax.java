public class MixMax {
    public static void main(String[] args) {
        int deretAngka [] = { 100, 87, 21, 324, 109, 11, 56, 54, 76, 19, 78, 22, 12, 90, 124, 6, 18, 80, 7, 50, 67, 13, 64} ;
        
        int max = deretAngka[0];
        int min = deretAngka[0];
        
        for (int i = 0; i < deretAngka.length; i++) {
            if(min>deretAngka[i]){
                min=deretAngka[i];
            }else if(max<deretAngka[i]){
                max=deretAngka[i];
            }
        }
        
        System.out.println("Max = "+ max);
        System.out.println("Min = "+ min);
    }
}
