package Object_examples;

/**
 * Created by sergey on 05.02.2017.
 */
public class Solution_3
{
    public static void main(String[] args)
    {
        Pet pet1 = new Pet("Barsic");
        Pet pet2 = pet1.getChild("Barsic Jr.");

        System.out.println(pet2.getName());
    }

    public static class Pet
    {
        private String name;

        public Pet(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return this.name;
        }

        public Pet getChild(String name)
        {
            return new Pet(name);
        }
    }
}
