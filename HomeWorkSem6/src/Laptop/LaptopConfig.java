package Laptop;

import java.util.Objects;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
Реализовать в java. Создать множество ноутбуков. Переопределить toString, equals и hashCode.
Вывести на печать экземпляры класса, сравнить пару экземпляров и найти один экземпляр в наборе.
 */
public class LaptopConfig { // Описание класса
    private long id;
    private String model;
    private String color;
    private String cpu;
    private int coreCpu;
    private int ram;
    private int ssd;
    private String videoCard;
    private int memVideoCard;
    private String os;

    // ""Геттеры""
    public Long getId() {
        return id;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public String getCpu() {
        return cpu;
    }
    public int getCoreCPU() {
        return coreCpu;
    }
    public int getRam() {
        return ram;
    }
    public int getSsd() {
        return ssd;
    }
    public String getVideoCard() {
        return videoCard;
    }
    public int getMemVideoCard() {
        return memVideoCard;
    }
    public String getOs() {
        return os;
    }

    // Все варианты формирования конструкторов
    public LaptopConfig(long id, String model, String color, String cpu,
            int coreCpu, int ram, int ssd, String videoCard, int memVideoCard, String os) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.cpu = cpu;
        this.coreCpu = coreCpu;
        this.ram = ram;
        this.ssd = ssd;
        this.videoCard = videoCard;
        this.memVideoCard = memVideoCard;
        this.os = os;
    }

    @Override
    public String toString() {
        return "\n Ноутбук: " + "Id = " + id + "/" +
                " Модель: " + model + " /" +
                " Цвет: " + color + " /" +
                " Процессор: " + cpu + " /" +
                " Количество ядер процессора: " + coreCpu + " /" +
                " Оперативная память: " + ram + " /" +
                " Объем накопителя: " + ssd + " /" +
                " Модель видеокарты: " + videoCard + " /" +
                " Локальная видеопамять: " + memVideoCard + " /" +
                " Операционная система: " + os;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        LaptopConfig laptops = (LaptopConfig) o;
        return id == laptops.id &&
                model == laptops.model &&
                color == laptops.color &&
                cpu == laptops.cpu &&
                coreCpu == laptops.coreCpu &&
                ram == laptops.ram &&
                ssd == laptops.ssd &&
                videoCard == laptops.videoCard &&
                memVideoCard == laptops.memVideoCard &&
                os == laptops.os;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, cpu, coreCpu, ram, ssd, videoCard, memVideoCard, os);
    }
}