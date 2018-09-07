package OOP_examples;

public class Interface
{
    //уровень 12 лекции 7,8

    /* Интерфейс – это дитя Абстракции и Полиморфизма.
    Интерфейс очень напоминает абстрактный класс, у которого все методы абстрактные.
    Он объявляется так же, как и класс, только используется ключевое слово interface.    */

    interface Drawable
    {
        void draw();
    }

    interface HasValue
    {
        int getValue();
    }

    /*  1) Вместо слова class пишем interface.
        2) Содержит только абстрактные методы (слово abstract писать не нужно).
        3) На самом деле у интерфейсов все методы - public.         */

    interface Element extends Drawable, HasValue
    {
        int getX();
        int getY();
    }

    /*  Интерфейс может наследоваться только от интерфейсов.
        Интерфейсов-родителей может быть много.   */

    abstract class ChessItem implements Drawable, HasValue //класс либо декларируется как абстракный или реализует методы интерфейсов
    {
        private int x, y, value;

        public int getValue()
        {
            return value;
        }

        public int getX()
        {
            return x;
        }

        public int getY()
        {
            return y;
        }
    }

    /*  Класс может наследоваться от нескольких интерфейсов (и только от одного класса). При этом используется ключевое слово implements.
        Класс ChessItem объявлен абстрактным: он реализовал все унаследованные методы, кроме draw.
        Т.е. класс ChessItem содержит один абстрактный метод: draw().       */
}
