package oop.mylibrary;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Test;

public class LibraryInOutTest {
	ArrayList<Friend> Friends=new ArrayList<Friend>();
	ArrayList<Item> Items=new ArrayList<Item>();
	BufferedReader in=new BufferedReader(new StringReader("text"));
	ByteArrayOutputStream putin1=new ByteArrayOutputStream();
	PrintStream out=new PrintStream(putin1);
	ByteArrayOutputStream putin2=new ByteArrayOutputStream();
	PrintStream err=new PrintStream(putin2);
	
	@Test
	public void Constructor() {
		LibraryInOut lio = new LibraryInOut(in,out,err);
		assertThat(lio.getIn(), instanceOf(BufferedReader.class));
		assertThat(lio.getOut(), instanceOf(PrintStream.class));
		assertThat(lio.getErr(), instanceOf(PrintStream.class));
	}
	
	@Test
	public void testPrint() {
		LibraryInOut lio=new LibraryInOut(in,out,err);
		Friend f=new Friend("bob","here","123","bob@bob");
		Item i=new Item("text");
		Loan l=new Loan(f,i);
		
		lio.printItem(i);
		assertEquals("text",putin1.toString());
		
		putin1.reset();
		
		lio.printFriend(f);
		assertEquals("bob\there\t123\tbob@bob",putin1.toString());
		
		putin1.reset();
		
		lio.printLoan(l);
		assertEquals("bob\there\t123\tbob@bob\tborrowed\ttext",putin1.toString());
	}
		
	@Test
	public void readFriend() throws IOException {
		BufferedReader newIn=new BufferedReader(new StringReader("bobhere123bob@bob"));
		LibraryInOut lio=new LibraryInOut(newIn,out,err);
		assertEquals("bobhere123bob@bob",lio.in());
	}
		
	@Test
	public void readItem() throws IOException {
		BufferedReader newIn=new BufferedReader(new StringReader("test"));	
		LibraryInOut lio=new LibraryInOut(newIn,out,err);
		assertEquals("test",lio.in());
	}
	
	@Test
	public void testPrintFriend() {
		putin1.reset();
		Friend f1=new Friend("bob","here","123","bob@bob");
		Friend f2=new Friend("bob","here","123","bob@bob");
		Friends.add(f1);
		Friends.add(f2);
		LibraryInOut lio =new LibraryInOut(in,out,err);
		lio.print(Friends);
		assertEquals("bob\there\t123\tbob@bob\nbob\there\t123\tbob@bob\n",putin1.toString());
	}
		
	@Test
	public void testPrintItem() {
		putin1.reset();
		Item i1=new Item("apple");
		Item i2=new Item("mango");
		Items.add(i1);
		Items.add(i2);
		LibraryInOut lio =new LibraryInOut(in,out,err);
		lio.printItem(Items);
		assertEquals("apple\nmango\n",putin1.toString());
	}
	
	@Test
	public void testPrintLoan()
	{
		BufferedReader in = new BufferedReader(new StringReader("test"));
		ByteArrayOutputStream outStream=new ByteArrayOutputStream();
		PrintStream out= new PrintStream(outStream);
		PrintStream err= new PrintStream(new ByteArrayOutputStream());
		LibraryInOut lio = new LibraryInOut(in, out, err);
		Friend testFriend = new Friend("bob","here","123","bob@bob");
		Item testItem = new Item("test");
		Loan l=new Loan(testFriend,testItem);
	    lio.printLoan(l);
		assertEquals("bob\there\t123\tbob@bob\tborrowed\ttest",outStream.toString());
	}
}