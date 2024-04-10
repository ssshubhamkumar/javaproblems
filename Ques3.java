package A_Basics;

import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        // accept input from user and print  their sum
        Scanner sc =new Scanner(System.in);
        System.out.println("1st no :");
        int a = sc.nextInt();
        System.out.println("2nd no:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum of" +a+ " & " +b+ " = " +sum);
    }
}
