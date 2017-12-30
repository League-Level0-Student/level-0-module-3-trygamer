package extras;

import javax.swing.JOptionPane;

public class CheckPoint {

	public static void main(String[] args) {

		for (int i = 1; i < 9; i++) {

			if (i == 4) {
				JOptionPane.showMessageDialog(null, i);

			} else if (i < 8) {

				JOptionPane.showMessageDialog(null, i + " potato");
			} else {
				JOptionPane.showMessageDialog(null, " more");

			}
		}

	}

}
