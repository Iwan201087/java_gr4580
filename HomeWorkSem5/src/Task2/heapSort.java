package Task2;

public class heapSort {
/*
2) Реализовать алгоритм пирамидальной сортировки (HeapSort)(найти метод в Интернете и включить в проект).
 */
    public static void sort(int[] array) // пирамидальная сортировка или сортировка кучей
    {
        int size = array.length;

        // Реализуем построение кучи (перегруппируем массив)
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);

        // Один за другим извлекаем элементы из кучи  
        for (int i = size - 1; i > 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    // Преобразование в двоичную кучу поддерева с корневым узлом i, что является индексом в arr[]. size - размер кучи
    static void heapify(int[] array, int size, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1;// левый = 2*i + 1
        int right = 2 * i + 2;// правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (left < size && array[left] > array[largest])
            largest = left;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (right < size && array[right] > array[largest])
            largest = right;

        // Если самый большой не корень производим свап элементов
        if (largest != i) 
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapify(array, size, largest);
        }
    }
}