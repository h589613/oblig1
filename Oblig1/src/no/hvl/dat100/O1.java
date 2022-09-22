package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		// TODO Leser inn bruttolønn og skriver ut trinnskatt.

		String inntektTxt = showInputDialog("Bruttoinntekt:");

		int inntekt = parseInt(inntektTxt);

		double prosent0 = 0.00;
		double prosent1 = 0.0093;
		double prosent2 = 0.0241;
		double prosent3 = 0.1152;
		double prosent4 = 0.1452;

		if (inntekt > 934050) {
			System.out.println("Trinnskatt: " + prosent4 * inntekt + " kr.");
			
		} else if (inntekt > 580650) {
			System.out.println("Trinnskatt: " + prosent3 * inntekt + " kr.");

		} else if (inntekt > 230950) {
			System.out.println("Trinnskatt: " + prosent2 * inntekt + " kr.");

		} else if (inntekt > 164100) {
			System.out.println("Trinnskatt: " + prosent1 * inntekt + " kr.");

		} else if (inntekt >= 0) {
			System.out.println("Trinnskatt: " + prosent0 * inntekt + " kr.");

		} else {
			showMessageDialog(null, "Ugyldig input.");
		}

	}

}
