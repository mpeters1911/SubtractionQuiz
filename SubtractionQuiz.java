import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random()* 10);
		
		if (number1 < number2) {
			int temp = number1;
			 number1 = number2;
			 number2 = temp; 
			
		} 
		System.out.print(" What is " + number1 + " - " + number2 + "? \t");
		
		int response = input.nextInt();
		
		if ( number1 - number2 == response)
		
		{
		System.out.print(" You chose " + response + " and CONGRATULATIONS!!! YOU WON!!!!");	
		}
		else {
			System.out.print(" WHOAAAA sorry you lost, try again next time :(");
		}
		
		
		}

	}



