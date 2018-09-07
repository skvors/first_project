package examples;

import java.util.Calendar;
import java.util.Date;

/*
для типа даты
Date date = new Date();
date.getYear()        // возвращает год вычитая из него 1900, поэтому чтоб год был коррекный надо прибавлять 1900
 */

public class Data_data {                   //уровень 8 лекция 4

    public static void date_differ() throws Exception       //Вычисление разницы между двумя датами:
    {
        Date currentTime = new Date();           //получаем текущую дату и время
        Thread.sleep(3000);                      //ждём 3 секунды – 3000 миллисекунд
        Date newTime = new Date();               //получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");
    }

    public static void date_after() throws Exception          //Наступило ли уже некоторое время:
    {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;   //    +5 секунд
        Date endDate = new Date(endTime);

        Thread.sleep(3000);              // ждем 3 секунды

        Date currentTime = new Date();
        if (currentTime.after(endDate))//проверяем что время currentTime после endDate
        {
            System.out.println("End time!");
        }
    }

    public static void date_get() throws Exception      //Сколько прошло времени с начала сегодняшнего дня:
    {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
    }

    public static void date_set() throws Exception            //Сколько дней прошло с начала года:
    {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        System.out.println("Days from start of year: " + dayCount);
    }



    public static void main(String[] args)                  throws Exception
    {
        date_differ();

                  //более простой способ вывести на экран текущие дату и время
        Date nowday = new Date();
        Date mybithday = new Date();

        System.out.println(nowday);
        System.out.print(mybithday);
    }
}
