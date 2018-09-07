package Object_examples;




public class Solution_0
{
    /* Реализовать метод setCatsCount
    Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать
    значение переменной catsCount равное переданному параметру.
    */

    public static class Cat_1
    {
        private static int catsCount = 0;

        public static void setCatsCount(int catsCount)
        {
            //напишите тут ваш код
            Cat_1.catsCount = catsCount;
        }
    }


    /* Реализовать метод setName
    Реализовать метод setName, чтобы с его помощью можно было устанавливать
    значение переменной private String fullName равное значению локальной переменной String fullName.  */

    public class Cat_2 {
        private String fullName;

        public void setName(String firstName, String lastName)
        {
            String fullName = firstName + " " + lastName;

            //напишите тут ваш код
            this.fullName = fullName;
        }
    }

    class Cat_3
    {
        public String name;      //name – это переменная класса. У нее модификатор доступа public, поэтому она видна везде в проекте.

        public String getName()  //Метод getName – это getter (произносится гЭттэр), т.е. он возвращает значение переменной-класса name.
        {                        //Имя метода строится по принципу get + «имя переменной с большой буквы».
            return name;
        }
        public void setName(String name)  //Метод setName – это setter (произносится сЭттэр), т.е. он используется для присваивания нового значения переменной-класса name.
        {                                 //Имя метода строится по принципу set + «имя переменной с большой буквы».
            this.name = name;             //В этом методе имя параметра совпадает с именем переменной класса, поэтому мы ставим this перед именем переменной.
        }
    }


    /* Геттеры и сеттеры для класса Dog
    Создать class Dog. У собаки должна быть кличка String name и возраст int age.
    Создайте геттеры и сеттеры для всех переменных класса Dog.    */

    public class Dog
    {
        //добавьте тут переменные класса
        String name;
        int age;

        //добавьте тут геттеры и сеттеры
        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public void setAge(int age)
        {
            this.age = age;
        }
    }


}
