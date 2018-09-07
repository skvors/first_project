package Big_tasks.Eat_or_eaten;


/*
Dog, Cat и Mouse

1. Создай классы Dog, Cat и Mouse.
2. Реализуй интерфейсы в добавленных классах, учитывая что:
— Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
— Мышь(Mouse) может передвигаться и может быть съедена.
— Собака(Dog) может передвигаться и съесть кого-то.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Dog buldog = new Dog("Buldog");
        Cat tom = new Cat("Tom");
        Mouse jerry = new Mouse("Jerry");

        tom.eat(jerry);
        buldog.eat(tom);
    }

    public interface Movable          //может двигаться
    {
        void move();
    }

    public interface Eatable          //может быть съеден
    {
        String eaten();               //возвращать свое имя
    }

    public interface Eat              //может кого-нибудь съесть
    {
        void eat(Eatable prey);
    }

    public static class Animal
    {
        private String name;           //имя животного

        public Animal(String name)     //конструктор
        {
            this.name = name;
        }

        public String getName()        //геттер
        {
            return this.name;
        }
    }

    public static class Dog extends Animal implements Movable, Eat
    {
        public Dog(String name)              //переопределяем конструктор
        {
            super(name);
        }

        @Override
        public void move() {
        }

        @Override
        public void eat(Eatable prey)
        {
            System.out.println("Dog " + getName() + " eat " + prey.eaten());
        }
    }

    public static class Cat extends Animal implements Movable, Eatable, Eat
    {
        public Cat(String name)
        {
            super(name);
        }

        @Override
        public void eat(Eatable prey)
        {
            System.out.println("Cat " + getName() + " eat " + prey.eaten());
        }

        @Override
        public void move() {
        }

        @Override
        public String eaten()
        {
            return getName();
        }
    }

    public static class Mouse extends Animal implements Eatable, Movable {

        public Mouse(String name)
        {
            super(name);
        }

        @Override
        public String eaten()
        {
            return getName();
        }

        @Override
        public void move() {
        }
    }
}
