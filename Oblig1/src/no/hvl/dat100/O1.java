package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		// TODO Les inn bruttolønn og skriver ut trinnskatt.

		String inntektTxt = showInputDialog("Bruttoinntekt:");

		int inntekt = parseInt(inntektTxt);

		double prosent0 = 0.00;
		double prosent1 = 0.0093;
		double prosent2 = 0.0241;
		double prosent3 = 0.1152;
		double prosent4 = 0.1452;

		if (inntekt >= 0 && inntekt <= 164100) {
			System.out.println("Prosentsats: " + prosent0 + "%" + "\nTrinnskatt: " + prosent0 * inntekt + " kr.");

		} else if (inntekt > 164100 && inntekt <= 230950) {
			System.out.println("Prosentsats: " + prosent1 + "%" + "\nTrinnskatt: " + prosent1 * inntekt + " kr.");

		} else if (inntekt > 230950 && inntekt <= 580650) {
			System.out.println("Prosentsats: " + prosent2 + "%" + "\nTrinnskatt: " + prosent2 * inntekt + " kr.");

		} else if (inntekt > 580650 && inntekt <= 934050) {
			System.out.println("Prosentsats: " + prosent3 + "%" + "\nTrinnskatt: " + prosent3 * inntekt + " kr.");

		} else if (inntekt > 934050) {
			System.out.println("Prosentsats: " + prosent4 + "%" + "\nTrinnskatt: " + prosent4 * inntekt + " kr.");

		} else {
			System.out.println("Ugyldig input.");
		}

	}

}
