import javax.swing.JOptionPane;

public class Eleven {
	public static void main(String args[]){
		int num1, num2, addition, substraction, multiplication, division;
		char operation;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
		
		operation = JOptionPane.showInputDialog("Write the operation you want to do: ").charAt(0);
		
		switch(operation) {
			case 'S':
			case 's': addition = num1 + num2;
				JOptionPane.showMessageDialog(null,"The addition is: " +addition);
				break;
				
			case 'R':
			case 'r': substraction = num1 - num2;
				JOptionPane.showMessageDialog(null, "The substraction is: " +substraction);
				break;
			
			case 'P':
			case 'p': 
			case 'M':
			case 'm': multiplication = num1 * num2;
				JOptionPane.showMessageDialog(null, "The multiplication is: " +multiplication);
				break;
				
			case 'D':
			case 'd': division = num1 / num2;
				JOptionPane.showMessageDialog(null, "The division is: " +division);
				break;
			 
			default: JOptionPane.showMessageDialog(null, "Error, the command is not valid. Please check!!!");
		}
	}

}
