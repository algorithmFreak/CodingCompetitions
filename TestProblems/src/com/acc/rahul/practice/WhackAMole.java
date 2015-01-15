package com.acc.rahul.practice;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class WhackAMole extends JFrame  implements ActionListener  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static int count=0;
	
	private JTextField timeLeftTextField, scoreTextField;
	private JLabel timeLeftLabel, scoreLabel;
	private JButton startButton;
	private JButton[] buttons;
 
	
	public WhackAMole (){
		JFrame frame = new JFrame();
		frame.setTitle("Whack-a-Mole game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
		
		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Dimension d = tk.getScreenSize(); 	
											
 
		int width = 400;
		int height = 400;
 
		frame.setBounds((d.width - width) / 2, (d.height - height) / 2, width, height);
		
 
		Font fixedFont = new Font("Courier New", Font.BOLD, 12); 
 
		
		timeLeftLabel = new JLabel("Time Left:");
		scoreLabel = new JLabel("Score:");
 
		timeLeftTextField = new JTextField("0",10);
		scoreTextField = new JTextField("0",10);
 
		timeLeftTextField.setFont(fixedFont);
		scoreTextField.setFont(fixedFont);
 
		timeLeftTextField.setEditable(false);
		scoreTextField.setEditable(false);
 
		startButton = new JButton("start");
 
		// create first panel and add components
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		inputPanel.add(startButton);
		inputPanel.add(timeLeftLabel);
		inputPanel.add(timeLeftTextField);
		inputPanel.add(scoreLabel);
		inputPanel.add(scoreTextField);
 
		// instantiate mole Buttons, panel and add button components
		final int GRID_BUTTONS_COUNT = 9;
		buttons = new JButton[GRID_BUTTONS_COUNT]; // construct mole buttons
 
		JPanel molePanel = new JPanel();
		molePanel.setLayout(new GridLayout(3,3,5,5));
 
		for (int i = 0; i < buttons.length; i++)
		{
			buttons[i] = new JButton();  // initialize all mole buttons
			buttons[i].addActionListener(this); // add a listener to each button created
			molePanel.add(buttons[i]);
		}
 
		JPanel panel = new JPanel();
		panel.add(inputPanel);
		panel.add(molePanel);
 
		molePanel.setPreferredSize(new Dimension(550, 400));
 
		// Listeners
		startButton.addActionListener(this);
 
		frame.setContentPane(panel);
		frame.setVisible(true);
	}

public static void main(String[] args) {
	WhackAMole m = new WhackAMole();
	
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}}


