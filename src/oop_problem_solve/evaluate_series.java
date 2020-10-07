package oop_problem_solve;

import java.util.Scanner;

public class evaluate_series {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        long N = input.nextInt();
        int initial_value = 0;

        for (int i=1; i<=N; i=i+2){
            initial_value = initial_value + (i*i);
        }
        System.out.println("Answer = " + initial_value);
    }
}
