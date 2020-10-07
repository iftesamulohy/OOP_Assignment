package oop_problem_solve;

import java.util.Scanner;

public class bangla_season {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A Number : ");
        int N = input.nextInt();

        switch (N) {
            case 1:
                System.out.println("Poush");
                break;
            case 2:
                System.out.println("Magh");
                break;
            case 3:
                System.out.println("Falgun");
                break;
            case 4:
                System.out.println("Choitro");
                break;
            case 5:
                System.out.println("Baishakh");
                break;
            case 6:
                System.out.println("Joishţho");
                break;
            case 7:
                System.out.println("Ashaaŗh");
                break;
            case 8:
                System.out.println("Shrabon");
                break;
            case 9:
                System.out.println("Bhadro");
                break;
            case 10:
                System.out.println("Ashswin");
                break;
            case 11:
                System.out.println("Kartik");
                break;
            case 12:
                System.out.println("Ôgrohaeon");
                break;
            default:
                System.out.println("Not Found Any Season.");
                break;
        }
    }
}
