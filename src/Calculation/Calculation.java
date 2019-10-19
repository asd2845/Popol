package Calculation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculation {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double res;
	String oper;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculation window = new Calculation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 274, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 10, 236, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn7.setBounds(12, 114, 50, 50);
		frame.getContentPane().add(btn7);
		
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn8.setBounds(74, 114, 50, 50);
		frame.getContentPane().add(btn8);
		
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn9.setBounds(136, 114, 50, 50);
		frame.getContentPane().add(btn9);
		
		
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "-";
			}
		});
		btnMin.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnMin.setBounds(198, 114, 50, 50);
		frame.getContentPane().add(btnMin);
		
		JButton btnBack = new JButton("\u2190");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Back=null;
				
				if(textField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					Back = strB.toString();
					textField.setText(Back);
				}
			}
		});
		btnBack.setFont(new Font("±¼¸²", Font.BOLD, 14));
		btnBack.setBounds(12, 55, 50, 50);
		frame.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("±¼¸²", Font.BOLD, 14));
		btnClear.setBounds(74, 55, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnNan = new JButton("%");
		btnNan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "%";
			}
		});
		btnNan.setFont(new Font("±¼¸²", Font.BOLD, 14));
		btnNan.setBounds(136, 55, 50, 50);
		frame.getContentPane().add(btnNan);
		
		JButton btnPlu = new JButton("+");
		btnPlu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "+";
			}
		});
		btnPlu.setFont(new Font("±¼¸²", Font.BOLD, 14));
		btnPlu.setBounds(198, 55, 50, 50);
		frame.getContentPane().add(btnPlu);
		
		JButton btnGop = new JButton("*");
		btnGop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "*";
			}
		});
		btnGop.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnGop.setBounds(198, 174, 50, 50);
		frame.getContentPane().add(btnGop);
		
		JButton btnNanu = new JButton("/");
		btnNanu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "/";
			}
		});
		btnNanu.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnNanu.setBounds(198, 234, 50, 50);
		frame.getContentPane().add(btnNanu);
		
		JButton btnNeu = new JButton("=");
		btnNeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ans;
				num2 = Double.parseDouble(textField.getText());
				if(oper == "+") {
					res = num1 + num2;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				
				else if(oper == "-") {
					res = num1 - num2;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				
				else if(oper == "/") {
					res = num1 / num2;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				
				else if(oper == "*") {
					res = num1 * num2;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				
				else if(oper == "%") {
					res = num1 % num2;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
			}
		});
		btnNeu.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnNeu.setBounds(198, 294, 50, 50);
		frame.getContentPane().add(btnNeu);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnPM.setBounds(136, 294, 50, 50);
		frame.getContentPane().add(btnPM);
		
		JButton btnPot = new JButton(".");
		btnPot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! textField.getText().contains("."))
		          {
					textField.setText(textField.getText() + btnPot.getText());
		          }
			}
		});
		btnPot.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnPot.setBounds(74, 294, 50, 50);
		frame.getContentPane().add(btnPot);
		
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn4.setBounds(12, 174, 50, 50);
		frame.getContentPane().add(btn4);
		
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn5.setBounds(74, 174, 50, 50);
		frame.getContentPane().add(btn5);
		
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn6.setBounds(136, 174, 50, 50);
		frame.getContentPane().add(btn6);
		
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn3.setBounds(136, 234, 50, 50);
		frame.getContentPane().add(btn3);
		
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn2.setBounds(74, 234, 50, 50);
		frame.getContentPane().add(btn2);
		
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn1.setBounds(12, 234, 50, 50);
		frame.getContentPane().add(btn1);
		
		
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn0.setBounds(12, 294, 50, 50);
		frame.getContentPane().add(btn0);
		
		
		
	
	}
}
