package Prac5.Coding;

import java.util.Scanner;

/**
 * Created by jc259968 on 21/08/17.
 */
public class ASCandDESC {
//    public static void main(String[] args) {
//        int num;
//        int num2;
//        int num3;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number ");
//        num = input.nextInt();
//        System.out.print("Enter another number ");
//        num2 = input.nextInt();
//        System.out.print("Enter another number ");
//        num3 = input.nextInt();
//
//        if((num / num2 == 0) || (num2 / num) == 0)
//            System.out.println("One of these numbers is evenly divisible into the other");
//        else
//            System.out.println("Neither of these numbers is evenly divisible into the other");
//    }
//}
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Decide the number of friends
        int numOfNums = 3;

        //Create a string array to store the names of your friends
        String arrayOfNums[] = new String[numOfNums];
        for (int i = 0; i < arrayOfNums.length; i++) {
        System.out.print("Enter num " + (i+1) + " : ");
        arrayOfNums[i] = scan.nextLine();
        }
        System.out.println("Before Sorting:");
        for(String str: arrayOfNums) {
            System.out.println(str);
        }
        //Collections.sort(arrayOfNums, Collections.reverseOrder());

        System.out.println("ArrayList in descending order:");
        for(String str: arrayOfNums){
        System.out.println(str);

        }
}
}






