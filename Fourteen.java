import javax.swing.JOptionPane;

public class Fourteen {
	public static void main(String args[]){
		float measure;
		int options;
		
		measure = Float.parseFloat(JOptionPane.showInputDialog("Write the numbers of Kilograms: "));
		
		options = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
				+ "1. Hectograms\n"
				+ "2. Decagrams\n"
				+ "3. Grams\n"
				+ "4. Decigrams\n"
				+ "5. Centigrams\n"
				+ "6. Miligrams\n"));
		
		switch (options) {
			case 1: measure *= 10; // measure = measure * 10;
				JOptionPane.showMessageDialog(null, "The new measure in Hectograms is: " +measure);
				break;
				
			case 2: measure *= 100;
				JOptionPane.showMessageDialog(null, "The new measure in Decagrams is: " +measure);
				break;
				
			case 3: measure *= 1000;
				JOptionPane.showMessageDialog(null, "The new measure in Grams is: " +measure);
				break;
							
			case 4 :measure *= 10000;
				JOptionPane.showMessageDialog(null, "The new measure in Decigrams is: " +measure);
				break;
			
			case 5: measure *= 100000;
				JOptionPane.showMessageDialog(null, "The new measure in Centigramos is: " +measure);
				break;
			
			case 6: measure *= 1000000;
				JOptionPane.showMessageDialog(null, "The new measure in Miligrams is: " +measure);
				break;
				
			default: JOptionPane.showMessageDialog(null, "Error, Option invalid. Please check");
		}
	} 
}
