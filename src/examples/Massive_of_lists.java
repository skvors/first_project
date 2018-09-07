package examples;

/*
Массив списков строк

Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.
*/

import java.util.ArrayList;

public class Massive_of_lists
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код

        ArrayList<String> first  = new ArrayList<String>();
        for(int i = 0; i < 10; i++)
            first.add("first_" + i);

        ArrayList<String> second  = new ArrayList<String>();
        for(int i = 0; i < 10; i++)
            first.add("second_" + i);

        ArrayList<String> third  = new ArrayList<String>();
        for(int i = 0; i < 10; i++)
            first.add("third_" + i);

        ArrayList<String>[] mas = new ArrayList[3];

        mas[0] = first;
        mas[1] = second;
        mas[2] = third;

        return mas;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list : arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}


