package my_interesting_examples.My_tree;


public class Bst
{
    Tree_Element root;       // указатеь на корень дерева

    public void insert(int data)
    {
        if (root != null)
        {
            Tree_Element temp = root;
            boolean contin = true;
            while (contin)
            {
                if (data < temp.data)
                {
                    if (temp.left != null)
                        temp = temp.left;
                    else
                    {
                        temp.left = new Tree_Element(data);
                        contin = false;
                    }
                }
                else
                {
                    if (temp.right != null)
                        temp = temp.right;
                    else
                    {
                        temp.right = new Tree_Element(data);
                        contin = false;
                    }
                }
            }
        }
        else
            root = new Tree_Element(data);
    }

    public int min()
    {
        Tree_Element temp = root;
        boolean contin = true;
        while (contin)
        {
            if (temp.left != null)
                temp = temp.left;
            else
                contin = false;
        }
        return temp.data;
    }
}
