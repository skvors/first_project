package examples;


import java.util.ArrayList;
import java.util.List;

public class multithreading      //Многонитиевость (многопоточность) 16 уровень и 17 уровень
{

    //Способы создания и запуска новых потоков     //16 уровень, 2 лекция

    //Проблемы многопоточности:
        //обращение к общему ресурсу                                  //17 уровень, 1 лекция
        //synchronized                                                //17 уровень, 3 лекция
        //Кэш. проблема многопоточности — локальный кэш. volatile    //17 уровень, 5 лекция


    /*      Чтобы указать, с какого именно метода нужно начать выполнение объекту Thread,
    нужно как-то передать метод этому объекту. В Java это реализовано с помощью интерфейса Runnable.
    Этот интерфейс содержит единственный абстрактный метод – void run().
    Класс Thread имеет конструктор Thread(Runnable Runnable), в который можно передать любой объект,
    который реализует интерфейс Runnable.

    Ты должен унаследовать свой класс от интерфейса Runnable, затем переопределить метод run в своем классе.
    Именно с вызова этого метода начнется работа новой нити. В методе run ты можешь написать все, что хочешь.   */

    static class Printer implements Runnable
    {
        private String name;
        public Printer(String name)
        {
            this.name = name;
        }
        public void run()
        {
            System.out.println("I’m " + this.name);
        }
    }

    public static void example_1()
    {
        Printer printer = new Printer("fire");  //1. Создали объект класса Printer, который содержит метод run.
        Thread childThread = new Thread(printer);     //2. Создали новый объект класса Thread,
                                    // передали ему в конструкторе объект printer, чей метод run()нужно будет исполнить.
        childThread.start();                          //3. Запустили новую нить в работу, вызовом метода start().
    }

    /*      Создаем две нити, каждая на основе своего объекта типа Printer.     */

    public static void example_2()
    {
        Printer printer1 = new Printer("Коля");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        Printer printer2 = new Printer("Вася");
        Thread thread2 = new Thread(printer2);
        thread2.start();
    }

    /*      Создаем три нити, на основе одного объекта Printer.     */

    public static void example_3()
    {
        Printer printer = new Printer("Наташа");

        Thread thread1 = new Thread(printer);
        thread1.start();

        Thread thread2 = new Thread(printer);
        thread2.start();

        Thread thread3 = new Thread(printer);
        thread3.start();
    }

    /*      Более того, можно совместить это все в одном классе. Класс Thread унаследован от интерфейса Runnable,
    и достаточно просто переопределить его метод run:       */

    static class Printer_2 extends Thread
    {
        private String name;
        public Printer_2(String name)
        {
            this.name = name;
        }
        @Override
        public void run()
        {
            System.out.println("I’m " + this.name);
        }
    }


    public static void example_4()
    {
        Printer_2 printer = new Printer_2("Вася");
        printer.start();

        Printer_2 printer2 = new Printer_2("Коля");
        printer2.start();
    }

    // интересный пример работы с потоками

    public static class SpecialThread implements Runnable
    {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }

    static class Solution_1
    {
        public static volatile List<Thread> list = new ArrayList<Thread>(5);

        static void initialise_and_work()
        {
            for (int i = 0; i < 5; i++)
            {
                list.add(new Thread(new SpecialThread()));
            }
            for (int i = 0; i < 5; i++)
            {
                list.get(i).start();
            }
        }
    }
    public static void example_5()
    {
        Solution_1.initialise_and_work();
    }

    //join- ожидание завершения потока      16 уровень, 4 лекция

    public static void example_6() throws Exception
    {
        Printer printer1 = new Printer("Коля");
        Thread thread1 = new Thread(printer1);     //Главная нить создает дочернюю нить – объект thread1.
        thread1.start();                           //Затем запускает ее – вызов thread1.start();

        thread1.join();                            //И ждет ее завершения – thread1.join();
    }



