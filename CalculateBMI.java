import java.util.Scanner;

public class CalculateBMI {
	public static void main(String[] srgs){
		
		// Used to get user input
		Scanner scanner = new Scanner(System.in);

		//Get user input for weight
		System.out.print("Enter your weight in pounds > ");
		double currentWeightInPounds = scanner.nextDouble();
		
		System.out.println("Your weight in pounds is " + currentWeightInPounds);
		
		// Get user input for height in feet
		System.out.print("Enter your height in feet > ");
		double currentHeightInFeet = scanner.nextDouble();
		
		// Get user input for height in inches
		System.out.print("Enter your height in inches > ");
		double currentHeightInInches = scanner.nextDouble();
		
		// Total height in inches is calculated
		double totalHeightInInches = (currentHeightInFeet * 12) + currentHeightInInches; 
		
		System.out.printf("Your height in inches is %.1f ", totalHeightInInches); 
		
		System.out.println();
		
		// Calculation for Body Mass Index
		double bodyMassIndex = currentWeightInPounds/(totalHeightInInches * totalHeightInInches) * 703;
		
		System.out.printf("Your BMI is: %.2f ", bodyMassIndex);		
		
		System.out.println();
		
		// this code outputs additional body composition information based on the above results
		if(bodyMassIndex < 18.5) {
            System.out.println("You are underweight");
        } else if(bodyMassIndex > 18.5 && bodyMassIndex < 24.9) {
            System.out.println("You are at a healthy weight");
        } else if (bodyMassIndex > 24.9 && bodyMassIndex < 29.9) {
            System.out.println("You are overweight");
		} else if(bodyMassIndex > 29.9 && bodyMassIndex < 34.9){
			System.out.println("You are at the lower end of the obesity range");
		} else if(bodyMassIndex > 34.9 && bodyMassIndex < 39.9){
			System.out.println("You are at the upper end of the obesity range");
		} else if(bodyMassIndex > 40){
			System.out.println("You are extremely obese");
		} else {
			// doesn't do anything
            System.out.println("Are you even human? LOL!");
        }
		
		// close the Scanner
		scanner.close();
		
	}
}