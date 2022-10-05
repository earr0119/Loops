import javax.swing.JOptionPane;

public class Thirteen {
	public static void main(String args[]){
		final int initial_balance = 1000;
		int options;
		float deposit, balance, withdraw;
		
		options = Integer.parseInt(JOptionPane.showInputDialog("Welcome to your ATM\n"
				+ "1. Deposit money into your bank account\n"
				+ "2. Withdraw money into your bank account\n"
				+ "3. Exit"));
		
		switch(options) {
			case 1: deposit = Float.parseFloat(JOptionPane.showInputDialog("Write how much money do you want to deposit"));
					balance = initial_balance + deposit;
					JOptionPane.showMessageDialog(null, "You have in your account the amount of: $ " +balance);
					break;

			case 2: withdraw = Float.parseFloat(JOptionPane.showInputDialog("Write how much money do you want to withdraw"));
				if (withdraw > initial_balance) {
					JOptionPane.showMessageDialog(null, "You do not have in your account the amount to withdraw");
				}
				else {
					balance = initial_balance - withdraw;
					JOptionPane.showMessageDialog(null, "You have in your account the amount of: $ " +balance);
					break;		
				}
			case 3: break;
			
			default: JOptionPane.showMessageDialog(null, "Error, Option invalid. Please check");
		}
	}

}
