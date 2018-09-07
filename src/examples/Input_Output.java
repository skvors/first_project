package examples;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Input_Output
{
    /*
    //Стандартные интерфейсы: InputStream, OutputStream          13 уровень, 8 лекция

    //повторение потоков ввода вывода             //18 уровень, 1 лекция
    //FileInputStream, FileOutputStream           //18 уровень, 2 лекция
    //InputStream/OutputStream                    //18 уровень, 4 лекция

    Если объект реализует интерфейс InputStream, значит, он поддерживает последовательное чтение из него байт (byte).
    Если объект реализует интерфейс OutputStream, значит, он поддерживает последовательную запись в него байт (byte).
    Если объект реализует интерфейс Reader, значит, он поддерживает последовательное чтение из него символов (char).
    Если объект реализует интерфейс Writer, значит, он поддерживает последовательную запись в него символов (char).

    чтение и запись не по байту а блоками в буфер созданный нами вроде как производительнее     */


    /*      В этом классе реализован метод read, который позволяет последовательно вычитать все содержимое нашего списка list.
    И метод write, который позволяет записывать в наш list значения.    */

    static class MyClass
    {
        private ArrayList<Integer> list;

        public void write(int data)
        {
            list.add(data);
        }

        public int read()
        {
            int first = list.get(0);
            list.remove(0);
            return first;
        }

        public int available()
        {
            return list.size();
        }
    }

    public static void write_object() throws IOException               //Запись объекта MyClass в файл
    {
        MyClass myObject = new MyClass();
        OutputStream outStream = new FileOutputStream ("c:/my-object-data.txt");

        while (myObject.available() > 0)
        {
            int data = myObject.read(); //читаем один int из потока для чтения
            outStream.write(data); //записываем прочитанный int в другой поток.
        }
        outStream.close();
    }

    public static void read_object() throws IOException                //Чтение объекта MyClass из файла
    {
        InputStream inStream = new FileInputStream("c:/my-object-data.txt");
        MyClass myObject = new MyClass();

        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один int из потока для чтения
            myObject.write(data); //записываем прочитанный int в другой поток.
        }

        inStream.close(); //закрываем потоки
    }

    public static void example_1() throws IOException           //код копирования [данных одного] файла в другой
    {
        InputStream inStream = new FileInputStream("c:/source.txt");
        OutputStream outStream = new FileOutputStream("c:/result.txt");

        while (inStream.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = inStream.read(); //читаем один байт из потока для чтения
            outStream.write(data); //записываем прочитанный байт в другой поток.
        }

        inStream.close(); //закрываем потоки
        outStream.close();
    }


    public static void example_1_2() throws IOException       //копирование содержимого не по байту а с буфером
    {
        //Создаем поток-чтения-байт-из-файла
        FileInputStream inputStream = new FileInputStream("c:/for_java/from.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/for_java/to.txt");

        byte[] buffer = new byte[1000];
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            // прочитать очередной блок байт в переменную buffer и реальное количество в count
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count); //записать блок(часть блока) во второй поток
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream.close();
    }






    /*      Чтение файла
    1. Считать с консоли имя файла.
    2. Вывести в консоль(на экран) содержимое файла.
    3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.   */

    public static void example_2() throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();                  //для данного примера я использовал файл c:/for_java/test_1.txt

        FileInputStream file_in = new FileInputStream(str);
        while (file_in.available() > 0)                         //-1-
        {
            System.out.print((char)file_in.read());
        }
        file_in.close();
        reader.close();

        System.out.println();
    }

    /*      также рекомендуют
    1) FileInputStream оберните в BufferedReader.
    2) Считывайте файл построчно, с помощью readLine().
    3) В строке(-1-) в while() используйте ready().

    Далее следует реализация исходя из этих рекомендациий     */

    public static void example_3() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();                  //для данного примера я использовал файл c:/for_java/test_1.txt

        BufferedReader reder_file = new BufferedReader(new InputStreamReader(new FileInputStream(str)));

        while(reder_file.ready())
            System.out.println(reder_file.readLine());

        reader.close();
        reder_file.close();
    }

    /*      Запись в файл с консоли
    1. Прочесть с консоли имя файла.
    2. Считывать строки с консоли, пока пользователь не введет строку «exit«.
    3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.   */

    public static void example_4() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter file name");
        String str = reader.readLine();     // заготовил файл     C:\java_test\test1.txt

        BufferedWriter file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));

        boolean flag = true;

        while (flag)
        {
            System.out.println("Enter string");
            str = reader.readLine();
            //if ("exit".equals(str))   //так не нравиться проверяльщику джава раш
            if (str.equals("exit"))
                flag = false;
            file.write(str + System.lineSeparator());       //каждая с новой строки
        }
        reader.close();
        file.close();
    }


    public static void example_5()
    {
        int a = new Scanner(System.in).nextInt();  //еще один способ считывания в данном случае целых чисел
        System.out.println(a);
    }


    public static void main(String[] args) throws IOException
    {
        example_1_2();
    }

}
