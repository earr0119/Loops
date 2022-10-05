import javax.swing.JOptionPane;

public class Three {
	public static void main(String args[]){
	char letter;
	
	letter = JOptionPane.showInputDialog("Write a letter: ").charAt(0);		
	
	if (Character.isUpperCase(letter)) {
		JOptionPane.showMessageDialog(null, "Letter is Uppercase");
	}
	else {
		JOptionPane.showMessageDialog(null, "Letter is Lowercase");
	}
	
  }

}
