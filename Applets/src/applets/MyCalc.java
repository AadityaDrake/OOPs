package applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList

public class MyCalc extends Applet implements ActionListener {
	TextField tfNum1,tfNum2,tfResult;
	Label lbNum1,lbNum2,lbResult;
	Button btnMul;
	
	public void init(){
		tfNum1 = new TextField();
		tfNum2 = new TextField();
		tfResult = new TextField();
		
		lbNum1 = new Label("Num 1");
		lbNum2 = new Label("Num 2");
		lbResult = new Label("Result");
		tfNum1.setText("0");
		tfNum2.setText("0");
		btnMul = new Button("Multiply");
		
			
		add(lbNum1);
		add(tfNum1);
		add(lbNum2);
		add(tfNum2);
		add(lbResult);
		add(tfResult);
		add(btnMul);
		
		btnMul.addActionListener(this);
	}
		
		public void paint(Graphics g){
			int a = Integer.parseInt(tfNum1.getText());
			int b = Integer.parseInt(tfNum2.getText());
			int result = a*b;
			tfResult.setText("" + result);
		}
		
		public void actionPerformed(ActionEvent e){
			repaint();
		}	
}
