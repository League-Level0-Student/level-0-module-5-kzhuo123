package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {

	String s=JOptionPane.showInputDialog("Enter a number");

	int s1 = Integer.parseInt(s);
	for (int i = 2; i < .5*s1; i++) {
		
	
if (s1%i==0) {
	JOptionPane.showMessageDialog(null, "Not a prime");
	break;
}
else {
	JOptionPane.showMessageDialog(null, "It is a prime");
	break;
}








	}

}
}


