import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// Goal: take user input int to output squared and cubed values
		// initiate scanner
		Scanner scan = new Scanner(System.in);
		
		String answer;
		do {
			// prompt user to input an integer\
			System.out.print("Please enter an integer: ");

			int input = scan.nextInt();
			if (input < 0) {
				
				System.out.println("You entered a negative.");
				System.out.println("Please enter a positive integer.");
			} else if (input > 0) {
			
			// output number squared and cubed at the top of the table
			System.out.println("Number" + "\tSquared" + "\tCubed");
			
			// number loop from 1 to input value
			for (int count = 1; count <= input; count++) {
				
				//initialize and calculate squared and cubed values
				int sqr = count * count;
				int cube = count * count * count;
				
				// output numbers, squared numbers, and cubed numbers
				System.out.println(count + "\t" + sqr + "\t" + cube);
			}
			}
			
			System.out.println("Continue? (Y/N) ");
			
			// number loop from 1 to input value
			answer = scan.next();

		} while (answer.equalsIgnoreCase("y"));
		// ask to continue loop
	scan.close();
	}

}
