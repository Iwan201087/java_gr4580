import java.util.HashSet;
import Laptop.LaptopConfig;

public class App {
        public static void main(String[] args) {
                // Набор данных  через конструктор экземпляров класса ноутбуков
                LaptopConfig laptop1 = new LaptopConfig(1, "SUS TUF Gaming F15", "Черный",
                                "Intel Core i5 11400H",6, 16, 512, "NVIDIA GeForce RTX 3050",4, "NonOS");
                LaptopConfig laptop2 = new LaptopConfig(2, "Apple MacBook Pro 13 M2 2022 MNEH3", "Серый",
                                "Apple M2", 8, 8, 256, "Apple M2 GPU ",6, "Mac OS");
                LaptopConfig laptop3 = new LaptopConfig(3, "Lenovo IdeaPad Gaming 3 15ARH7 82SB00KYTX", "Черный",
                                "AMD Ryzen 5 6600H", 6, 16, 512, "INVIDIA GeForce RTX 3050",4, "Windows 11");
                LaptopConfig laptop4 = new LaptopConfig(4, "Maibenben x Mechrevo X558 X558FSFCLGRE0", "Серый",
                                "AMD Ryzen 7 5800H", 8, 16, 512, "NVIDIA GeForce RTX 3060",6, "Linux");
                LaptopConfig laptop5 = new LaptopConfig(5, "MSI Titan GT77HX 13VI-219BY", "Серый",
                                "Intel Core i9 13980HX", 24, 64, 4096, "NVIDIA GeForce RTX 4090",16, "Windows 11 Pro");

                // Создание HashSet всех конфигураций ноутбуков и добавление элементов
                HashSet<LaptopConfig> setLaptops = new HashSet<>();

                setLaptops.add(laptop1);
                setLaptops.add(laptop2);
                setLaptops.add(laptop3);
                setLaptops.add(laptop4);
                setLaptops.add(laptop5);

                // Вывод HashSet ноутбуков на экран
                System.out.print(setLaptops.toString());

                // Сравнение экземпляров объектов через метод equals
                System.out.println("\nСравнение экземпляров объектов через метод equals: ");
                System.out.println(laptop1.equals(laptop2));
                System.out.println(laptop3.equals(laptop3));

                // Сравнивнение экземпляров объектов через метод hashCode
                System.out.println("\nСравнивнение экземпляров объектов через метод hashCode: ");
                System.out.println(laptop3.hashCode());
                System.out.println(laptop5.hashCode());

                // Поиск экземпляра объекта в HashSet
                System.out.println("\nЭкземпляр объекта в HashSet: " + setLaptops.contains(laptop5));
        }
}