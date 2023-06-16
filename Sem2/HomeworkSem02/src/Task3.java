/*
 3) Дана json-строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
import java.io.BufferedReader;
import java.io.FileReader;

public class Task3 
{
    public static void main(String[] args) throws Exception 
    {
        String [] arrayData = ReadLineFromFile("Task3.txt");
        for (String arrayDatum : arrayData) {
            System.out.println(PrintLine(arrayDatum));
        }
    }
    public static String [] ReadLineFromFile(String pathway) throws Exception 
    {
        BufferedReader buffrread = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = buffrread.readLine()) != null) 
            size += 1;
            buffrread.close();
            String [] listData = new String [size];
            int count = 0;
            BufferedReader buffrread1 = new BufferedReader(new FileReader(pathway));
            while ((str = buffrread1.readLine()) != null) 
            {
                listData[count] = str;
                count += 1;
            }
            buffrread1.close();
            return listData;
    }
    
    public static StringBuilder PrintLine(String line) 
    {
        String str1 = line.replace("{", "");
        String str2 = str1.replace("}", "");
        String str3 = str2.replaceAll("\"", "");
        String str4 = str3.replace("[", "");
        String str5 = str4.replace("]", "");
        StringBuilder result = new StringBuilder();
        String [] arrayData = str5.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i = 0; i < arrayData.length; i++) 
        {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
        }
        return result;
    }
}