package mycalculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import MyLibrary.MyCalculator;
import MyLibrary.calculator;

public class calculator_GUI implements ActionListener {
	JFrame frame;
	JTextField txt1, txt2, txt3;
	JLabel lbl1, lbl2, lbl3;
	JButton btnAdd, btnSub, btnprd, btndiv, btnrem, btnpow, btnclear, btnclose;

	public calculator_GUI() {
		frame = new JFrame();

		frame.setTitle("Calculator_GUI");
		frame.setSize(250, 200);
		frame.setLayout(new FlowLayout());
		frame.setResizable(false);

		lbl1 = new JLabel();
		lbl1.setText("No.1 : ");
		txt1 = new JTextField();
		txt1.setColumns(20);

		lbl2 = new JLabel();
		lbl2.setText("No.2 : ");
		txt2 = new JTextField();
		txt2.setColumns(20);

		lbl3 = new JLabel();
		lbl3.setText("No.3: ");
		txt3 = new JTextField();
		txt3.setColumns(20);

		btnAdd = new JButton();
		btnAdd.setText("+");
		btnAdd.addActionListener(this);

		btnSub = new JButton();
		btnSub.setText("-");
		btnSub.addActionListener(this);

		btndiv = new JButton();
		btndiv.setText("/");
		btndiv.addActionListener(this);

		btnprd = new JButton();
		btnprd.setText("*");
		btnprd.addActionListener(this);

		btnrem = new JButton();
		btnrem.setText("%");
		btnrem.addActionListener(this);

		btnpow = new JButton();
		btnpow.setText("^2");
		btnpow.addActionListener(this);

		btnclear = new JButton();
		btnclear.setText("c");
		btnclear.addActionListener(this);

		btnclose = new JButton();
		btnclose.setText("close");
		btnclose.addActionListener(this);

		frame.add(lbl1);
		frame.add(txt1);
		frame.add(lbl2);
		frame.add(txt2);
		frame.add(lbl3);
		frame.add(txt3);
		frame.add(btnAdd);
		frame.add(btnSub);
		frame.add(btndiv);
		frame.add(btnprd);
		frame.add(btnrem);
		frame.add(btnpow);
		frame.add(btnclear);
		frame.add(btnclose);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		MyCalculator mc = new MyCalculator();
		calculator c1, c2;

		if (ae.getSource() == btnAdd) {
			int n1, n2;
			n1 = Integer.parseInt(txt1.getText());
			n2 = Integer.parseInt(txt2.getText());
			c1 = new calculator(n1, n2);
			c2 = mc.add(c1);
			txt3.setText(Integer.toString(c2.getNum3()));
		} else if (ae.getSource() == btnSub) {
			int n1, n2;
			n1 = Integer.parseInt(txt1.getText());
			n2 = Integer.parseInt(txt2.getText());
			c1 = new calculator(n1, n2);
			c2 = mc.sub(c1);
			txt3.setText(Integer.toString(c2.getNum3()));

		} else if (ae.getSource() == btndiv) {
			int n1, n2;
			n1 = Integer.parseInt(txt1.getText());
			n2 = Integer.parseInt(txt2.getText());
			c1 = new calculator(n1, n2);
			c2 = mc.div(c1);
			txt3.setText(Integer.toString(c2.getNum3()));

		} else if (ae.getSource() == btnprd) {
			int n1, n2;
			n1 = Integer.parseInt(txt1.getText());
			n2 = Integer.parseInt(txt2.getText());
			c1 = new calculator(n1, n2);
			c2 = mc.prd(c1);
			txt3.setText(Integer.toString(c2.getNum3()));

		} else if (ae.getSource() == btnpow) {
			int n1, n2;
			n1 = Integer.parseInt(txt1.getText());
			n2 = Integer.parseInt(txt2.getText());
			c1 = new calculator(n1, n2);
			c2 = mc.pow(c1);
			txt3.setText(Integer.toString(c2.getNum3()));

		} else if (ae.getSource() == btnclear) {
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");

		}

		else if (ae.getSource() == btnclose) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new calculator_GUI();

	}
}
