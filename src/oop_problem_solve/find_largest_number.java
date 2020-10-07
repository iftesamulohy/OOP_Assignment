package oop_problem_solve;

import java.util.Scanner;

public class find_largest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 5 Numbers : ");
        double [] a = new double[5];

        for (int i=0; i<5; i++){
            a[i] = input.nextDouble();
        }

        double max = a[0];
        for (int i=0; i<a.length; i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        System.out.print("Answer = " + max);
    }
}
