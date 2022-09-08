import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*; 



public class OppgaveB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int TRINN_1 = 190350;
		final int TRINN_2 = 267900;
		final int TRINN_3 = 643800;
		final int TRINN_4 = 969200;
		final int TRINN_5 = 2000000;
		
		final double P1 = 0.017;
		final double P2 = 0.040;
		final double P3 = 0.134;
		final double P4 = 0.164;
		final double P5 = 0.174;
		
		
		
		
		String x = showInputDialog("Bruttoninntekt: ");
		

	    int inntekt = Integer.parseInt(x);
		double skatt = 0;

		
		
		if (inntekt < TRINN_1)  {
			skatt = 0;
		
			
		} else if (inntekt <= TRINN_2) {
			skatt = P1*(TRINN_2 - TRINN_1);
			
			
		} else if (inntekt <= TRINN_3) {
			skatt = P1*(TRINN_2 - TRINN_1) + P2*(TRINN_3 - TRINN_2);
			
		} else if (inntekt <= TRINN_4) {
			skatt = P1*(TRINN_2 - TRINN_1) + P2*(TRINN_3 - TRINN_2) + P3*(TRINN_4 - TRINN_3);
			
		} else if (inntekt <= TRINN_5) {
			skatt = P1*(TRINN_2 - TRINN_1) + P2*(TRINN_3 - TRINN_2) + P3*(TRINN_4 - TRINN_3) + P4*(TRINN_5 - TRINN_4);
			
		} else if (inntekt > TRINN_5) {
			skatt = P1*(TRINN_2 - TRINN_1) + P2*(TRINN_3 - TRINN_2) + P3*(TRINN_4 - TRINN_3) + P4*(TRINN_5 - TRINN_4) + P5*(inntekt - TRINN_5);
			
		} else {
			showMessageDialog(null, "Ugyldig inntekt");
			
				
				
			}
			
		

		showMessageDialog(null, "Trinnskatten din er: " + skatt);
		
		

		
	}

}
