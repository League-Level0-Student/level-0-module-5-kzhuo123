package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {

	String s=JOptionPane.showInputDialog("Enter a number");

	int s1 = Integer.parseInt(s);
	for (int i = 2; i < s1; i++) {
		
	
if (s1%i==0) {
	JOptionPane.showMessageDialog(null, "Not a prime");
	
}
else {
	JOptionPane.showMessageDialog(null, "It is a prime");
	
}








	}

}
}


