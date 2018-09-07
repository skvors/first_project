package examples;

import java.lang.String;           //типа можно вывать метод из другого класса (типа это адрес файла где он находится)

/* JavaRush. Learn once - use anywhere
выводит на экран надпись: «JavaRush. Learn once - use anywhere» 10 раз.
*/

//использование процедур(методов)
public class functions_example
{
    public static void print5Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }

    public static double pi()
    {
        return 3.14;
    }

    public static double sqr(double a)  //Функция/Метод
    {
        return a * a;
    }

    public static void print_salary(int size, String s)
    {
        System.out.println("Я согласен на зарплату $" + size + "/месяц в " + s + " год.");
    }

    public static void main(String[] args)
    {
        //напишите тут ваш код
        String f = "JavaRush. Learn once - use anywhere";
        print5Times(f);
        print5Times(f);

        print_salary(800, "первый");
        print_salary(1500, "второй");
    }
}

