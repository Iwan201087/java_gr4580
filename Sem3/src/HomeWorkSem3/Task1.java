package HomeWorkSem3;

import java.util.Arrays;

/*
Реализовать алгоритм сортировки слиянием(метод взять из Интернета)
*/

public class Task1 {

    public static void SortMergeMain(String args[]) 
    {
        int[] newArr = {1, -10, 52, -20, 74, 86, 12};
        System.out.println(Arrays.toString(newArr));
        int[] result = sortMerge(newArr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortMerge(int[] newArr)
    {
        int[] buf1 = Arrays.copyOf(newArr, newArr.length);
        int[] buf2 = new int[newArr.length];
        int[] result = mergeSort(buf1, buf2, 0, newArr.length);
        return result;
    }

    public static int[] mergeSort(int[] buf1, int[] buf2, int startIndex, int endIndex) 
    {
        if (startIndex >= endIndex - 1)
            return buf1;
        int mid = startIndex + (endIndex - startIndex) / 2;
        int[] sort1 = mergeSort(buf1, buf2, startIndex, mid);
        int[] sort2 = mergeSort(buf1, buf2, mid, endIndex);
        int index1 = startIndex;
        int index2 = mid;
        int destIndex = startIndex;
        int[] result = sort1 == buf1 ? buf2 : buf1;
        while (index1 < mid && index2 < endIndex)
        {
            if (sort1[index1] < sort2[index2]){
                result[destIndex++] = sort1[index1++];
            }else
                result[destIndex++] = sort2[index2++];
        }
        while (index1 < mid) 
            result[destIndex++] = sort1[index1++];
        while (index2 < endIndex) 
            result[destIndex++] = sort2[index2++];
        return result;
    }
}