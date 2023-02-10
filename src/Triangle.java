/**
 *@class: Triangle
 *@author: Kevin Vergara
 *@verison 1.0
 *@course: ITEC 2140 - 04, Spring 20023
 *@written: February 8, 2023
 *description: this program asks the user to input the length of the sides of a real triangle.
 * to make sure the triangle is real no combination of two sides added together can be less than the third side.
 * To ensure that stays true I set up a few functions using the && to include all the
 * combinations in an if else statement. if the lengths input do not make a real triangle it prints
 * invalid input
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
