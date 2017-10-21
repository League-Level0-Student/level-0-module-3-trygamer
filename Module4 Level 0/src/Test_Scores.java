import javax.swing.JOptionPane;

public class Test_Scores {
public static void main(String[] args) {
	String a =JOptionPane.showInputDialog("What was your last test score?");
	
	if(a.equals("100%") ||a.equals( "one-hundred percent")); {
		JOptionPane.showMessageDialog(null, "You are very smart and must really study hard.");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "Go home, Dummie.");
	}
}
}
