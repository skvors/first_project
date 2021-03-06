package examples;

import java.util.Calendar;
import java.util.Date;


//Описание базовых типов уровень 10 лекция 2
//Описание типов с примерами значений уровень 10 лекция 2

//код – это методы, классы, переменные,…, а литералы – это конкретные значения переменных, записанные прямо в коде

public class variables
{
    public static void variables_example()
    {
             //создание переменных
        int a, b, c;
        int x;                  //целые числа
        String s;               //текст/строки
        double m;               //дробные
        char sm;                //один символ

        boolean isTrue = true;   //Переменная логического типа инициализируется значением true (истина)
        boolean isLess = (5 > 6);  //В переменную isLess заносится значение false (ложь). Других значений тип boolean не принимает.

        //присваивание
        x = 3;
        x = x + 1;

             //Создание двух идентичных пустых строк.
        String s1 = new String();
        String s2 = "";

             //можно одновременно создавать переменную и присваивать ей значение
        int c1 = 7, d1=5;
        int d2 = c1+1;
        String s3 = "I’m Amigo";

             //Строки можно склеивать с помощью знака плюс – «+»
        String s4 = "Amigo" + " is the best";    //s будет содержать текст «Amigo is the best».

        Date date = new Date(); //Создание объекта типа «Дата». В каждый объект типа «дата» после создания заносится текущее время и дата.
    }

    public static void variables_example_1()
    {
        //a / b – это деление нацело. Ответом будет два. Остаток от деления просто отбрасывается.
        int a = 11;
        int b = 5;
        int c = a / b; // c == 2
    }

    public static void variables_example_2()
    {
        //В d будет храниться остаток от деления a на b нацело. Остаток равен 3.
        int a = 13;
        int b = 5;
        int d = a % b; // d == 3
    }

    public static void variables_example_3()
    {
        /* ператор деления по модулю - оператор mod, обозначается символом %.
    Этот оператор возвращает остаток от деления первого операнда на второй.
    Функция mod в Java работает не только с целыми, но и с вещественными типами.
    Приведенная ниже программа иллюстрирует работу этого оператора.

    Выполнив эту программу, вы получите следующий результат:
    х mod 10 = 2
    у mod 10 = 2.3          */

        int x = 42;
        double у = 42.30;
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + у % 10);
    }

    public static void variables_example_4()
    {
        //как выделить из числа целую часть
        double src = 123.45;
        int res = (int)src; //целая часть
        double res2 = src - res; //дробная часть
    }

    /*      //уровень 10 лекция 1 - жосткая типизация объектов
    При делении двух целых чисел, результатом тоже будет целое число.
    Если разделить 5 на 3, то ответом будет 1 и два в остатке. Остаток при этом отбрасывается.

    В Java числа перед делением лучше всего приводить к вещественному (дробному) типу
    путем умножения их на вещественную единицу – 1.0

    int a = 1/3; 	a будет содержать 0
    double d = 1/3; 	d будет содержать 0.0
    double d = 1.0 / 3; 	d будет содержать 0.333(3)
    double d = 1 / 3.0; 	d будет содержать 0.333(3)

    int a=5, b=7;
    double d = (a*1.0) / b; 	d будет содержать 0.7142857142857143

            //уровень 10 лекция 3
    При сужении типа мы должны явно показать компилятору,
    что мы не ошиблись и отбрасывание части числа сделано намеренно.
    Для этого используется оператор приведения типа. Это имя типа в круглых скобочках.

    int c = 10000;
    byte d = (byte) c;

    int a = 259;
    System.out.println((byte) a);   // 3, это остаток от деления 259 на 256



    Сужение во всех операция присваивания, кроме первой строки, требует указания явного преобразования типа.

            //К типу long приводится только одна переменная из двух: умножение long и float дает float.
    float f = 10000;
    long l = (long) f * f;

            //Тут все выражение приводится к типу long.
    float f = 10000;
    long l = (long) (f * f);
    */




    //статические переменные почему-то пишут большими буквами



    public static void main(String[] args)
    {
        System.out.print("All OK");
    }

}
