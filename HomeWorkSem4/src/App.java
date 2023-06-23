import Solution.Task1;
import Solution.Task2;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws IOException 
    {
        try (Scanner in = new Scanner(System.in)) { //главное меню (через сканер) с выбором номера задачи, которую будем решать
            System.out.println("1) Задача №1 (метод, который вернет @перевернутый@ список в LinkedList");
            System.out.println("2) Задача №2 (реализация очереди, с помощью LinkedList с методами:enqueue() и dequeue()");
            System.out.print("Какой номер задачи будем решать?: ");
            int task = in.nextInt();
                    
            switch(task) // запуск задачи, в зависимости от выбора пользователя
            {
                case 1: // реализация задачи №1
                Task1<String> list = new Task1<>(new LinkedList<>());
                list.addListElem("12");
                list.addListElem("14");
                list.addListElem("40");
                list.addListElem("44");       
                System.out.println("Исходный список = " + list.getList());
                list.reverseList(list.getList());
                System.out.println("Перевернутый список = " + list.getList() + "\n");   
                break;

                case 2: // реализация задачи №2
                Task2<Integer> element = new Task2<>(new LinkedList<>());
                element.enqueue(12);
                element.enqueue(14);
                element.enqueue(40);
                element.enqueue(44);

                System.out.println("Исходный список: " + element.getList() + "\n");
                System.out.println("Операция возврата первого элемента списка <" + element.dequeue() + "> и его удаление" );
                System.out.println("Вывод (для проверки) списка, без первого элемента: " + element.getList() + "\n");
                System.out.println("Операция возврата первого элемента списка <" + element.first() + "> без удаления");
                System.out.println("Вывод списка (для проверки сохранности первого элемента): " + element.getList());
                break;
            }
        }
    }
} 