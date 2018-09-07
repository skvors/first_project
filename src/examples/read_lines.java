package examples;

import java.io.*;                    //библитека необходимая для ввода с клавы
                                     //ввод с клавиатуры уровень 3 лекция 7
public class read_lines{

    public static String myreadln() throws Exception          //краткий метод чтения с клавы
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string_line = reader.readLine();             //читаем строку с клавиатуры (всю строку до Enter)
        return string_line;
    }

    public static int read_num () throws Exception          //краткий метод чтения с клавы для чисел
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();                    //читаем строку с клавиатуры (всю строку до Enter)
        int num = Integer.parseInt(sNum);                  //преобразовываем строку sAge в число nAge.
        return num;
    }

    public static void main(String[] args) throws Exception   //throws Exception - необходимо для ввода с клавы
    {
        String s = myreadln();
        String sAge = myreadln();

        int nAge = Integer.parseInt(sAge);                   //преобразовываем строку sAge в число nAge.

        System.out.println("print: "+s+" "+(nAge+2));
    }
}