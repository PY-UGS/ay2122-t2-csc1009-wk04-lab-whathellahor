import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner userInput = new Scanner(System.in);
        double pounds, inches;
        
        System.out.print("Enter weight in pounds: ");
        pounds = userInput.nextDouble();

        System.out.print("Enter height in inches: ");
        inches = userInput.nextDouble();

        BMI bmi = new BMI(pounds, inches);

        System.out.println("BMI is " + bmi.calculateBMI());
        System.out.println(bmi.bmiInterpretation());

        userInput.close();
    }
}