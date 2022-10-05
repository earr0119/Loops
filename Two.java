import javax.swing.JOptionPane;

public class Two {
	public static void main(String args[]){
		int number_One, number_Two;
		
		number_One = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));		
		number_Two = Integer.parseInt(JOptionPane.showInputDialog("Write another number: "));	
		
		if(number_One > number_Two) {
			JOptionPane.showMessageDialog(null, "The number greather is: "+number_One);		
		}
		else if(number_Two > number_One){
			JOptionPane.showMessageDialog(null, "The number greather is: "+number_Two);
		}
		else {
			JOptionPane.showMessageDialog(null, "The numbers are the same");		
		}
	}

}
