/*******************************************************************************************
Name: Sudhin Domala
Course: CS125-01
Lab #: Lab 5
Submission Date: 10:00 pm, Wed (8/2)
Brief Description: This is a Japplet version of finding miles per gallon with input of miles and gallons in the GUI
*********************************************************************************************/

import javax.swing.*; // import for Java Swing Components
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat; // import to format display of mpg


public class MPGCalculatorApplet extends JApplet{

 /* Define fields */
 private JPanel milesPanel; // Applet panel for miles entry
 private JPanel galPanel; // Applet panel for gallons entry
 private JPanel mpgPanel; // Applet panel for mpg display
 private JPanel btnPanel; // Applet panel to hold calculation button
 private JTextField miles; // Text field where user enters miles
 private JTextField gallons; // Text field where user enter gallons
 private JTextField mpg; // Text field where result of calculation is displaed

 // Applet constructor
 public void init(){

 // Build applet panels
 buildMilesPanel(); // method to build miles panel
 buildGalPanel(); // method to build galllon panel
 buildMPGPanel(); // method to build mpg panel
 buildBtnPanel(); // method to build button panel

 // Create a layout manager
 setLayout(new GridLayout(4, 1));

 // Add panels to the content pane
 add(milesPanel);
 add(galPanel);
 add(btnPanel);
 add(mpgPanel);

 } // end init

 // Build panel for miles entry
 private void buildMilesPanel(){
 // Create a new panel
 milesPanel = new JPanel();

 // Create message for miles entry
 JLabel msg1Label = new JLabel("Enter miles car can travel on a full gas tank:");

 // Create text field for miles entry
 miles = new JTextField(6);

 // Create new flow layout
 milesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

 // Add components to panel
 milesPanel.add(msg1Label);
 milesPanel.add(miles);

 } // end buildMilesPanel

 // Build panel for gallons entry
 private void buildGalPanel(){
 // Create a panel to hold gallon components
 galPanel = new JPanel();

 // Create message for gallons entry
 JLabel msg2Label = new JLabel("Enter gallons of gas tank can hold:");

 // Create text field for gallons entry
 gallons = new JTextField(4);

 // Create a new flow layout
 galPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

 // Add components to panel
 galPanel.add(msg2Label);
 galPanel.add(gallons);
 } // end buildGalPanel

 // Build panel for display of MPG
 private void buildMPGPanel(){
 // Create a panel to display mpg calculation
 mpgPanel = new JPanel();

 // Create text labels for panel
 JLabel msg3aLabel = new JLabel("This car has a ");
 JLabel msg3bLabel = new JLabel(" MPG.");

 // Create text field for calculation and
 mpg = new JTextField(4);
 mpg.setEditable(false);

 // Create a new flow layout
 mpgPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

 // Add text fields to panel
 mpgPanel.add(msg3aLabel);
 mpgPanel.add(mpg);
 mpgPanel.add(msg3bLabel);
 } // end buildMPGPanel

 // Build panel for calculate button
 private void buildBtnPanel(){

 // Create a panel to hold a button
 btnPanel = new JPanel();

 // Create a button
 JButton calcBtn = new JButton("Calculate MPG");

 // Register an actionlistener
 calcBtn.addActionListener(new ButtonListener());

 // Create a flow layout
 btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

 // Add the button to the panel
 btnPanel.add(calcBtn);
 } // end buildBtnPanel

 // Listener for calculation button
 private class ButtonListener implements ActionListener{

 public void actionPerformed(ActionEvent e){
 // Define fields for values in mpg calculation
 double milesTemp; // holds miles entered by user
 double galTemp; // holds gallons entered by user
 double mpgTemp; // holds mpg calculation
 DecimalFormat mpgFormat = new DecimalFormat("0.0"); // format for mpg field

 milesTemp = Double.parseDouble(miles.getText()); // get miles user entered
 galTemp = Double.parseDouble(gallons.getText()); // get gallons user entered
 mpgTemp = milesTemp / galTemp; // compute mpg

 mpg.setText(mpgFormat.format(mpgTemp)); // display mpg in text field

 } // end actionPerformed
 } // end ButtonListener

} // end MPGApplet