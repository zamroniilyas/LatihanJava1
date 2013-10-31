public class ArrayStr {
    public static void main(String[] args) {
        String nama [][] = {{"Sugito", "Prayoga"}, {"Samirul", "Hilmi"}, {"Leo", "Hermawan"}, {"Fina", "Anisa"}};
        
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < nama[i].length; j++) {
                System.out.print(nama[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
