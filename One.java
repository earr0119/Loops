import javax.swing.JOptionPane;

public class One {
	public static void main(String args[]){
		int number;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));		
		
		if(number % 10 == 0) {
			JOptionPane.showMessageDialog(null, "The number "+number+" is a multiple of 10");
		}
		else {
			JOptionPane.showMessageDialog(null, "The number is not multiple of 10");
		}
	}

}
