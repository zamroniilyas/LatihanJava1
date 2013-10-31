public class ArrayDinamis {
    public static void main(String[] args) {
        int inputKolom = Integer.parseInt(JOptionPane.showInputDialog("Input panjang kolom"));
        int inputBaris = Integer.parseInt(JOptionPane.showInputDialog("Input panjang baris"));
        
        int matrix[][]=new int[inputBaris][inputKolom];
        System.out.println("Jumlah kolom : "+inputKolom);
        System.out.println("Jumlah baris : "+inputBaris);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=(int) (Math.random()*100);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }   
}
