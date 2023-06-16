/*
 4) К калькулятору из предыдущего ДЗ добавить логирование.
 */
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.util.Scanner;

public class Task4 
{
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler filehand = new FileHandler("PrimeСalcLog.xml");
        logger.addHandler(filehand);
        XMLFormatter xml = new XMLFormatter();
        filehand.setFormatter(xml);
        logger.info("Работа простого калькулятора");
        PrimeIntCalculator();
    }

    private static void PrimeIntCalculator() {

        
        try (Scanner scanner = new Scanner(System.in)){
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
}
