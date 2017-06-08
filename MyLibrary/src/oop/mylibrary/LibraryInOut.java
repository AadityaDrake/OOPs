package oop.mylibrary;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
 
public class LibraryInOut {
	BufferedReader bfr;
	PrintStream ps1,ps2;
	
	public LibraryInOut(BufferedReader in, PrintStream out, PrintStream err) {
		bfr = in;
		ps1 = out;
		ps2 = err;
	}
	
	public Object getIn() {
		return bfr;
	}

	public Object getErr() {
		return ps1;
	}

	public Object getOut() {
		return ps2;
	}

	public void printFriend(Friend f) {
		ps1.print(f.getName()+"\t"+f.getAddress()+"\t"+f.getPhone()+"\t"+f.getEmail());
		
	}
	
	public void printItem(Item i) {
		ps1.print(i.getDescription());
		
	}

	public void printLoan(Loan l) {
		ps1.print(l.getLender()+"\tborrowed\t"+l.getItem());
		
		
	}

	public void print(ArrayList<?> Friend) {
		Iterator<?> i=Friend.iterator();
		while(i.hasNext()) {
			ps1.print(i.next()+"\n");
		}
	}
	
	public void printItem(ArrayList<?> Item) {    //as we are overiding so can't pass same parameters so we change the name;
		Iterator<?> i=Item.iterator();
		while(i.hasNext()) {
			ps1.print(i.next()+"\n");
		}
	}
	
	public void printLoan(ArrayList<?> Friend) {
		Iterator<?> i=Friend.iterator();
		while(i.hasNext()) {
			ps1.print(i.next()+"\n");
		}
	}
	
	public String in() throws IOException {
		String s=bfr.readLine();
		return s;
	}
}