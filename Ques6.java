package A_Basics;

import java.util.Scanner;

//Accept two numbers from user and swap their values
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("   Before swapping ");
        System.out.print("enter the first num : ");
        double a= sc.nextDouble();
        System.out.print("enter the 2nd num:");
        double b= sc.nextDouble();

        double temp=a;
        a=b;
        b=temp;
        System.out.println("     after swapping  ");
        System.out.println("first num : "+a);
        System.out.println("second num : "+b);
    }


}
