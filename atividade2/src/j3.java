import java.util.Arrays;

public class j3 {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 1, 6, 3, 7, 2, 6};
        int[] array2 = array1.clone(); // Clonando array1 para array2
        System.out.println("O array inicial é");
        System.out.println(Arrays.toString(array1)); // Imprimindo o array2
        System.out.println("O segundo array copiado é ");
        System.out.println(Arrays.toString(array2));
    }
}