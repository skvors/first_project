package examples;


public class useful_functions
{
    //for numbers

    public static int count_num(int a)            //определение количества символов в числе
    {
        String s = Integer.toString(a);           //преобразование переменной a в строку
        return s.length();                        //определение длины строки s
    }

    public static int abs(int a)           //высчитывает модуль числа
    {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    /* Ближайшее к 10
    Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
    Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
    Подсказка:  используйте метод public static int abs(int a), который возвращает абсолютную величину числа. */

    public static void closeToTen(int a, int b)
    {
        if (abs(a-10) < abs(b-10))
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static int min2(int c, int d)           //нахождение минимума двух чисел
    {
        int m;
        if (c < d)
            m = c;
        else
            m = d;
        return m;
    }

    public static int min3(int a, int b, int c)       //нахождение минимума трех чисел
    {
        int m;
        if (min2(a,b) < c)
            m = min2(a,b);
        else
            m = c;
        return m;
    }

    public static int min4(int a, int b, int c, int d)       //нахождение минимума четырех чисел
    {
        int m;
        if (min2(a,b) < min2(c,d))
            m = min2(a,b);
        else
            m = min2(c,d);
        return m;
    }


    //using examples

    public static void example1()
    {
        closeToTen(8,11);
        closeToTen(14,7);
    }

    public static void main(String[] args)
    {
        example1();
    }

}







