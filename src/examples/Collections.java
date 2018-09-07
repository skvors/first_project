package examples;

import java.util.*;

/*
В Java коллекции делятся на три основных группы: Set - множество, List - список, Map - словарь (или карта)

ArrayList 	Список
LinkedList 	Список
Vector 	    Вектор
Stack 	    Стек

HashSet 	Множество
TreeSet 	Множество
SortedSet 	Отсортированное множество

HashMap 	Карта/Словарь
TreeMap 	Карта/Словарь
SortedMap 	Отсортированный словарь
Hashtable 	Хеш-таблица
 */

public class Collections              //Коллекции  Уровень 8, лекция 1
{
    public static void print_set()                   //Вывод на экран элементов Set
    {
        Set<String> set = new HashSet<String>();    // ~ символ,чтоб еще раз не писать тип
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        //получение итератора для множества
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }
    }

    public static void quick_print_set()                 //тоже самое но кратко
    {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        for (String text : set)                        //сокращенная запись цикла
        {
            System.out.println(text);
        }
    }

    /*  Iterator<String> iterator = set.iterator();   //расширенная запись
        while (iterator.hasNext())
        {
            String text = iterator.next();

        for (String text : set)                      //сокращенная запись

        Оператор for-each используется только при работе с коллекциями и контейнерами.
        В нем неявно используется итератор, но мы видим уже полученный элемент.

        Используя этот опреатор нельзя удалять
        Для удаления всегда использовать итератор
    */

    public static void print_list()              //Вывод на экран элементов List
    {
        List<String> list = new ArrayList<String>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

        Iterator<String> iterator = list.iterator();//получение итератора для списка

        while (iterator.hasNext())      //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }
    }

    public static void print_map()               //Вывод на экран элементов Map
    {
        //все элементы хранятся в парах
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + ":" + value);
        }
    }

    public static void quick_print_map_1()               ////тоже самое но кратко
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
    }

    /** Удаление из HashMap элемента удовлетворяющего условию (здесь значение < 500)
     *
     * @param map
     */
    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copymap = new HashMap<String, Integer>(map);   // создаем копию HashMap

        Iterator<Map.Entry<String, Integer>> iterator = copymap.entrySet().iterator();

        while(iterator.hasNext()) {                                             // пробегаемся по копии
            Map.Entry<String, Integer> pair = iterator.next();
            int salary = pair.getValue();
            if (salary < 500) {
                map.remove(pair.getKey());                                      // удаляем из нужного нам HashMap по ключу
            }
        }
    }

    static class Solution_map_1             // интересная вывод на экран мапы
    {
        static Map<Double, String> labels = new HashMap<Double, String>();

        static
        {
            labels.put(1.4, "H and M");
            labels.put(1.5, "Gloria Jins");
            labels.put(1.6, "Alcampo");
            labels.put(1.7, "Colins");
            labels.put(1.8, "Stradivarius");
        }

        static void print()
        {
            System.out.println(labels);
        }
    }



    public static void main(String[] args)
    {
        Solution_map_1.print();
    }
}
