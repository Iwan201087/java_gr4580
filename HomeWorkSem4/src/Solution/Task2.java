package Solution;

import java.util.List;

public class Task2<T>
{
/*
2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
*/
    private List<T> list;
    public List<T> getList(){
        return list;
    }
    public Task2(List<T> list){
        this.list = list;
    }
    public void enqueue(T argument){ // метода для пперемещения  элемента в конец очереди,
        this.list.add(argument);
    }
    public T dequeue(){ //метод для реализации возврата  первого элемента из очереди и его удаления
        T temp = this.list.get(0);
        this.list.remove(0);
        return temp;
    }
    public T first(){ // метод для реализации возврата первого элемента из очереди, без его удаления
       return this.list.get(0);
    }
}