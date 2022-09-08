import java.util.Scanner;

public class Oppgave03 {

	public static void main(String[] args) {
		
		int number;
		long factorial = 1;
		Scanner input = new Scanner(System.in);
		

		System.out.println("Gi et faktor tall: ");
		number = input.nextInt();
		input.close();
		
	if (number < 0)
        System.out.println("Kan ikke finne faktoren av et negativt tall");
        else if (number <= 1)
	System.out.printf("%d! = %d", number, factorial);
	else {
		for( int counter = number; counter >= 2; counter--) {
			factorial = factorial*counter;
			}
		System.out.printf("%d! = %d", number, factorial);
		
	    }
	
	}
}
