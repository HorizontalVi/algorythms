package BubbleSortAlgorytm;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arrays = {5,4,3,2,1};

        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < arrays.length; i++){
                if (arrays[i] < arrays[i-1]){
                    int temp = arrays[i];
                    arrays[i] = arrays[i - 1];
                    arrays[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.print(Arrays.toString(arrays));
    }
}