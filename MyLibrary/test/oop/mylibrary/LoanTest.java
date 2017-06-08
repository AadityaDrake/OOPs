package oop.mylibrary;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Test;

public class LoanTest {
	
	private Item i = new Item("Playstation");
	private Friend f = new Friend("bob", "here", "123", "bob@bob");
	private Loan l = new Loan(f,i);
	@Test
	public void testConstructor() {
		assertThat(l, instanceOf(Loan.class));
	//	fail("Not yet implemented");
	}
	@Test
	public void testSetLender() {
		assertEquals(f, l.getLender());
	}
	@Test
	public void testSetItem() {
		assertEquals(i, l.getItem());
	}
}
