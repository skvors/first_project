package OOP_examples;


public class inheritance              //наследование  уровень 11 лекция 5
{
    class ChessItem
    {
        int x;
        int y;
        int worth;
    }

    class King extends ChessItem
    {
        void kingMove()
        {
            //код, решающий, как пойдет король
        }
    }

    class Queen extends ChessItem
    {
        void queenMove()
        {
            //код, решающий, как пойдет ферзь
        }
    }

    class Rook extends ChessItem
    {
        void rookMove()
        {
            //код, решающий, как пойдет ладья
        }
    }

    public static void main(String[] args)
    {

    }

}
