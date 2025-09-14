package Company_Questions;
import java.util.Arrays;

public class Nitor_Infotech_Merge {

    public static void main(String[] args) {
        int ar1[] = {1, 5, 7, 11};
        int ar2[] = {2, 6, 9};

        int finalar[] = new int[ar1.length + ar2.length];

        int i = 0, j = 0, k = 0;

        // Merge two sorted arrays in O(n) time
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] <= ar2[j]) {
                finalar[k++] = ar1[i++];
            } else {
                finalar[k++] = ar2[j++];
            }
        }

        // Copy remaining elements from ar1
        while (i < ar1.length) {
            finalar[k++] = ar1[i++];
        }

        // Copy remaining elements from ar2
        while (j < ar2.length) {
            finalar[k++] = ar2[j++];
        }

        // Print merged sorted array
        System.out.println(Arrays.toString(finalar));
    }
}
