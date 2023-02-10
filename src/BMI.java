/**
 * @class: Paint
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: February 8, 2023
 * description:
 */
import java.net.SocketOption;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner w = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weightPounds = w.nextDouble();
        Scanner i = new Scanner(System.in);
        System.out.print("Enter your height in inches: ");
        double inches = i.nextDouble();
        double weightKilo = weightPounds * 0.4536;
        double meters = inches * 0.0254;
        double BMI = weightKilo / (meters*meters);
        System.out.println("Your BMI is " + BMI);

        if(BMI<18.5){
            System.out.println("You are underweight");
        }else if (18.5<=BMI && BMI<25.0){
            System.out.println("You are normal");
        }else if (25.0<=BMI && BMI<30.0){
            System.out.println("You are overweight");
        }else if (BMI>=30.0){
            System.out.println("You are obese");
        }
    }
}
