import javax.swing.JOptionPane;

public class Example {
	public static void main(String args[]){
	int number;
	
	number = Integer.parseInt(JOptionPane.showInputDialog("Write a number between 1 - 5"));
	
	switch (number) {
		case 1: JOptionPane.showMessageDialog(null, "The number is 1");
				break;
		case 2: JOptionPane.showMessageDialog(null, "The number is 2");
				break;
		case 3: JOptionPane.showMessageDialog(null, "The number is 3");
				break;	
		case 4: JOptionPane.showMessageDialog(null, "The number is 4");
				break;
		case 5: JOptionPane.showMessageDialog(null, "The number is 5");
				break;
		
		default:  JOptionPane.showMessageDialog(null, "The number is not in the range");
				
		}	
	}
}
