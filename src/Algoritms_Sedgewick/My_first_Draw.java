package Algoritms_Sedgewick;

import edu.princeton.cs.introcs.*;

public class My_first_Draw
{
    public static void draw()
    {
        int n = 100;
        StdDraw.setXscale(0, n);      //пропорции ширина
        StdDraw.setYscale(0, n*n);   //пропорции высота
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= n; i++)
        {
            StdDraw.point(i, i);          //чертит график для y=x
            StdDraw.point(i, i*i);        //чертит график для y=x*x
        }
    }

    public static void main(String[] args)
    {
        draw();
    }
}
