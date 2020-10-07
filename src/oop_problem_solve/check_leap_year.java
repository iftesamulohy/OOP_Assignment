package oop_problem_solve;

import java.util.Scanner;

public class check_leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean leap_year = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0){
                    leap_year = true;
                }else{
                    leap_year = false;
                }
            }
            else{
                leap_year = true;
            }
        }else{
            leap_year = false;
        }

        if(leap_year){
            System.out.println(year + " is a Leap Year");
        }else{
            System.out.println(year + " is not a Leap Year");
        }
    }
}
