package my_interesting_examples.other;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Yes_No {

    public static void main(String[] args) throws Exception{
	// write your code here
        System.out.println("Write your question and press Enter");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        int answer = (int)(Math.random()*10);

        System.out.println("For question: " + str);

        if (answer == 10)
            System.out.println("It is impossible... num = 10");
        if (answer < 5) {
            System.out.print("The answer is");
            Thread.sleep(700);
            System.out.print(".");
            Thread.sleep(700);
            System.out.print(".");
            Thread.sleep(700);
            System.out.print(".");
            Thread.sleep(700);
            System.out.println(" Yes");
        }
        else {
            System.out.print("The answer is");
            Thread.sleep(700);
            System.out.print(".");
            Thread.sleep(700);
            System.out.print(".");
            Thread.sleep(700);
            System.out.print(".");
            Thread.sleep(700);
            System.out.println(" No");
        }
    }
}
