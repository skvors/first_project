package Object_examples;

    //оператор instanceof         14 уровень, 1 лекция

    /*  Он используется в виде: «объект» instanceof «класс».
    Он проверяет, является ли объект объектом определенного класса.

    Оператор instanceof имеет вид: a instanceof B.
    Другими словами, оператор instanceof вернет значение true, если:
    1) переменная а хранит ссылку на объект типа B
    2) переменная a хранит ссылку на объект, класс которого унаследован от B
    3) переменная а хранит ссылку на объект реализующий интерфейс B
    Иначе оператор instanceof вернет значение false.       */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class About_instanceof
{

    //using examples

    public static void example_1() throws FileNotFoundException
    {
        Object o1 = new Integer(3);
        boolean isInt1 = o1 instanceof Integer;
        //isInt будет равно true. Объект, на который ссылается переменная o, является объектом класса Integer.

        Object o2 = "Mama";
        boolean isInt2 = o2 instanceof Integer;
        //isInt будет равно false. Объект, на который ссылается переменная o, не является объектом класса Integer, он является объектом класса String.

        InputStream is = new FileInputStream("");
        boolean isFIS = is instanceof FileInputStream;
        //isFIS будет равно true. Объект, на который ссылается переменная o, является объектом класса FileInputStream.
    }


    //Этот оператор учитывает и наследование.
    //Тут мы видим три объявленных класса: животное, кот и тигр. Кот наследуется от Животного. А Тигр от Кота.

    static class Pet
    {
    }
    static class Cat extends Pet
    {
    }
    static class Tiger extends Cat
    {
    }

    public static void example_2()
    {
        Object o = new Tiger();
        boolean isCat = o instanceof Cat;       //isCat будет равно true.
        boolean isTiger = o instanceof Tiger;   //isTiger будет равно true.
        boolean isPet = o instanceof Pet;       //isPet будет равно true.
    }

    public static void example_3()
    {
        Object o = new Pet();
        boolean isCat = o instanceof Cat;          //isCat будет равно false.
        boolean isTiger = o instanceof Tiger;      //isTiger будет равно false.
        boolean isPet = o instanceof Pet;          //isPet будет равно true.
    }


    //И даже интерфейсы
    //Создадим два класса: Cat, TomCat и интерфейс Moveable

    interface Moveable
    {
    }
    static class Cat1
    {
    }
    static class TomCat extends Cat1 implements Moveable
    {
    }

    public static void example_4()
    {
        Cat1 o = new TomCat();
        boolean isCat = o instanceof Cat1;              //isCat будет равно true.
        boolean isMoveable = o instanceof Moveable;     //isMoveable будет равно true.
        boolean isTom = o instanceof TomCat;            //isTom будет равно true.
    }

    public static void example_5()
    {
        Cat1 o = new Cat1();
        boolean isCat = o instanceof Cat1;              //isCat будет равно true.
        boolean isMoveable = o instanceof Moveable;     //isMoveable будет равно false.
        boolean isTom = o instanceof TomCat;            //isTom будет равно false.
    }





    public static void main(String[] args)
    {
    }
}
