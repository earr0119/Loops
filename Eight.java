import javax.swing.JOptionPane;

public class Eight {
	public static void main(String args[]){
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
		
		if (num < 10) {
			JOptionPane.showMessageDialog(null, "The number " +num+" has one digit");
		}
		else if (num < 100) {
			JOptionPane.showMessageDialog(null, "The number " +num+" have two digits");
		}
		else if (num < 1000) {
			JOptionPane.showMessageDialog(null, "The number " +num+" have Three digits");
		}
		else if (num < 10000) {
			JOptionPane.showMessageDialog(null, "The number " +num+" have four digits");
		}
		else if (num < 100000) {
			JOptionPane.showMessageDialog(null, "The number " +num+" have five digits");
		}
	}
}
