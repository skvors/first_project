package OOP_examples;


public class Polymorphism              //Полиморфизм   уровень 12 лекция 1
{
    /*  переопределение метода

    Тут определены два класса Cow и Whale. Whale унаследован от Cow.
    В классе Whale переопределен метод printName();    */

    //Наследовать и переопределять можно только нестатические методы.
    //Статические методы не наследуются и, следовательно, не переопределяются.

    static class Cow
    {
        public void printColor()
        {
            System.out.println("Я - белая");
        }
        public void printName()
        {
            System.out.println("Я - корова");
        }
    }

    static class Whale extends Cow
    {
        public void printName()
        {
            System.out.println("Я - кит");
        }
    }

    //using examples

    static void example_1()
    {
        Cow cow = new Cow();
        cow.printName();                 //Данный код выведет на экран надпись «Я – корова»
    }

    static void example_2()
    {
        Whale whale = new Whale();
        whale.printName();               //Данный код выведет на экран «Я – кит»
    }

    /*  приведение типов

    Т.к. класс при наследовании получает все методы и данные класса родителя,
    то объект этого класса разрешается сохранять (присваивать) в переменные класса родителя
    (и родителя родителя, и т.д., вплоть до Object).     */

    static void example_3()       //На экран будет выведена надпись Я – кит.
    {
        Whale whale = new Whale();
        whale.printName();
    }

    static void example_4()       //На экран будет выведена надпись Я – кит.
    {
        Cow cow = new Whale();
        cow.printName();
    }

    /*  Обрати внимание, что на то, какой именно метод printName вызовется, от класса Cow или Whale,
    влияет не тип переменной, а тип – объекта, на который она ссылается.

    !!!!!!!    Набор методов, которые можно вызвать у переменной, определяется типом переменной.
    !!!!!!!    А какой именно метод/какая реализация вызовется, определяется типом/классом объекта,
    ссылку на который хранит переменная.    */


    //расширение и сужение типа      //более подробно 14 уровень, 3 лекция

    /*  Классическое сужение типа.
    Теперь у объекта типа Whale можно вызывать только методы, описанные в классе Cow.
    Компилятор разрешит вызвать у переменной cow только те методы, которые есть у ее типа - класса Cow.   */

    static void example_5()
    {
        Cow cow = new Whale();
    }

    /*  Классическое расширение типа с проверкой.
    Переменная cow типа Cow, хранит ссылку на объект класса Whale.
    Мы проверяем, что это так и есть, и затем выполняем операцию преобразования (расширения) типа.
    Или как ее еще называют – type cast.   */

    static void example_6()
    {
        Cow cow = new Whale();
        if (cow instanceof Whale)
        {
            Whale whale = (Whale) cow;
        }
    }

    /*  Ссылочное расширение типа можно провести и без проверки типа объекта.
    При этом, если в переменной cow хранился объект не класса Whale,
    будет сгенерировано исключение – InvalidClassCastException.             */

    static void example_7()
    {
        Cow cow = new Cow();
        try
        {
            Whale whale = (Whale) cow;              //exception
        }
        catch (Exception e)
        {
            System.out.println("Exception has been caught");         //исключение было пойсано
        }
    }

    //другой интересный пример с переопределением и вызовом оригинального метода

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }
    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
    public static class Goose extends SmallAnimal {
        @Override
        public String getSize()                                 //переопределение метода
        {
            return "Гусь маленький, " + super.getSize();        //вызов оригинальнго метода
        }
    }
    public static class Dragon extends BigAnimal {
        @Override
        public String getSize()
        {
            return "Дракон большой, " + super.getSize();
        }
    }

    static void example_8()
    {
        Dragon smaug = new Dragon();
        System.out.println(smaug.getSize());

        Goose goose = new Goose();
        System.out.println(goose.getSize());
    }

    static class Mouse
    {}

    static void example_9()
    {
        Object obj = new Mouse();
        Mouse mouse = (Mouse)obj;

        System.out.println(obj.getClass().getName());   //выведет полное название класса: OOP_examples.Polymorphism$Mouse
        System.out.println(obj.getClass().getSimpleName());   //выведет название класса: Mouse

        System.out.println(mouse.getClass().getSimpleName());
    }





    public static void main(String[] args)
    {
        example_9();
    }
}


/*  Вызов оригинального метода

Делается это так: super.method().

class Cow
{
    public void printAll()
    {
        printColor();
        printName();
    }
    public void printColor()
    {
        System.out.println("Я – белый");
    }
    public void printName()
    {
        System.out.println("Я – корова");
    }
}

class Whale extends Cow
{
    public void printName()
    {
        System.out.print("Это неправда: ");
        super.printName();                              //Вызов оригинального метода

        System.out.println("Я – кит");
    }
}

public static void main(String[] args)
{
    Whale whale = new Whale();
    whale.printAll();
}

На экран будет выведена надпись
Я – белый
Это неправда: Я – корова
Я – кит

--------------------------------------------------------

мы ввели базовый класс ChessItem для упрощения всех классов шахматных фигур
у каждой фигуры есть метод, который занимается ее отрисовкой на экране.
Вызываешь метод, и фигура сама себя рисует в своих текущих координатах. Удобно было бы вынести этот метод в базовый класс
можно было бы вызывать метод отрисовки для всех фигур, независимо от их типа

class ChessBoard
{
    public void drawAllChessItems()
    {
        //добавляем фигуры в список
        ArrayList<ChessItem> items = new ArrayList<ChessItem>();
        items.add(new King());
        items.add(new Queen());
        items.add(new Bishop());

        //рисуем их независимо от их типа.
        for (ChessItem item: items)
        {
            item.draw();
        }
    }
}

--------------------------------------------------------

Расширение типа результата.

В перегруженном (переопределяемом) методе мы можем поменять тип результата, расширив его.


class Cat
{
 public Cat parent;
 public Cat getMyParent()
 {
  return this.parent;
 }
 public void setMyParent(Cat cat)
 {
  this.parent = cat;
 }
}

class Tiger extends Cat
{
 public Tiger getMyParent()            //Мы переопределили метод getMyParent, теперь он возвращает объект типа Tiger.
 {
  return (Tiger) this.parent;
 }
}



 */