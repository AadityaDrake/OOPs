package applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletHello extends Applet {

	private static final long serialVersionUID = 1L;

	
	TextField text1;
	TextField text2;
	Button button;
	
	//button.addActionListener(new ButtonClickListener());
	
	public void init(){
		TextField text1=new TextField(8);
		TextField text2=new TextField(8);
		Button button=new Button("addition");
		
		button.addActionListener(new ButtonClickListener());
	
		add(text1);
		add(text2);
		add(button);
		
		text1.setText("0");
		text2.setText("0");
		
	}
	
	public void paint(Graphics g){
		
		int sum=0;
		
		try {
			sum=Integer.parseInt(text1.getText())+Integer.parseInt(text2.getText());
		} catch(Exception e) {
				g.drawString(e.getMessage(), 50, 60);
		  }
		g.drawString("The sum is:"+sum,10,75);
	}
	
	private class ButtonClickListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}
