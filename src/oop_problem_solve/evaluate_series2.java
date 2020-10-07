package oop_problem_solve;

import java.util.Scanner;

public class evaluate_series2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        long N = input.nextInt();
        int initial_value = 0;

        for (int i=1; i<=N; i++){
            if (i%2 == 0) {
                initial_value = initial_value - i;
            }else if (i%2 == 1){
                initial_value = initial_value + i;
            }
        }
        System.out.println("Answer = " + initial_value);
    }
}
