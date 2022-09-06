package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		// TODO Les inn tall n, beregn og print ut n!.

		String inputTxt = showInputDialog("Gi et tall større enn 0:");

		int n = parseInt(inputTxt);
		if (n <= 0) {
			showMessageDialog(null, "Tallet må være større enn 0.");

		} else {
			int i, fak = 1;

			for (i = 1; i <= n; i++) {
				fak = fak * i;
			}
			System.out.println(n + "! = " + fak);
		}

	}

}
