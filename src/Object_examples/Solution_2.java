package Object_examples;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/
//здесь мы не можем на прямую обращаться к переменным класса Cat (они private)
//но можем через конструктор (там public)

public class Solution_2 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("murka", 4, 6, 34);
        Cat cat2 = new Cat("dimka", 5, 8, 34);
        Cat cat3 = new Cat("scooby", 4, 7, 34);
    }
    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
