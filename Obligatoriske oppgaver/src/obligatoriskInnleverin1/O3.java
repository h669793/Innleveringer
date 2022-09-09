package obligatoriskInnleverin1;

import static javax.swing.JOptionPane.*;

import static java.lang.Long.parseLong;


public class O3 {

	public static void main(String[] args) {
		
		String tallTxt = showInputDialog("skriv eit tall");
		Long tall = parseLong(tallTxt);
		Long svar = tall;
		
		do {
			
			svar *= (tall-1);
			
			tall--;
			
			} while (tall>1);

		showMessageDialog( null, "Svar: " + svar);
		
	} 

}
