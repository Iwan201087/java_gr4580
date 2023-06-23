package Solution;

import java.util.Collections;
import java.util.List;

public class Task1<T> 
{
/*
1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
    private List<T> list; 

    public Task1(List<T> list){
        this.list = list;
    }
    public List<T> getList() {
        return list;
    }
    public void addListElem(T element) { //void метод для добавления элементов в список
        this.list.add(element);
    }
    public void reverseList(List<T> list){ //void метод для переворачивания списка 
        Collections.reverse(list);
    }
}