package OOP_examples;

    //Порядок загрузки классов, статические данные... статический блок
    //15 уровень, 7 лекция

public class Static_block
{
    public static class My_class
    {
        static                //статик блок, он должен быть в классе, а не в методе вроде
        {
            System.out.println("it's a static block inside My_class");
        }
    }

    public static void main(String[] args)
    {
        My_class my_class = new My_class();         //в этот момент выполняется код статик блока
    }


    // если в статик болке выбрасывается исключение, то класс не загрузится и появиться сообщение об ошибке
}
