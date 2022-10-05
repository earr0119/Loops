import javax.swing.JOptionPane;

public class Example1 {
	public static void main(String args[]){
	int number;
	String message;
	
	number = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
	
	
	message = (number % 2 == 0) ? "The number is pair" : "The number is odd";
	//JOptionPane.showMessageDialog(null, (number % 2 == 0) ? "The number is pair" : "The number is odd");
	
	
	JOptionPane.showMessageDialog(null, message);
	
	}
}
