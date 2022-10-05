import javax.swing.JOptionPane;

public class Four {
	public static void main(String args[]){
		float purchase, discount;
		
		purchase = Float.parseFloat(JOptionPane.showInputDialog("How much does the client spend in the store: "));
		
		if(purchase > 300) {
			discount = purchase * 0.20f;
			purchase -= discount; // purchase = purchase - discount;
			JOptionPane.showMessageDialog(null, "The total to be paid by the client will be: "+purchase);		
		}
		else {
			Float.parseFloat(JOptionPane.showInputDialog("How much does the client spend in the store: "));
		}
		
		
 }
}
