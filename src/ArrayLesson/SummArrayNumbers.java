package ArrayLesson;

import java.util.ArrayList;

public class SummArrayNumbers {
    public void summNumbers(ArrayList<Integer> numbers){
        int temp = 0;
        for (Integer a : numbers){
            temp += a;
        }
        System.out.println(temp);
    }
}
