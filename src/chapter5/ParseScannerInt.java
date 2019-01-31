package chapter5;

import java.util.Scanner;

public class ParseScannerInt {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = Integer.parseInt(scan.next());
        System.out.println(num);
    }
}
