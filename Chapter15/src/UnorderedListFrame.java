//************************************************************************************************
//Programmer: Christopher Murphy
//Program/Class: Unordered List/ UnorderedListFrame.java
//Details: This is the main class and GUI frame for the project
//
//************************************************************************************************
import javax.swing.JFrame;
/**
 * 
 * @author Chris Murphy
 *
 */
public class UnorderedListFrame {
	
	public static void main(String[] args) {
	
		/**
		 *  creates a frame and adds the panel from StringDisplayPanel, standard close/visibility options 
		 */
		JFrame frame = new JFrame("Ordered list");
		
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		UnorderedListPanel panel = new UnorderedListPanel();
		
		frame.getContentPane().add(panel);
	
		frame.pack();
		frame.setVisible(true);
	
	}

}
