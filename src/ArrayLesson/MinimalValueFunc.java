package ArrayLesson;

import java.util.ArrayList;

public class MinimalValueFunc {
    public void minimalValueArray(ArrayList<Integer> array){
        int temp =0;
        for (Integer a : array){
            if (temp > a){
                temp = a;
            }
        }
        System.out.println(temp);
    }
}
