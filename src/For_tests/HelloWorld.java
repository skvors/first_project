package For_tests;

import edu.princeton.cs.introcs.In;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey on 02.09.2016.
 */
public class HelloWorld

{
    public static void main(String[] args) {
//        int[] mas = new int[10];
//        for (int i = 0; i < 20; i++) {
//            mas[i] = i*2;
//        }


        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        list.forEach(n -> System.out.println(n+1));
    }



}