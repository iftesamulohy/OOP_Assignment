package oop_problem_solve;

import java.util.Scanner;

public class sort_ascending_order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temp,min;
        int c =0;

        System.out.print("Enter 5 Numbers : ");
        double[] a = new double[5];

        for (int i = 0; i < 5; i++) {
            a[i] = input.nextDouble();
        }

        min = a[0];
        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length; j++) {

                if (a[i] > a[j]) {

                    min = a[j];
                    temp = a[i];
                    a[i] = min;
                    a[j] = temp;

                }
                
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
