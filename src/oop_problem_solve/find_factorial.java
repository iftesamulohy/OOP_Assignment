package oop_problem_solve;

import java.util.Scanner;

public class find_factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        long N = input.nextInt();
        long initial_value = 1;

        for (long i=N; i>0; i--){
            initial_value = initial_value*i;
        }
        System.out.println("Answer = " + initial_value);
    }
}
