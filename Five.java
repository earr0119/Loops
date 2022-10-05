import javax.swing.JOptionPane;

public class Five {
	public static void main(String args[]){
		int hours;
		float totalsalary;
		
		hours = Integer.parseInt(JOptionPane.showInputDialog("How many hour did the worker work this week?: "));
		
		if(hours <= 40) {
			totalsalary = hours * 16;
		}
		else {
			totalsalary = (40 * 16) + ((hours - 40) * 20);
		}
		JOptionPane.showMessageDialog(null, "Total salary for hours worked is: " +totalsalary);		

	}
}
