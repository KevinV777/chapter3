/**
 *@class: Paint
 *@author: Kevin Vergara
 *@verison 1.0
 *@course: ITEC 2140 - 04, Spring 20023
 *@written: February 8, 2023
 *description:
 */
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner side1 = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int sideA = side1.nextInt();
        Scanner side2 = new Scanner(System.in);
        System.out.print("Enter the second side: ");
        int sideB = side2.nextInt();
        Scanner side3 = new Scanner(System.in);
        System.out.print("Enter the third side: ");
        int sideC = side3.nextInt();
        int trianglePerimeter = (sideA + sideB + sideC);
        if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
            System.out.print("This is the perimeter of the triangle: " + trianglePerimeter);
        }
        else {
            System.out.print("invalid input");
        }
    }
}
