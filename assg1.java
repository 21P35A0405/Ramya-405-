import java.util.Arrays;

public class assg1 {
         public static void main(String[] args) {
            int[] arrnum = {25, 35, 12, 4, 36, 48};
            int sum = 0;
            
            for (int i = 0; i < arrnum.length; i++) {
                sum += arrnum[i];
                arrnum[i] = sum;
            }
            
            System.out.println(Arrays.toString(arrnum));
        }
    }
    