package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		// TODO Les inn poengsum 0-100 og skriv ut karakter A-F.

		for (int i = 1; i <= 10; i++) {

			String poengTxt = showInputDialog("Poengsum:");
			int poeng = parseInt(poengTxt);
			boolean gyldig = poeng >= 0 && poeng <= 100;

			if (!gyldig) {
				System.out.println("Ugyldig input, prøv igjen.");
				i -= 1;

			} else {

				if (poeng >= 90) {
					System.out.println("Student #" + i + ", poengsum " + poeng + ": Karakter A");

				} else if (poeng >= 80) {
					System.out.println("Student #" + i + ", poengsum " + poeng + ": Karakter B");

				} else if (poeng >= 60) {
					System.out.println("Student #" + i + ", poengsum " + poeng + ": Karakter C");

				} else if (poeng >= 50) {
					System.out.println("Student #" + i + ", poengsum " + poeng + ": Karakter D");

				} else if (poeng >= 40) {
					System.out.println("Student #" + i + ", poengsum " + poeng + ": Karakter E");

				} else if (poeng >= 0) {
					System.out.println("Student #" + i + ", poengsum " + poeng + ": Karakter F");

				}

			}

		}

	}

}
