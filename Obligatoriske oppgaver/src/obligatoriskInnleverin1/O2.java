package obligatoriskInnleverin1;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.parseInt;

public class O2 {

	public static void main(String[] args) {
		
		String poengTxt = showInputDialog("Hvor mange poeng fekk du?");
		int poeng = parseInt(poengTxt);
		String melding = ("Du fekk karakter: "); 
		
		if(poeng<101 && poeng>89) {
			showMessageDialog(null, melding + "A" );
			}
		else if(poeng<90 && poeng>79) {
			showMessageDialog(null, melding + "B");
			}
		else if(poeng<80 && poeng>59) {
			showMessageDialog(null, melding + "C");
		}
		else if(poeng<60 && poeng>49) {
			showMessageDialog(null, melding + "D");
		}
		else if(poeng<50 && poeng>39) {
			showMessageDialog(null, melding + "E");
		}
		else if(poeng<40 && poeng>-1) {
			showMessageDialog(null, melding + "F");
		}
		else {
			showMessageDialog(null, "Ikke gyldig Poengsum");
		}
	}
		
		

	}

