import javax.swing.JOptionPane;

public class Twelve {
	public static void main(String args[]){
		int record;
		
		record = Integer.parseInt(JOptionPane.showInputDialog("Write your record: "));
		
		switch (record) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4: JOptionPane.showMessageDialog(null, "Your record is Insufficient: ");
				break;
				
			case 5: JOptionPane.showMessageDialog(null, "Your record is Sufficient: ");
				break;
				
			case 6: JOptionPane.showMessageDialog(null, "Your record is Good: ");
				break;

			case 7:
			case 8: JOptionPane.showMessageDialog(null, "Your record is Remarkable: ");
				break;
				
			case 9:
			case 10: JOptionPane.showMessageDialog(null, "Your record is Excellent: ");
				break;
				
			default: JOptionPane.showMessageDialog(null, "Your record is Invalid");
					
		}
	}

}
