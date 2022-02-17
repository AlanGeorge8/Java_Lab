package lab21;
import java.awt.event.*;
import javax.swing.*;
public class ComplexCalculator implements ActionListener {

	  JTextField text = new JTextField("");
	    JButton button1 = new JButton("1");
	    JButton button2 = new JButton("2");
	    JButton button3 = new JButton("3");
	    JButton button4 = new JButton("+");
	    JButton button5 = new JButton("4");
	    JButton button6 = new JButton("5");
	    JButton button7 = new JButton("6");
	    JButton button8 = new JButton("-");
	    JButton button9 = new JButton("7");
	    JButton button10 = new JButton("8");
	    JButton button11 = new JButton("9");
	    JButton button12 = new JButton("*");
	    JButton button13 = new JButton("/");
	    JButton button14 = new JButton("%");
	    JButton button15 = new JButton("=");
	    JButton button16 = new JButton("0");
	    JButton button17 = new JButton(".");
	    JButton button18 = new JButton("C");
	    public ComplexCalculator() {
	        JFrame frame = new JFrame("Complex Calculator");
	        frame.setSize(640,480);
	        JPanel panel = new JPanel();
	        panel.setLayout(null);
	        text.setBounds(100,100,200,30);
	        panel.add(text);
	        button1.addActionListener(this);
	        button1.setBounds(100,140,50,30);
	        button2.addActionListener(this);
	        button2.setBounds(150,140,50,30);
	        button3.addActionListener(this);
	        button3.setBounds(200,140,50,30);
	        button4.addActionListener(this);
	        button4.setBounds(250,140,50,30);
	        button5.addActionListener(this);
	        button5.setBounds(100,170,50,30);
	        button6.addActionListener(this);
	        button6.setBounds(150,170,50,30);
	        button7.addActionListener(this);
	        button7.setBounds(200,170,50,30);
	        button8.addActionListener(this);
	        button8.setBounds(250,170,50,30);
	        button9.addActionListener(this);
	        button9.setBounds(100,200,50,30);
	        button10.addActionListener(this);
	        button10.setBounds(150,200,50,30);
	        button11.addActionListener(this);
	        button11.setBounds(200,200,50,30);
	        button12.addActionListener(this);
	        button12.setBounds(250,200,50,30);
	        button13.addActionListener(this);
	        button13.setBounds(100,230,50,30);
	        button14.addActionListener(this);
	        button14.setBounds(150,230,50,30);
	        button15.addActionListener(this);
	        button15.setBounds(200,230,50,30);
	        button16.addActionListener(this);
	        button16.setBounds(250,230,50,30);
	        button17.addActionListener(this);
	        button17.setBounds(150,260,50,30);
	        button18.addActionListener(this);
	        button18.setBounds(200,260,50,30);
	        panel.add(button1);
	        panel.add(button2);
	        panel.add(button3);
	        panel.add(button4);
	        panel.add(button5);
	        panel.add(button6);
	        panel.add(button7);
	        panel.add(button8);
	        panel.add(button9);
	        panel.add(button10);
	        panel.add(button11);
	        panel.add(button12);
	        panel.add(button13);
	        panel.add(button14);
	        panel.add(button15);
	        panel.add(button16);
	        panel.add(button17);
	        panel.add(button18);
	        frame.setContentPane(panel);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if(e.getSource() == button1) {
	            text.setText(text.getText()+"1");
	        }
	        else if(e.getSource() == button2) {
	            text.setText(text.getText()+"2");
	        }
	        else if(e.getSource() == button3) {
	            text.setText(text.getText()+"3");
	        }
	        else if(e.getSource() == button4) {
	            text.setText(text.getText()+" + ");
	        }
	        else if(e.getSource() == button5) {
	            text.setText(text.getText()+"4");
	        }
	        else if(e.getSource() == button6) {
	            text.setText(text.getText()+"5");
	        }
	        else if(e.getSource() == button7) {
	            text.setText(text.getText()+"6");
	        }
	        else if(e.getSource() == button8) {
	            text.setText(text.getText()+" - ");
	        }
	        else if(e.getSource() == button9) {
	            text.setText(text.getText()+"7");
	        }
	        else if(e.getSource() == button10) {
	            text.setText(text.getText()+"8");
	        }
	        else if(e.getSource() == button11) {
	            text.setText(text.getText()+"9");
	        }
	        else if(e.getSource() == button12) {
	            text.setText(text.getText()+" * ");
	        }
	        else if(e.getSource() == button13) {
	            text.setText(text.getText()+" / ");
	        }
	        else if(e.getSource() == button14) {
	            text.setText(text.getText()+" % ");
	        }
	        else if(e.getSource() == button15) {
	            float result = compute(text.getText());
	            text.setText(""+result);
	        }
	        else if(e.getSource() == button16) {
	            text.setText(text.getText()+"0");
	        }
	        else if(e.getSource() == button17) {
	            text.setText(text.getText()+".");
	        }
	        else if(e.getSource() == button18) {
	            text.setText("");
	        }
	    }

	    float compute(String expression) {
	        float result = 0;
	        String[] str = expression.split(" ");
	        for(int i=0; i<str.length; ++i) {
	            if(result == 0) {
	                result += Float.parseFloat(str[i]);
	            }
	            else if(str[i].equals("+")) {
	                result += Float.parseFloat(str[++i]);
	            }
	            else if(str[i].equals("-")) {
	                result -= Float.parseFloat(str[++i]);
	            }
	            else if(str[i].equals("*")) {
	                result *= Float.parseFloat(str[++i]);
	            }
	            else if(str[i].equals("/")) {
	                try {
	                    if(Float.parseFloat(str[++i]) == 0)
	                        throw new ArithmeticException("/ by 0 not allowed");
	                    else
	                        result /= Float.parseFloat(str[i]);
	                }
	                catch(ArithmeticException e) {
	                    text.setText(e.getMessage());
	                }
	            }
	            else if(str[i].equals("%")) {
	                try {
	                    if(Float.parseFloat(str[++i]) == 0)
	                        throw new ArithmeticException("/ by 0 not allowed");
	                    else
	                        result %= Float.parseFloat(str[i]);
	                }
	                catch(ArithmeticException e) {
	                    text.setText(e.getMessage());
	                }
	            }

	        }
	        return result;
	    }
	    public static void main(String[] args) {
	        new ComplexCalculator();
	    }
	}


