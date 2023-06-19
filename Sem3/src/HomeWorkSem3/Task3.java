package HomeWorkSem3;

import java.util.ArrayList;
import java.util.Collections;

/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
*/

public class Task3 {

    public static void MinMaxAvgNum() 
    {
        ArrayList<Integer> listNum = new ArrayList<Integer>();
        listNum.add(2);
        listNum.add(6);
        listNum.add(10);
        listNum.add(14);
        listNum.add(8);
        listNum.add(12);
        listNum.add(4);
        System.out.println("Исходный список целых чисел: " + listNum);
        
        int minNum = Collections.min(listNum);
        System.out.println("Минимальное значение элемента из списка: " + minNum);

        int maxNum = Collections.max(listNum);
        System.out.println("Максимальное значение элемента из списка: " + maxNum);

        int sum = 0;
        for (int i = 0; i < listNum.size(); i++)
            sum += listNum.get(i);
        int avgNum = (int) sum / listNum.size(); 
        System.out.println("Среднее значение элементов из списка': " + avgNum);
    }
}