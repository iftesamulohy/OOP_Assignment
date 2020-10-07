package oop_problem_solve;

import java.util.Scanner;

public class find_power {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Base Number : ");
        double base = input.nextInt();
        System.out.print("Enter a Exponent Number : ");
        double exponent = input.nextInt();

        double Result = Math.pow(base, exponent);
        System.out.println("Answer = " + Result);
    }
}
