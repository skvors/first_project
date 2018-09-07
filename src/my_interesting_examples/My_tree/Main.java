package my_interesting_examples.My_tree;

/*
My Binary search tree implementation
 */
public class Main
{
    public static void main(String[] args)
    {
        Bst my_bst = new Bst();
        my_bst.insert(5);
        my_bst.insert(7);
        my_bst.insert(4);
        my_bst.insert(10);
        my_bst.insert(8);
        my_bst.insert(9);
        my_bst.insert(40);

        System.out.println(my_bst.min());
    }
}
