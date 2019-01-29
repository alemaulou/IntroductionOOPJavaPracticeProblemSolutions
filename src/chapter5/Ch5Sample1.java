/* 
 * Chapter 5 Sample Problem: Computing Circle Dimensions
 */

package chapter5;

import java.util.*;

public class Ch5Sample1 {
    public static void main(String[] args) {
        
        double radius;
        double circumference;
        double area;
        
        Ch5Circle circle;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        
        circle = new Ch5Circle(radius);
        circumference = circle.getCircumferenece();
        area = circle.getArea();
        System.out.println("Input radius: " + radius);
        System.out.println("Input circumference: " + circumference);
        System.out.println("Input area: " + area);
    }
}
