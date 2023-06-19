package HomeWorkSem3;

import java.util.ArrayList;

/* 
Пусть дан произвольный список целых чисел, удалить из него четные числа.
*/
public class Task2 {

    public static void RemoveEvenNumbers(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(17);
        numbers.add(21);
        numbers.add(98);
        numbers.add(46);
        numbers.add(61);
        numbers.add(56);
        numbers.add(63);
        numbers.add(8);
        System.out.println("Исходный список целых чисел: " + numbers);
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("Измененный список (без четных чисел): " + numbers);
    }
}