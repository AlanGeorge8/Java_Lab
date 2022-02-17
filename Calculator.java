package lab21;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener {
	JButton b, b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	JTextField text;
	
	Calculator()
	{
		JFrame f=new JFrame("my frame");
		f.setSize(640,480);
		f.setVisible(true);
		
		 b1=new JButton ("1");
		 b2=new JButton ("2");
		 b3=new JButton ("3");
		 b4=new JButton ("+");
		 b5=new JButton ("4");
		 b6=new JButton ("5");
		 b7=new JButton ("6");
		 b8=new JButton ("-");
		 b9=new JButton ("7");
		 b10=new JButton ("8");
		 b11=new JButton ("9");
		 b12=new JButton ("*");
		 b13=new JButton ("/");
		 b14=new JButton ("%");
		 b15=new JButton ("=");
		 b16=new JButton ("C");
		 
		 f.add(b);
		 f.add(b1);
		 f.add(b2);
		 f.add(b3);
		 f.add(b4);
		 f.add(b5);
		 f.add(b6);
		 f.add(b7);
		 f.add(b8);
		 f.add(b9);
		 f.add(b10);
		 f.add(b11);
		 f.add(b12);
		 f.add(b13);
		 f.add(b14);
		 f.add(b15);
		 f.add(b16);
		 
		 text=new JTextField("  ");
		 text.setBounds(100,100,200,30);
		 f.add(text);
		 b.addActionListener(this);
		 b.setBounds(200,260,50,30);
		 b1.addActionListener(this);
		 b1.setBounds(100,140,50,30);
		 b2.addActionListener(this);
		 b2.setBounds(150,140,50,30);
		 b3.addActionListener(this);
		 b3.setBounds(200,140,50,30);
		 b4.addActionListener(this);
		 b4.setBounds(250,140,50,30);
		 b5.addActionListener(this);
		 b5.setBounds(100,170,50,30);
		 b6.addActionListener(this);
		 b6.setBounds(150,170,50,30);
		 b7.addActionListener(this);
		 b7.setBounds(200,170,50,30);
		 b8.addActionListener(this);
		 b8.setBounds(250,170,50,30);
		 b9.addActionListener(this);
		 b9.setBounds(100,200,50,30);
		 b10.addActionListener(this);
		 b10.setBounds(150,200,50,30);
		 b11.addActionListener(this);
		 b11.setBounds(200,200,50,30);
		 b12.addActionListener(this);
		 b12.setBounds(250,200,50,30);
		 b13.addActionListener(this);
		 b13.setBounds(100,230,50,30);
		 b14.addActionListener(this);
		 b14.setBounds(150,230,50,30);
		 b15.addActionListener(this);
		 b15.setBounds(200,230,50,30);
		 b16.addActionListener(this);
		 b16.setBounds(250,230,50,30);
		 b17.addActionListener(this);
		 b17.setBounds(150,260,50,30);
	
	
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{

text.setText(text.getText()+"1");
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Calculator();
	}

	
	}


