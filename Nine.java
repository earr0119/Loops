import javax.swing.JOptionPane;

public class Nine {
	public static void main(String args[]){
		int day, month, year;
		
		day = Integer.parseInt(JOptionPane.showInputDialog("Write a day: "));
		month = Integer.parseInt(JOptionPane.showInputDialog("Write a month: "));
		year = Integer.parseInt(JOptionPane.showInputDialog("Write a year: "));
		
		
		if ((day >= 1) && (day <= 30)) {
			if ((month >= 1) && (month <= 12)) {
				if ((year != 0)) {
					JOptionPane.showMessageDialog(null, "Correct date");
				}
				else {
					JOptionPane.showMessageDialog(null, "Wrong date, wrong year");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Wrong date, wrong month");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong date, wrong day");
		}
	
	}
}
