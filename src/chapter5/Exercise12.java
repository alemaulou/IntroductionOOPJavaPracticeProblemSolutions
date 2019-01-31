/*
 * Title: Leap Year Method
 * Author: Alessandro Lou
 * Date: 1/28/2019
 * Program detects if argument is a leap year.
 */

package chapter5;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user! Enter a year: ");
//        int yearInput = scanner.nextInt();
//       isLeapYear(yearInput);
        
        int year1796 = 1796;
        int year1800 = 1800;
        int year2000 = 2000;
        isLeapYear(year1796);
        isLeapYear(year1800);
        isLeapYear(year2000);
        int year = 1796;
    }
    
    public static void isLeapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }
}
