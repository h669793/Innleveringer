package obligatoriskInnleverin1;

import static javax.swing.JOptionPane.*;
		// importerer JOption for å bruke input vinduer

import static java.lang.Integer.*;

import static java.lang.Integer.parseInt;


public class O1 {

	public static void main(String[] args) {
		
		int trinn1 = 190349;
		int trinn2 = 267900;
		int trinn3 = 643800;
		int trinn4 = 969200;
		int trinn5 = 2000000;
		//inntekts grenser for trinnskatt
		
		double trinn1Sats = 0.017;
		double trinn2Sats = 0.04;
		double trinn3Sats = 0.134;
		double trinn4Sats = 0.164;
		double trinn5Sats = 0.174;
		// Prosent trinnskatt for hvert trinn
		
		String bruttoinntektTxt = showInputDialog("Din Bruttoinntekt!");
		int bruttoinntekt = parseInt(bruttoinntektTxt);
		
		// får brukeren til å skrive inn bruttoinntekten sin
		
		double skatt = 0;
		
		if (bruttoinntekt >= trinn5){
			// regner ut skatt for trinn5
			skatt = skatt + (bruttoinntekt - trinn5) * trinn5Sats;
			bruttoinntekt = trinn5 - 1;
		}
		
		if (bruttoinntekt >= trinn4){
			// regner ut skatt for trinn4
			skatt = skatt + (bruttoinntekt - trinn4) * trinn4Sats;
			bruttoinntekt = trinn4 - 1;
		}
		
		if (bruttoinntekt >= trinn3){
			// regner ut skatt for trinn3
			skatt = skatt + (bruttoinntekt - trinn3) * trinn3Sats;
			bruttoinntekt = trinn3 - 1;
		}
		
		if (bruttoinntekt >= trinn2){
			// regner ut skatt for trinn2
			skatt = skatt + (bruttoinntekt - trinn2) * trinn2Sats;
			bruttoinntekt = trinn2 - 1;
		}
		
		if (bruttoinntekt >= trinn1){
			// regner ut skatt for trinn1
			skatt = skatt + (bruttoinntekt - trinn1) * trinn1Sats;
			bruttoinntekt = trinn1 - 1;
		}
		
		showMessageDialog(null, "skatt: " + skatt);
		
		System.out.println(skatt);

	}

}
