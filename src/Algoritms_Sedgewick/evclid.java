package Algoritms_Sedgewick;




public class evclid
{
    public static int gcd(int p, int q)     //наибольший общий делитель двух неотрицательных чисел
    {
        if (q==0)
            return p;
        else
        {
            int r = p % q;
            return gcd(q, r);
        }
    }


    public static void main(String[] args)
    {
        System.out.println(gcd(200, 250));

    }

}
