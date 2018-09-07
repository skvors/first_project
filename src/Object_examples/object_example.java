package Object_examples;

/*
классы можно наследовать друг от друга.
И если класс «Корова» унаследовать от класса «Животное»,
то объект типа «Корова» можно хранить не только в переменной типа «Корова»,
но и в переменной типа «Животное».

//уровень 10 лекция 6
переменной типа Object. Этой переменной можно присвоить ссылку любого типа (расширение типа).
Но чтобы выполнить обратное присваивание (сужение типа) приходится явно указывать операцию приведения

String s = "mama";
Object o = s; // o хранит String 	Типичное расширение ссылочного типа

Object o = "mama";// o хранит String
String s2 = (String) o; 	        Типичное сужение ссылочного типа.


    // Вызов obj instanceof Constructor возвращает true, если объект принадлежит классу Constructor или классу, наследующему от него.
function Rabbit() {}
// создаём объект
var rabbit = new Rabbit();
// проверяем -- этот объект создан Rabbit?
alert( rabbit instanceof Rabbit ); // true, верно
 */
public class object_example
{
    public static void obj_exmpl()         //Желательно выполнять такую проверку, перед каждым сужением типа,
    {                                      //если тип сохраненного объекта на 100% не известен.
        int i = 5;
        float f = 444.23f;
        String s = "17";
        Object o = f;                       //o хранит объект типа Float

        if (o instanceof  Integer)
        {
            Integer i2 = (Integer) o;
        }
        else if (o instanceof  Float)
        {
            Float f2 = (Float) o;            //отработает именно этот if
        }
        else if (o instanceof  String)
        {
            String s2 = (String) o;
        }
    }

    public static class Person            //Объявили новый сложный тип – Person.
    {                                     //Его данные – это
        String name;                      //переменная name типа String(сложный тип)
        int age;                          //и переменная age типа int(примитивный тип)
    }

    public static class Rectangle
    {
        int x, y, width, height;
    }

    public static class Cat
    {
        Person owner;
        Rectangle territory;
        int age;
        String name;
    }

    public static class Man
    {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman
    {
        public int age;
        public int height;
        public Man husband;
    }


    public static void main(String[] args)
    {
        Person person1;               //Создали переменную person1, её значение null.
        person1 = new Person();       //Занесли в неё адрес новосозданного объекта.
        person1.name = "Robert";
        person1.age = 34;
        person1 = null;               //Присвоили переменной ссылку null.



        Cat cat = new Cat();        //Создали объект Cat, занесли его ссылку в переменную cat. cat.owner равен null.
        cat.owner = new Person();   //Занесли в cat.owner ссылку на новосозданный объект Person. cat.owner.name пока ещё null.

        System.out.println(cat.owner.name);

        cat.owner.name = "God";      //cat.owner.name присвоили имя – God.

        System.out.println(cat.owner.name);

    }

}
