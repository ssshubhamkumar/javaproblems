package A_Basics;

import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        // accept user's name and age and print
        Scanner sc=new Scanner(System.in);
        System.out.println("your name :");
        String name = sc.nextLine();
        System.out.println("Your age :");
        int age =sc.nextInt();
        System.out.println("Hello " +name+", you are "+age+" years old .");


    }
}