    public static void example_7() throws Exception
    {
            // sleep - спать       16 уровень, 6 лекция
        Thread.sleep(2000, 50);     //Программа запустится, замрет на 2 секунды (2000 миллисекунд) и 50 наносекунд

            //yield - пропуск хода       17 уровень, 7 лекция
        Thread.yield();             //позволяет досрочно завершить квант времени текущей нити или,
                                    // другими словами, переключает процессор на следующую нить.
        /*  Вызов yield приводит к тому, что «наша нить досрочно завершает ход»,
        и что следующая за yield команда начнется с полного кванта времени.     */
    }

    //способ остановки потока        16 уровень, 8 лекция

    /*      Класс Clock (часы) будет писать в консоль раз в секунду слово «Тик»,
    пока переменная isCancel равна false.
    Когда переменная isCancel станет равной true, метод run завершится.     */

    static class Clock implements Runnable
    {
        private boolean isCancel = false;

        public void cancel()
        {
            this.isCancel = true;
        }

        public void run()
        {
            while (!isCancel)
            {
                try{    Thread.sleep(1000); }
                catch (InterruptedException e) {}

                System.out.println("Tik");
            }
        }
    }

    /*      Главная нить, запускает дочернюю нить – часы, которая должна работать вечно.
    Ждет 10 секунд и отменяет задание, вызовом метода cancel.
    Главная нить завершает свою работу.
    Нить часов завершает свою работу.   */

    public static void example_8()
    {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        try{ Thread.sleep(10000);}
        catch (InterruptedException e) {}

        clock.cancel();
    }

    //interrupt, IsInterrupted, interrupted exception     16 уровень, 9 лекция

    /*      На самом деле нечто подобное существует в классе Thread.
    Только переменная называется не isCancel, а isInterrupt, и метод остановки,
    соответственно, не cancel(), а interrupt().     */

    /*      Т.к. много нитей могут вызвать метод run одного объекта, то объект Clock
    в своем методе run получает объект вызвавшей его нити («текущей нити»).

    Класс Clock (часы) будет писать в консоль раз в секунду слово «Tik»,
    пока переменная isInterrupt текущей нити равна false.

    Когда переменная isInterrupt станет равной true, метод run завершится.   */

    static class Clock_2 implements Runnable
    {
        public void run()
        {
            Thread current = Thread.currentThread();

            try
            {
                while (!current.isInterrupted())
                {
                    Thread.sleep(1000);
                    System.out.println("Tik");
                }
            }
            catch (InterruptedException e) {}

        }
    }


    public static void example_9()
    {
        Clock_2 clock = new Clock_2();
        Thread clockThread = new Thread(clock);

            //Главная нить, запускает дочернюю нить – часы, которая должна работать вечно.
        clockThread.start();

            //Ждет 10 секунд и отменяет задание, вызовом метода interrupt.
        try{ Thread.sleep(10000);}
        catch (InterruptedException e) {}

        clockThread.interrupt();
    }


    public static class Print_num extends Thread
    {
        private int num;

        public Print_num(int num)
        {
            this.num = num;
        }

        @Override
        public void run()
        {
            Thread current = Thread.currentThread();

            //при вызове interrupt() - прерывание потока, флаг current.isInterrupted() перейдет в true

            while (!current.isInterrupted())
            {
                try
                {
                    Thread.sleep(100);     //генерация исключения сбрасывает флаг обратно на false
                }
                catch (InterruptedException e)
                {
                    //поэтому здесь мы снова устанавливаем флаг в true, иначе цикл не завершиться
                    Thread.currentThread().interrupt();
                }

                System.out.print(num);
            }
        }
    }

    public static void example_10() throws InterruptedException
    {
        Print_num one = new Print_num(1);
        Print_num two = new Print_num(2);

        one.start();
        two.start();

        Thread.sleep(2000);

        one.interrupt();
        two.interrupt();
    }


    public static void main(String[] args) throws InterruptedException
    {
        example_10();
    }
}
