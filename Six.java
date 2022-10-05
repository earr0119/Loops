import javax.swing.JOptionPane;

public class Six {
	public static void main(String args[]){
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
		
		if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
			JOptionPane.showMessageDialog(null, "Both numbers are pair");		
		}
		else if ((num1 % 2 != 0) && (num2 % 2 != 0)){
			JOptionPane.showMessageDialog(null, "Both numbers are odd");
		}
		else {
			JOptionPane.showMessageDialog(null, "One number is pair and the other one is odd");
		}
	
	}
}
