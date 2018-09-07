package examples;

import java.util.ArrayList;

/**
 * Created by Sergey on 31.01.2018.
 */
public class lambdaExpressions {

    public static void printArrayElements(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add((int)(Math.random()*100));
        }
        list.forEach(n -> System.out.println(n));            //перебор элментов массива и выполнение действий с каждым из них
    }

    public static void main(String[] args) {
        printArrayElements();
    }
}
