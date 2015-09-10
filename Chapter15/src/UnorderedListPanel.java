//************************************************************************************************
//Programmer: Christopher Murphy
//Program/Class: Unordered List Panel/ UnorderdListPanel.java
//Details: This is the panel added to the UnorderedListFrame, it contains an array list as well
//as the GUI representation of the program, with joined listeners
//************************************************************************************************
import java.awt.Dimension;
import java.awt.List;
import java.awt.event.*;

import javax.swing.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
/**
 * 
 * @author Chris Murphy
 *
 */
public class UnorderedListPanel extends JPanel {
	
/**
 * declarations	
 */
	private JButton addButton, removeButton, showListButton, frontButton, rearButton, addAfterButton;
	private JLabel instructionLabel, displayOutputLabel, indexLabel;
	private JTextField enterStringTextField, indexTextField;
	public int stringIndex, i, addIndex;
	public String parseString;

	
	ArrayList<String> stringList = new ArrayList<String>();
	
	
	/**
	 * constructor
	 */
	public UnorderedListPanel() {
		
	
		
		/**
		 * buttons are created		
		 */
		addButton = new JButton("Add to List");
		removeButton = new JButton ("Remove from List");
		showListButton = new JButton ("Show List");
		frontButton = new JButton ("Add to front");
		rearButton = new JButton ("Add to rear");
		addAfterButton = new JButton("Add after index");
		
		
		/**
		 * action listeners added to the buttons
		 */
		ButtonListener bListener = new ButtonListener();
		addButton.addActionListener(bListener);
		removeButton.addActionListener(bListener);
		showListButton.addActionListener(bListener);
		frontButton.addActionListener(bListener);
		rearButton.addActionListener(bListener);
		addAfterButton.addActionListener(bListener);
		
		
		
		
		/**
		 * labels and text field are created
		 */
		enterStringTextField = new JTextField(20); 
		indexTextField = new JTextField(5);
		instructionLabel = new JLabel ("Enter String: ");
		displayOutputLabel = new JLabel (" ");
		indexLabel = new JLabel("Add after/ remove index:");
		
		
		
		
		
		/**
		 *  panel components are added here
		 */
		add(instructionLabel);
		add(enterStringTextField);
		add(indexLabel);
		add(indexTextField);
		add(frontButton);
		add(rearButton);
		add(addAfterButton);
		add(removeButton);
		add (displayOutputLabel);
		
		
		/**
		 *  frame shape is declared here
		 */
		setPreferredSize(new Dimension(275,180));
		
		
		
	}
	
	/**
	 * button listener has case statement to determine action of stack object
	 * @author Failbot
	 *
	 */
	public class ButtonListener implements ActionListener {
		public void actionPerformed (ActionEvent event){
			
			/**
			 * adds an element to the end of the list when pressed, clears the text field
			 */
			if (event.getSource() == rearButton){
				stringList.add(enterStringTextField.getText());
				
				enterStringTextField.setText(null);
				
				displayOutputLabel.setText(""+ stringList + "");
			}
			
			
			/**
			 * removes the item in the rear of the list
			 */
			if (event.getSource() == removeButton){
				addIndex =  Integer.parseInt( indexTextField.getText());
				stringList.remove(addIndex);
				displayOutputLabel.setText(""+ stringList + "");
			}
			
			/**
			 * this button simply displays the contents of the list as a string
			 */
			if (event.getSource() == showListButton){
				
				displayOutputLabel.setText(""+ stringList + "");
			}
			
			/**
			 * this button shifts all the items in the list to a higher index, and places the textfield
			 * into the front of the list
			 */
			if (event.getSource() == frontButton){
				
				
				stringList.add("replace me");
				stringIndex = (stringList.size() -1); 
			
			/**
			 * iterates through the list, replacing the data with the previous address	
			 */
				for ( i = stringIndex; i >= 1; i--){
				
				stringList.set( i , stringList.get(i -1));
				
				}
			/**
			 * sets the zero index to the textfield and clears the textbox
			 */
			stringList.set(0, enterStringTextField.getText());
			enterStringTextField.setText(null);
				
				displayOutputLabel.setText("" + stringList + "");
			}		
			
			if (event.getSource() == addAfterButton){
				
				addIndex =  (Integer.parseInt( indexTextField.getText()) +1);
				
				stringList.add( addIndex, enterStringTextField.getText());
				
				enterStringTextField.setText(null);
				
				displayOutputLabel.setText(""+ stringList + "");
			}
		}
		
	}

	
	
}