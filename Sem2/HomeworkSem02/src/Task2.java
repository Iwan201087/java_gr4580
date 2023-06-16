/*
 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите 
в лог-файл.
 */
import java.io.IOException;
import java.util.logging.*;

public class Task2 
{
    public static void main(String[] args) throws IOException 
    {
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler filehand = new FileHandler("LogTask2.xml");
        logger.addHandler(filehand);
        XMLFormatter xml = new XMLFormatter();
        filehand.setFormatter(xml);
        logger.info("Исходный массив: ");
        int [] array = {50, -40,-10, 12, -30, 45, 60, -19};
        PrintArray(array);
        int[] newArr = listSort(array);
        System.out.print("\n Отсортированный массив: \n");
        PrintArray(newArr);
    }

    public static int[] listSort(int [] array)
    {
        for(int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                if (array[j] > array[j + 1]) 
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void PrintArray(int[] array) 
    {
        for (int i = 0; i < array.length; i++) System.out.printf("%d, ", array[i]);
    }
}