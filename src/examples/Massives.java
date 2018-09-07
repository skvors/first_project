package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Massives                 //Массивы - уровень 7 лекция 1
{                                     //Примеры использования массивов уровень 7 лекция 3
    //Начальное значение для всех ячеек – null, для примитивных типов – 0, 0.0 (для дробных), false (для типа boolean).
    //Точно такое же, как и у простых неинициализированных переменных.


    //useful funtions

    public static int[] create_rand_mas(int leng, int diapazon)        //задания массива случайных чисел
    {
        int[] mas = new int[leng];                            //leng длина массива
        for (int i = 0; i < mas.length; i++)
        {
            mas[i] = (int)(Math.random()*diapazon);           //случайное число от 1 до diap
        }
        return mas;
    }

    public static int[] copy_mas(int[] mas)        //копирование значений массива в другой массив
    {
        int[] tmas = new int[mas.length];
        for (int i = 0; i < mas.length; i++)
        {
            tmas[i] = mas[i];
        }
        return tmas;
    }

    public static void print_mas(int[] mas)         //печать значений элементов массива
    {
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        System.out.println();
    }


    public static class Input_type
    {
        public String str;
        boolean error;
    }

    public static Input_type input_str()    // извращенный метод чтения с клавы (возможно надо переписать)
    {
        Input_type input_object = new Input_type();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            input_object.str = reader.readLine();
            input_object.error = false;
        }
        catch (IOException e)
        {
            input_object.str = null;
            input_object.error = true;
        }
        return input_object;
    }

    public static String simple_input_str()  // ввод строки с клавиатуры (с обработчиком исключений)  (возможно ее надо перенести в read_lines)
    {
        String str = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            str = reader.readLine();
        }
        catch (IOException e)
        {
            str = null;
            System.out.println("IOException");
        }
        return str;
    }

    public static int[] initializeArray(int mas_length)    //Ввод элементов массива длиной n с клавиатуры
    {
        System.out.println("Введите массив из " + mas_length + " чисел");
        int[] my_mas = new int[mas_length];

        String sNum;
        for(int i = 0; i < my_mas.length; i++)
        {
            sNum = simple_input_str();
            my_mas[i] = Integer.parseInt(sNum);            //здесь надо бы проверку: является ли строка числом
        }
        return my_mas;
    }

    public static int max(int[] array)         //Поиск максимального значения элементов массива
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }


    //using examples

    public static void example1()                      // различные примеры использования
    {
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};       //статическая инициализация массива

        String[] list = new String[5];                 //Создание массива на 5 элементов типа «строка»
        System.out.println(list[0]);                   //На экран будет выведено значение “null”.

        int listCount = list.length;                   //list.length хранит длину(количество ячеек) массива.

        list[1] = "Mama";                              //примеры присваиваания
        String s = list[1];

        for (int i = 0; i < list.length; i++)          //Вывод всех значений массива на экран.
        {
            System.out.println(list[i]);
        }
    }

    public static void example2()
    {
        int[] mas = initializeArray(4);
        print_mas(mas);
    }

    public static void main(String[] args)
    {
        example2();
    }
}




/*

 */