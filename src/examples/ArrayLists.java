package examples;

import java.util.ArrayList;


public class ArrayLists                          //уровень 7 лекция 5
{

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();      //Создание контейнера элементов
        int n = list.size();                                   //Получение количества элементов
        String s = list.get(3);                                //Взятие элемента из массива/коллекции
        list.set(3, s);                                        //Запись элемента в массив

        list.add(s);                                           //Добавление элемента в конец массива
        list.add(15, s);                                       //Вставка элемента в середину массива
        list.add(0, s);                                        //Вставка элемента в начало массива
        list.remove(3);                                        //Удаление элемента из массива


        ArrayList list2 = new ArrayList();                   //В таком листе можно хранить переменные любого типа.
    }

    /*
    Список (анг. List), чаще всего под этим словом подразумевается ArrayList.
    Строка (анг. String), под этим подразумевается тип String.
    Создать список строк чаще всего означает: ArrayList<String> list = new ArrayList<String>();
    */




}
