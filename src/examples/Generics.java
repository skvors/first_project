package examples;


//Generics. “Дженерики” – это типы с параметром.    уровень 7 лекция 7

/*   В Java классы-контейнеры позволяют указывать тип их внутренних объектов.
Когда мы объявляем generic-переменную, то мы указываем не один тип,
а два: тип переменной и тип данных, которые она у себя хранит.
Хороший пример этого – ArrayList. Когда мы создаём новый объект/переменную
типа ArrayList, нам удобно указать, значения какого типа будут храниться внутри
этого списка.   */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Generics
{
    public static class Pair<X, Y>                   //здесь мы создаем свой класс использующий любые типы
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }

        public void set(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array)
    {
        Pair<Integer, Integer> pair = new Pair<Integer, Integer>(null,null);

        if (array == null || array.length == 0)
        {
            pair.set(null, null);
        }
        else
        {
            int min = array[0];
            int max = array[0];

            for (int i = 1; i < array.length; i++)
            {
                if (array[i] < min)
                    min = array[i];
                if (array[i] > max)
                    max = array[i];
            }
            pair.set(min, max);
        }
        return pair;
    }

    public static void example_1()
    {
        int[] data = Massives.create_rand_mas(20, 100);

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    /*      другой интересный пример     */

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }

    //реализуем интерфейс SimpleObject с параметром типа String.

    public static class StringObject<String> implements SimpleObject
    {
        @Override
        public SimpleObject<String> getInstance() {
            return new StringObject<String>();
        }
    }

    public static void  example_2()
    {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }


    public static void main(String[] args) throws Exception
    {
        example_2();
    }
}
