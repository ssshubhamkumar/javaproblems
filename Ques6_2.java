package A_Basics;

import java.util.Scanner;

// Accept two numbers from user and swap their values
//                Part 2 - Swap without using third variable
public class Ques6_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("     Before swapping ");
        System.out.print("enter the first num : ");
        double a= sc.nextDouble();
        System.out.print("enter the 2nd num:");
        double b= sc.nextDouble();

        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("    after swapping  ");
        System.out.println("first num : "+a);
        System.out.println("second num : "+b);
    }
}
