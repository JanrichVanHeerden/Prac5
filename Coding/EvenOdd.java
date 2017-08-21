package Prac5.Coding;

/**
 * Created by jc259968 on 21/08/17.
 */
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        num = input.nextInt();
        if((num % 2 == 0))
            System.out.println("This number is even");
        else
            System.out.println("This number is not even");
    }
}
