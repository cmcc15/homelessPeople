package Homeless;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame implements ActionListener{
	/*
	 * This class is used to make a GUI 
	 * The GUI has two buttons that display information about homeless people
	 */

	private JPanel panel1, panel2, panel3, panel4;
	private JButton button1,button2,button3,button4;
		
	public GUI() {
		
		setTitle("Homeless People Ireland Fact Interface");//to name the GUI
		setSize(300,300);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.black);
		
		// create / instantiate the GUI components and add listener
		button1 = new JButton("Check by location");
	  	button2 = new JButton("Check amount of males vs females");
	  	
	  	button1.addActionListener(this);
	  	
	  	//tf1.setToolTipText("enter your guess here then click the Check your guess button");
	  	button2.addActionListener(this);

	  	// add the GUI components to the frame
	  	panel1 = new JPanel();
	  	panel1.add(button1);
	  	add(panel1);
	  	   
	  	panel2 = new JPanel();
	  	panel2.add(button2);
		add(panel2);
	  	   
	  	
	  	setVisible(true);
	}//end GUI

	@Override
	public void actionPerformed(ActionEvent e) {
			
		
			
	}//end actionPerformed
	
	

}//end class
