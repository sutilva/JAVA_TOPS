package com.a710;

import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


import org.jdatepicker.impl.*;
import org.jdatepicker.JDatePanel;
import org.jdatepicker.JDatePicker;



public class RegistrationFormEx1 extends WindowAdapter implements ActionListener{
	
	JFrame frame;
	JTextField tf_name, tf_mobile, tf_email;
	JPasswordField pf_password, pf_confirmPassword;
	String courses[] = {"BTech", "ME/MTech", "PHD", "Pharmacy"};
	String semester[] = {"Sem-1", "Sem-2", "Sem-3", "Sem-4","Sem-5","Sem-6","Sem-7","Sem-8"};
	String branch[] = {"CE", "ME", "Civil", "EE", "IE"};
	JComboBox<String> cb_course, cb_semester, cb_branch;
	JRadioButton rb_male, rb_female;
	
	JButton jb_register;
	JLabel lab_title, lab_name, lab_mobile, lab_email, lab_dob, lab_password, lab_confirmPassword, lab_courses, lab_sem, lab_branch, lab_gender;
	
	JDatePickerImpl datePicker;
	
	
	
	
	public RegistrationFormEx1() {
		
		frame = new JFrame("Student Registration Form");
		
		lab_title = new JLabel("Register a new Student");
		lab_title.setFont(new Font("Tahoma", Font.BOLD, 16));
		lab_title.setBounds(54, 10, 198, 28);
		frame.add(lab_title);
		
		lab_name = new JLabel("Name");
		lab_name.setBounds(54, 47, 69, 20);
		frame.add(lab_name);
		
		tf_name = new JTextField();
		tf_name.setBounds(138, 48, 96, 19);
		frame.add(tf_name);
		tf_name.setColumns(10);
		
		lab_dob = new JLabel("DOB");
		lab_dob.setBounds(54, 93, 60, 13);
		frame.add(lab_dob);		

		SqlDateModel model = new SqlDateModel();
		model.setSelected(true);
		Properties p = new Properties();
		p.put("text.day", "Day");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		AbstractFormatter formatter = new AbstractFormatter() {
			
			@Override
			public String valueToString(Object value) throws ParseException {
				if(value != null) {
					Calendar cal = (Calendar) value;
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
					String strDate = dateFormat.format(cal.getTime());
					return strDate;
				}
				else {
					return "";
				}
			}
			
			@Override
			public Object stringToValue(String text) throws ParseException {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		datePicker = new JDatePickerImpl(datePanel, formatter);
	
		datePicker.setBounds(138, 90, 130, 40);		 
		frame.add(datePicker);
		
		ButtonGroup bg = new ButtonGroup();
		
		lab_gender = new JLabel("Gender");
		lab_gender.setBounds(54, 140, 60, 13);
		frame.add(lab_gender);
		
		rb_male = new JRadioButton("Male");
		rb_male.setBounds(138, 136, 52, 21);
		frame.add(rb_male);
		bg.add(rb_male);
		
		rb_female = new JRadioButton("Female");
		rb_female.setBounds(192, 136, 80, 21);
		frame.add(rb_female);
		bg.add(rb_female);
		
		lab_email = new JLabel("Mail_id");
		lab_email.setBounds(54, 175, 69, 20);
		frame.add(lab_email);
		
		tf_email = new JTextField();
		tf_email.setColumns(10);
		tf_email.setBounds(138, 176, 96, 19);
		frame.add(tf_email);
		
		lab_mobile = new JLabel("Mobile");
		lab_mobile.setBounds(54, 218, 69, 20);
		frame.add(lab_mobile);
		
		tf_mobile = new JTextField();
		tf_mobile.setColumns(10);
		tf_mobile.setBounds(138, 219, 96, 19);
		frame.add(tf_mobile);
		
		lab_password = new JLabel("Password");
		lab_password.setBounds(54, 259, 69, 20);
		frame.add(lab_password);
		
		pf_password = new JPasswordField();
		pf_password.setBounds(138, 260, 96, 19);
		frame.add(pf_password);
		
		lab_confirmPassword = new JLabel("Re-Password");
		lab_confirmPassword.setBounds(54, 304, 69, 20);
		frame.add(lab_confirmPassword);
		
		pf_confirmPassword = new JPasswordField();
		pf_confirmPassword.setBounds(138, 305, 96, 19);
		frame.add(pf_confirmPassword);
		
		lab_courses = new JLabel("Courses");
		lab_courses.setBounds(54, 352, 69, 20);
		frame.add(lab_courses);
		
		cb_course = new JComboBox(courses);
		cb_course.setBounds(138, 352, 96, 21);
		frame.add(cb_course);
		
		lab_branch = new JLabel("Branch");
		lab_branch.setBounds(54, 402, 69, 20);
		frame.add(lab_branch);
		
		cb_branch = new JComboBox(branch);
		cb_branch.setBounds(138, 402, 96, 21);
		frame.add(cb_branch);
		
		
		lab_sem = new JLabel("Semester");
		lab_sem.setBounds(54, 451, 69, 20);
		frame.add(lab_sem);
		
		cb_semester = new JComboBox(semester);
		cb_semester.setBounds(138, 451, 96, 21);
		frame.add(cb_semester);
		
		jb_register = new JButton("REGISTER");
		jb_register.setBounds(138, 513, 96, 37);
		frame.add(jb_register);
		jb_register.addActionListener(this);
		
		frame.addWindowListener(this);
				
		
		frame.setSize(500,700);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public void windowClosing(WindowEvent w) {
		  frame.dispose();
		  
		}
	
	public static void main(String[] args) {
		
		new RegistrationFormEx1();
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == jb_register) {
			
			String name_field, gender_field = null, dob_field = null, mail_field, mobile_field, password_field, confirmPassword_field, course_field = null, branch_field = null, semester_field = null;
			
			
			name_field = tf_name.getText().toString();
			
			
			
			//dob_field = datePicker.getVa
			if(rb_male.isSelected()) {
				gender_field = "Male";
			}
			
			else if(rb_female.isSelected()) {
				gender_field = "Female";
			}
			
			else {
				gender_field = null;
			}
			
			mail_field = tf_email.getText().toString();
			mobile_field = tf_mobile.getText().toString();
			password_field = pf_password.getText().toString();
			confirmPassword_field = pf_confirmPassword.getText().toString();
			
			
				course_field = cb_course.getSelectedItem().toString();			
			
				branch_field = cb_branch.getSelectedItem().toString();			
			
				semester_field = cb_semester.getSelectedItem().toString();
				
				try {
					
					final String path = "D:\\Java\\JAVA_TOPS\\JFrame_classTask";
					File dir = new File(path);
					
					FileWriter fw = new FileWriter(new File(dir, "Registration.txt"));
					
					fw.write("Name: " + name_field + "\n");
					fw.write("Date of Birth: " + dob_field + "\n");
					fw.write("Gender: " + gender_field + "\n");
					fw.write("Mail: " + mail_field + "\n");
					fw.write("Moble: " + mobile_field + "\n");
					fw.write("Password: " + password_field + "\n");
					fw.write("Re-Password: " + confirmPassword_field + "\n");
					fw.write("Course: " + course_field + "\n");
					fw.write("Branch: " + branch_field + "\n");
					fw.write("Semester: " + semester_field + "\n");
					
					fw.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			
		}
		
		
	}
}
