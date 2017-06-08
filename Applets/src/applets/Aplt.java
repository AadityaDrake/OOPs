package applets;
import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class Aplt extends Applet {
	ArrayList<String> buffer;
	public void init() {
		System.out.println("Initialized");
		buffer = new ArrayList<String>();
		buffer.add("Initialized");
	}
	
	public void start() {
		System.out.println("Started");
		buffer.add("Started");
	}
	
	public void stop() {
		System.out.println("Stoped");
		buffer.add("Stoped");
	}
	
	public void destroy() {
		System.out.println("Destroyed");
		buffer.add("Destroyed");
	}
	public void paint(Graphics g){
		int x = 0,y = 0;
		
		for(String s:buffer){
			y += 20;
			g.drawString(s, x, y);
			
		}
	}
}
