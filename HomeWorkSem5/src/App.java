import java.util.Scanner;
import Task1.phoneBook;
import Task2.heapSort;

public class App {
    public static void main(String[] args)  
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("1) Реализация структуры телефонной книги с помощью HashMap и сортировкой контактов в телефонной книге");
            System.out.println("2) Реализация пирамидальной сортировки (HeapSort)");
            System.out.print("Какую задачу будем решать?: ");
            int tasks = in.nextInt();

            switch(tasks)
            {
                case 1:
                phoneBook phonebook = new phoneBook();
                phonebook.addNewContact("Курочкин Василий Васильевич", "+375291234567");
                phonebook.addNewContact("Кринский Евгений Владимирович", "+375297561258");
                phonebook.addNewContact("Юдицкий Иван Михайлович", "+375334521478");
                phonebook.addNewContact("Гуринович Виталий Николаевич", "+375298451278");
                phonebook.addNewContact("Курдин Дмитрий Андреевич", "+375295792245");
                phonebook.addNewContact("Солонинко Олег Валентинович", "+375291585678");
                phonebook.addNewContact("Юдицкий Иван Михайлович", "+375297452477");
                phonebook.addNewContact("Гуринович Виталий Николаевич", "+375447851249");
                phonebook.addNewContact("Курочкин Василий Васильевич", "+375298971247");
                phonebook.addNewContact("Юдицкий Иван Михайлович", "+375291064929");
                phonebook.sortContacts();
                break;
                
                case 2:
                int [] array = new int[] {10, 29, 125, 452, 4100, 53, 5, 756};
                int n = array.length;
                System.out.println("Исходный массив:");
                for (int i = 0; i < n; ++i)
                    System.out.println(array[i]);
                                
                heapSort.sort(array);
                System.out.println("Массив после сортировки:");
                for (int i = 0; i < n; ++i)
                    System.out.println(array[i]);
                break;
            }
        }
    }
}