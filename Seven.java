import javax.swing.JOptionPane;

public class Seven {
	public static void main(String args[]){
		int a,b,c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
		
		if ((a > b) && (b > c)) {
			JOptionPane.showMessageDialog(null, "The order of the numbers: " +a+ " - "+b+ " - "+c);
		}
		else if ((a > c) && (c > b)) {
			JOptionPane.showMessageDialog(null, "The order of the numbers: " +a+ " - "+c+ " - "+b);
		}
		else if ((b > a) && (a > c)) {
			JOptionPane.showMessageDialog(null, "The order of the numbers: " +b+ " - "+a+ " - "+c);
		}
		else if ((b > c) && (c > a)) {
			JOptionPane.showMessageDialog(null, "The order of the numbers: " +b+ " - "+c+ " - "+a);
		}
		else if ((c > a) && (a > b)) {
			JOptionPane.showMessageDialog(null, "The order of the numbers: " +c+ " - "+a+ " - "+b);
		}
		else {
			JOptionPane.showMessageDialog(null, "The order of the numbers: " +c+ " - "+b+ " - "+a);	
		}	
		
		
	}
}
