package ArrayLesson;

import java.util.ArrayList;

public class ReturnOddNumbers {
    public void returnOddNumbers(ArrayList<Integer> numbers1) {
        for (Integer a : numbers1) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
        }
    }
}
