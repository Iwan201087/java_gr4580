package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class phoneBook 
{
/*
1) Реализуйте структуру телефонной книги с помощью HashMap. Программа также должна учитывать, 
что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, 
как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
(можно выводить без сортировки, но обязательно в отдельном методе)
 */
    private static Map<String, List<String>> contacts = new HashMap<>(); 
    
    public void addNewContact(String name, String phone) // Метод добавления нового контакта в телефонную книгу
    {
        if (contacts.containsKey(name)) 
        {
            // Добавление нового телефонного номера для контакта (если данный контакт уже имеется в телефонной книге)
            List<String> phones = contacts.get(name);
            if (!phones.contains(phone)) 
                phones.add(phone);
        } else {
            // Добавление телефоннго номера ( если данного контакта еще нет в телефонной книге)
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            contacts.put(name, phones);
        }
    }
   
    public void sortContacts()  // Метод сортировки контактов( если у контакта несколько телефонных номеров)
    {
        List<Map.Entry<String, List<String>>> list = new LinkedList<>(contacts.entrySet()); // Преобразование HashMap в список Map.Entry и сортировка значений с помощью компаратора

        Collections.sort(list, new Comparator<Map.Entry<String, List<String>>>() 
        {
            @Override
            public int compare(Map.Entry<String, List<String>> s1, Map.Entry<String, List<String>> s2) 
            {
                return Integer.compare(s2.getValue().size(), s1.getValue().size());
            }
        }
        );

        System.out.println("Ваша телефонная книга:"); // Распечатка отсортированной телефонной книги (первым печается контакт с наибольшим количеством номеров, а далее по убыванию)
        for (Map.Entry<String, List<String>> entry : list) 
        {
            System.out.print(entry.getKey() + ": ");
            List<String> phones = entry.getValue();
            Collections.sort(phones);
            for (String phone : phones)
                System.out.print(phone + " ");
            System.out.println();
        }
    }
}