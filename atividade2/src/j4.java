import java.util.Arrays;
import java.util.*;

public class j4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 65, 2, 7, 25, 161, 6236, 2, 2}; //array completo
        int big = Arrays.stream(arr1).max().getAsInt();
        System.out.print("O maior valor é " +big);
    }
}
