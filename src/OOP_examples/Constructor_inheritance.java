package OOP_examples;

    //конструктор при наследовании 15 уровень, 5 лекция

    //конструктор при наследовании необычно переопределяется

import java.util.LinkedList;
import java.util.List;

public class Constructor_inheritance
{
    /*      Объект создается в несколько этапов.
    1) Сначала выделяется память под все переменные – поля класса.
    2) Затем идет инициализация базового класса.
    3) Потом всем переменным присваиваются значения, если они указаны.
    4) И наконец, вызывается конструктор.      */

    static class Pet
    {
        int x = 5, y = 5;                // 2
        int weight = 10;                 // 2

        Pet(int x, int y)
        {
            this.x = x;                  // 3
            this.y = y;                  // 3
        }
    }
    static class Cat extends Pet
    {
        int tailLength = 8;              // 4
        int age;
        Cat(int x, int y, int age)
        {
            super(x, y);                 // 1
            this.age = age;              // 5
        }
    }

    /*      Мы создали два класса: Pet(животное) и Cat(кот).
    В классе Cat мы видим явный вызов конструктора базового класса.
    Он всегда должен быть в первой строке конструктора.

    Вот что произойдет после выделения памяти:
    1 – вызов конструктора базового класса
    2 – инициализация переменных в Pet
    3 – отработает код конструктора Pet

    далее начнется процесс инициализации класса Cat
    4 – инициализация переменных в Cat
    5 – отработает код конструктора Cat     */

    public static void example_1()
    {
        Cat cat = new Cat (50, 50, 5);
    }

//-----------------------------------------------------------------------

    /*      ООП - книги
    1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].
    Параметр конструктора — название книги.
    2. В классе MarkTwainBook реализуйте все абстрактные методы.
    3. Для метода getBook измените тип возвращаемого значения на более подходящий.
    4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
    5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
    5.1. agathaChristieOutput для книг Агаты Кристи;
    5.2. markTwainOutput для книг Марка Твена.      */

    abstract static class Book
    {
        private String author;

        public Book(String author)
        {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType()
        {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;

            String output = "output";
            //Add your code here
            if ("Mark Twain".equals(author))
                output = markTwainOutput;
            if ("Agatha Christie".equals(author))
                output = agathaChristieOutput;

            return output;
        }

        public String toString()
        {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book
    {
        private String title;

        public MarkTwainBook(String title)             //вот здесь необычное переопределение
        {
            super("Mark Twain");                       //вначале мы должны вызвать оригинальный конструктор и что-то в него передать
            this.title = title;                        //потом остальная часть которую мы переопредляем
        }
        @Override
        public MarkTwainBook getBook() {
            return this;
        }
        @Override
        public String getTitle() {
            return this.title;
        }
    }
    public static class AgathaChristieBook extends Book
    {
        private String title;

        public AgathaChristieBook(String title)
        {
            super("Agatha Christie");
            this.title = title;
        }
        @Override
        public AgathaChristieBook getBook() {
            return this;
        }
        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static void example_2()
    {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

//-----------------------------------------------------------------------



    public static void main(String[] args)
    {
        example_1();
    }
}
