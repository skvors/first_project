package examples;

import java.io.IOException;


public class Some_algoritms
{
    public static class Newint
    {
        int value;
    }

    public static void exchanges(Newint x, Newint y)       //меняем местами числа x и y
    {
        y.value = x.value + y.value;
        x.value = y.value - x.value;
        y.value = y.value - x.value;
    }

    public static double convertEurToUsd(int eur, double course)   //переводит евро в доллары по заданному курсу
    {
        return eur*course;
    }

    public static void mathtabl()         // выводит таблицу умножения 10*10
    {
        for (int i = 1; i < 11; i++)
        {
            for (int j = 1; j < 11; j++)
            {
                //System.out.print(i*j + " ");       //использование обфчного вывода
                System.out.printf("%4d",i*j);        //вывод и форматирование "%4d" - по 4 символа на каждое выводимое число (d для целых чисел)
            }
            System.out.println();
        }
    }

    /* Количество дней в году
    Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
    "количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.
    Подсказка: В високосном году - 366 дней, тогда как в обычном  - 365.
    Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
    Годы 2100, 2200 и 2300 — невисокосные.            */

    public static void check_big_year(int year)        //проверяет год на высокосность, и выдает сколько в нем дней
    {
        if ((year % 100) == 0)
        {
            if ((year % 400) != 0)
                System.out.println("количество дней в " + year + " году: 365");
            else
                System.out.println("количество дней в " + year + " году: 366");
        }
        else
        {
            if ((year % 4) == 0)
                System.out.println("количество дней в " + year + " году: 366");
            else
                System.out.println("количество дней в " + year + " году: 365");
        }
    }


    /* Рисуем треугольник
    Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    Пример:
    8
    88
    888
    ...            */

    public static void triangle()
    {
        for (int i = 1; i < 11; i++)
        {
            for (int j = 0; j < i; j++)
                System.out.print("8");
            System.out.println();
        }
    }

    public static int sumDigitsInNumber(long number)          //сумма цифр числа
    {
        String str = Long.toString(number);
        int sum = 0;
        String symbol;

        for (int i = 0; i < str.length(); i++)
        {
            symbol = str.substring(i,i+1);
            sum = sum + Integer.parseInt(symbol);
        }
        return sum;
    }

    public static double convertCelsiumToFahrenheit(int celsium) {  //переводит градусы цельсия в градусы фаренгейта
        double fahrenheit = ((double)celsium * 9 / 5) + 32;
        return fahrenheit;
    }

    public static double convertFahrenheitToCelsium(double fahrenheit) {  //переводит градусы фаренгейта в градусы цельсия
        double celsium = (fahrenheit - 32) * 5 / 9;
        return celsium;
    }


    //using examples

    public static void example5() {
        System.out.println("celsium 41 = fahrenheit " + convertCelsiumToFahrenheit(41));
        System.out.println("fahrenheit 105 = celsium " + convertFahrenheitToCelsium(105.8));
    }

    public static void example1()
    {
        Newint a = new Newint();
        a.value = 7;

        Newint b = new Newint();
        b.value = 9;

        System.out.println("Before a="+a.value+" b="+b.value);
        exchanges(a,b);
        System.out.println("After a="+a.value+" b="+b.value);

        int a1 = 5, b1 = 7;
        int m = useful_functions.min2(a1, b1);
        System.out.println("Minimum is "+ m);

        mathtabl();

        System.out.print("日本語");      //Выводит на экран 日本語
    }

    public static void example2() throws IOException
    {
        int[] my_mas = Massives.initializeArray(20);
        Massives.print_mas(my_mas);
    }

    public static void example3()
    {
        check_big_year(700);
        check_big_year(1800);
        check_big_year(1900);
        check_big_year(1600);
        check_big_year(2000);
        check_big_year(2100);
        check_big_year(2200);
        check_big_year(2300);
    }



    public static void example4 ()
    {
        triangle();
    }

    public static void main(String[] args) throws IOException
    {
        example5();

//        System.out.println(sumDigitsInNumber(123454321));
    }
}
