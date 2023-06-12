/*
1) Вычислить сумма чисел от 1 до n
2) Вывести все простые числа от 1 до 1000
3) Реализовать простой калькулятор
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception { //главное меню main, для выбора номера задания
        Scanner in = new Scanner(System.in);
        System.out.println("1) Вычислить сумма чисел от 1 до n");
        System.out.println("2) Вывести все простые числа от 1 до 1000");
        System.out.println("3) Реализовать простой калькулятор");
        System.out.println("Ввыедите номер задачи  из домашнего задания №1: ");
        int tasks = in.nextInt(); // запрос ввода номера задачи
        switch(tasks){
            case 1: // задание №1
                SumNumbers();
                break;
            case 2: // задание №2
                PrimeNumbersTo1000();
                break;
            case 3: // задание №3
                PrimeIntCalculator();
                break;
        }
    }

    private static void SumNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите конечное число, до которого необходимо выводить сумму: ");
        int finNum = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= finNum; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + finNum + " равна " + sum);
    }

    private static void PrimeNumbersTo1000() {
        System.out.println("Все известные простые числа от 1 до 1000: "); // решение через цикл, без оборачивания в метод
        for (int i = 1; i <= 1000; i++) {
            boolean numPrime = true; // проверка, является ли число простым
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    numPrime = false; // если проверка не пройдена, то прерываем выполнение программы
                    break;
                }
            }
            if (numPrime) { // если проверка пройдена, то выводим это число
                System.out.print(i + ", ");
            }
        }
    }

    private static void PrimeIntCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        char mathOperation = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        int result = 0;

        switch (mathOperation) {
            case '+': // операция сложения
                result = num1 + num2;
                break;
            case '-': // операция вычитания
                result = num1 - num2;
                break;
            case '*': // операция умножения
                result = num1 * num2;
                break;
            case '/': // операция деления
                result = num1 / num2;
                break;
            default: // если введеные отличные от нужных символы
                System.out.println("Ошибка ввода");
                return;
        }
        System.out.println(num1 + " " + mathOperation + " " + num2 + " = " + result);
    }
}