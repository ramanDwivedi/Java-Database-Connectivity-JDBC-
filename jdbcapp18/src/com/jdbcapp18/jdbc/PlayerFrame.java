package com.jdbcapp18.jdbc;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PlayerFrame extends Frame implements ActionListener {


Button b1,b2,b3,b4;
String label;
EmployeeTo eto;
EmployeeService es;
public PlayerFrame()
{
	this.setVisible(true);
	this.setSize(500,500);
	this.setTitle("Player Frame");
	this.setBackground(Color.green);
	this.setLayout(null);
	this.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	});
	b1=new Button("First");
	b2=new Button("Next");
	b3=new Button("Previous");
	b4=new Button("Last");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	Font f=new Font("arial",Font.BOLD,20);
	b1.setFont(f);
	b2.setFont(f);
	b3.setFont(f);
	b4.setFont(f);
	b1.setBounds(50,400,100,30);
	b2.setBounds(160,400,100,30);
	b3.setBounds(270,400,100,30);
	b4.setBounds(380,400,100,30);
	this.add(b1);
	this.add(b2);
	this.add(b3);
	this.add(b4);
	es=new EmployeeService();
}
public void actionPerformed(ActionEvent ae)
{label=ae.getActionCommand();
eto=es.getEmployee(label);
repaint();
}
public void paint(Graphics g)
{
	Font f=new Font("arial",Font.BOLD,30);
	g.setFont(f);
	String msg=es.getMsg();
	if(msg.equals(""))
	{
		g.drawString("Employee Number :"+eto.getEno(),50,100);
		g.drawString("Employee Name :"+eto.getEname(),50,150);
		g.drawString("Employee Salary :"+eto.getEsal(),50,200);
		g.drawString("Employee Number :"+eto.getEaddr(),50,250);
	}
	else
	{
		g.drawString(msg,50,300);
	}




	
}
}

