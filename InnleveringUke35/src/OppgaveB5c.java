import java.util.Scanner;

public class OppgaveB5c {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			
			Scanner scan = new Scanner(System.in);
			
				System.out.println("Skriv din poengsum:");
				
				int n = scan.nextInt();
						
				do {
					if(n >= 90 && n <= 100) {
				
					System.out.println("A");
					
					
				} else if (n >= 80 && n <= 89)  {
					System.out.println("B");
					
				} else if (n >= 60 && n <= 79)  {
					System.out.println("C");
					
				} else if (n >= 50 && n <= 59)  {
					System.out.println("D");
					
				} else if (n >= 40 && n <= 49)  {
					System.out.println("E");		
					
				} else if (n >= 0 && n <= 39)  {
					System.out.println("F");
					
				} else {
					System.out.println("Ugyldig poengsum");
						
				}	
	
		} while (n < 0 || n > 100);
		
		}

	}
	
}


