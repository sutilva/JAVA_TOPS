package com.a710;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class JframeEx implements ActionListener {
	
	JFrame frame;
	JTextArea ta;
	JButton btn1;
	JLabel lab1, lab2;
	
	public JframeEx() {
		
		frame = new JFrame();
		
		btn1 = new JButton("Count");
		btn1.setBounds(176, 176, 89, 23);
		btn1.addActionListener(this);
		
		ta = new JTextArea();
		ta.setBounds(94, 56, 258, 109);
		
		lab1 = new JLabel();
		lab1.setBounds(94, 31, 117, 14);
		
		lab2 = new JLabel();
		lab2.setBounds(235, 31, 117, 14);
		
		frame.add(btn1);
		frame.add(ta);
		frame.add(lab1);
		frame.add(lab2);
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new JframeEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn1) {
			
			String s = ta.getText().toString();
			String word[] = s.split("\\s");
			lab1.setText("Words: " + word.length);
			lab2.setText("Characters: " + s.length());
		}
		
	}
}
