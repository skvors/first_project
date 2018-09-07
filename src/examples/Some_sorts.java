package examples;

import java.util.Arrays;
import java.util.Date;

public class Some_sorts
{
    public static void bubbleSort(int[] arr)                                //сортировка пузырьком по возрастанию
    {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void sort_javarush_1(int[] array) {                      //интересная сортировка из задачи task17.task1702
        for (int i = 0; i < array.length - 1; i++) {                       //очень похоже на Selection Sort
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
    }
    /*      насколько я понял, здесь вначале берется первый элемент, и все остальные сравниваются с ним,
    далее берется второй элемент и все лементы начиная с 3 сравниваются с ним и т. д.
    То есть мы вначале находим самый маленький, ставим его на первую позицию,
    из оставшихся снова находим самый маленький, ставим на вторую и т. д.
     */


    public static void my_bubble_sort(int[] array) //сортировка пузырьком написанная мной(вроде корректно работает, но желательно проверить)
    {
        int temp;
        for (int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
            {
                if (array[j+1] < array[j])
                {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void print_bubbleSort_time (int[] mas)                   //подсчет времени выполнения bubbleSort
    {
        int[] tmas = Massives.copy_mas(mas);
        Date date1 = new Date();
        bubbleSort(tmas);
        Date date2 = new Date();
        long delay = date2.getTime() - date1.getTime();
        System.out.println("bubbleSort_time " + delay + " ms");
    }

    public static void mergeSort(int[] mas)                                 //void обертка mergeSort
    {
        int[] tmas = func_mergeSort(mas);
        for (int i = 0; i < mas.length; i++)
            mas[i] = tmas[i];
    }

    private static int[] func_mergeSort(int[] arr)                          //сортировка mergeSort по возрастанию
    {
        int len = arr.length;
        if (len < 2) return arr;
        int middle = len / 2;
        return merge(func_mergeSort(Arrays.copyOfRange(arr, 0, middle)),
                func_mergeSort(Arrays.copyOfRange(arr, middle, len)));
    }

    private static int[] merge(int[] arr_1, int[] arr_2)                 //промежуточная функция для mergeSort
    {
        int len_1 = arr_1.length, len_2 = arr_2.length;
        int a = 0, b = 0, len = len_1 + len_2; // a, b - счетчики в массивах
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
                else result[i] = arr_1[a++];
            } else if (b < len_2) {
                result[i] = arr_2[b++];
            } else {
                result[i] = arr_1[a++];
            }
        }
        return result;
    }

    public static void print_mergeSort_time (int[] mas)         //подсчет времени выполнения mergeSort
    {
        int[] tmas = Massives.copy_mas(mas);
        Date date1 = new Date();
        mergeSort(tmas);
        Date date2 = new Date();
        long delay = date2.getTime() - date1.getTime();
        System.out.println("mergeSort_time " + delay + " ms");
    }

    public static void example1()
    {
        int[] mas = Massives.create_rand_mas(100, 10000);

        System.out.println("Original massive");
        Massives.print_mas(mas);
        print_bubbleSort_time(mas);
        print_mergeSort_time(mas);
        //print_mas(mas);
        mergeSort(mas);
        //bubbleSort(mas);
        System.out.println("Sorted massive");
        Massives.print_mas(mas);
    }

    public static void main(String[] args)
    {
        example1();
    }
}
