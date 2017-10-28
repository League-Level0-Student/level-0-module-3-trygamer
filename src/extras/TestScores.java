package extras;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		
		String a =JOptionPane.showInputDialog("What what percent was your last test score 0-100?");
		
		 int a1 = Integer.parseInt(a);
				 
		 
		 if(a1>99){
			 JOptionPane.showMessageDialog(null, "That an A+");
		 }
		 else if(a1>89) {
					 JOptionPane.showMessageDialog(null, "That an A");
					 }
					
				 
				 else if(a1>79) {
					 JOptionPane.showMessageDialog(null, "That an B");
				 }
					 else if(a1>69) {
						 JOptionPane.showMessageDialog(null, "That an C");
					 }
						 else if(a1>59) {
							 JOptionPane.showMessageDialog(null, "That an D");
						 }
						 else if(a1>-1) {
							 JOptionPane.showMessageDialog(null, "That an F");
						 }
						 else {
							 JOptionPane.showMessageDialog(null, "Your weird or dumb");
						 }
	}

}
