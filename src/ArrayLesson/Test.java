package ArrayLesson;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
       /* ArrayList<String> array = new ArrayList<>();
        array.add("One");
        array.add("Two");
        array.add("Three");
        array.add("Four");
        array.add("Five");

        System.out.println(array);*/
        //Удаление элемента из ArrayList
        /*array.remove("One");

        System.out.println(array);*/

        //Получение индекса элемента в ArrayList
        /*System.out.println(array.get(1));*/

        //Нужно пробежаться по ArrayList с использованием цикла for-each
        /*for (String a : array){
            System.out.println(a);
        }*/

        //Дан ArrayList, содержащий целые числа. Напишите метод, который вернет новый ArrayList, содержащий только нечетные числа из исходного списка.
      /*  ReturnOddNumbers return1 = new ReturnOddNumbers();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        return1.returnOddNumbers(numbers);
*/


        SummArrayNumbers summ = new SummArrayNumbers();
        ArrayList<Integer> numbers = new ArrayList<>();
        BiggerValueFunc big = new BiggerValueFunc();
        MinimalValueFunc min = new MinimalValueFunc();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //Сумма элементов в ArrayList
        /*summ.summNumbers(numbers);*/

        //Нахождение минимального и максимального значения в ArrayList
        /*big.biggerValueArray(numbers);
        min.minimalValueArray(numbers);*/

        ReverseArrayFunc reverseArrayFunc = new ReverseArrayFunc();
        reverseArrayFunc.reverseArray(numbers);







    }
}
