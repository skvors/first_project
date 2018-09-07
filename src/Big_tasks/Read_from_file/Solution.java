package Big_tasks.Read_from_file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*      Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.     */


//для тестов был создан файл C:\for_java\test_1.txt

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        FileInputStream file = new FileInputStream(str);  //считываем имя файла

        ArrayList<Integer> list_bites = new ArrayList<Integer>();   //массив для байтов(символов)
        ArrayList<Integer> list_repeats = new ArrayList<Integer>(); //массив для количества повторений этих байтов

        list_bites.add(file.read());
        list_repeats.add(1);

        int index;
        int temp;

        while (file.available() > 0)
        {
            temp = file.read();
            if (list_bites.contains(temp))    //если символ есть в массиве, то увелич колич повторов
            {
                index = list_bites.indexOf(temp);
                list_repeats.set(index, list_repeats.get(index) + 1);
            }
            else                            //если символа нет, то добавляем его в массив
            {
                list_bites.add(temp);         
                list_repeats.add(1);
            }
        }
        file.close();
        
        int max = list_repeats.get(0);

        for (int i = 1; i < list_repeats.size(); i++)         //находим наибольшее число повторений
        {
            if (list_repeats.get(i) > max)
                max = list_repeats.get(i);
        }

        for (int i = 0; i < list_repeats.size(); i++)         //выводим все байты с наибольшим числом повторений
        {
            if (list_repeats.get(i) == max)
            {
                System.out.print(list_bites.get(i) + " ");    //выводим эти байты

                char symbol = (char)(byte)(int)list_bites.get(i);    //преобразовываем этот байт в символ      
                System.out.println(symbol);                   //выводим на экран этот символ
            }
        }
    }
}
