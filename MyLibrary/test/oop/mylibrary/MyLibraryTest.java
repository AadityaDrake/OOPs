package oop.mylibrary;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Test;
import java.util.ArrayList;

public class MyLibraryTest {

	private MyLibrary ml;

	@Test
	public void testConstructor() {
		MyLibrary ml = new MyLibrary();
		assertThat(ml, instanceOf(MyLibrary.class));
	//	fail("Not yet implemented");
	}
	@Test
	public void testGetFriends() {
		ml = new MyLibrary();
		assertEquals(0,ml.getFriend().size());
		assertThat(ml.getFriend(), instanceOf(ArrayList.class));
	}
	@Test
	public void testItem() {
		ml = new MyLibrary();
		assertEquals(0,ml.getItem().size());
		assertThat(ml.getItem(), instanceOf(ArrayList.class));
	}
	@Test
	public void testLoan() {
		ml = new MyLibrary();
		assertEquals(0,ml.getLoan().size());
		assertThat(ml.getLoan(), instanceOf(ArrayList.class));
	}
	@Test
	public void testAddFriend() {
		ml = new MyLibrary();
		Friend testFriend = new Friend("bob","here","123","bob@bob");
		assertEquals(0,ml.getFriend().size());
		assertThat(ml.getFriend(),instanceOf(ArrayList.class));
		ml.addFriend(testFriend);
		assertEquals(1,ml.getFriend().size());
	}
	@Test
	public void testAddItem() {
		ml = new MyLibrary();
		Item testItem = new Item("bobJames");
		assertEquals(0,ml.getItem().size());
		assertThat(ml.getItem(),instanceOf(ArrayList.class));
		ml.addItem(testItem);
		assertEquals(1,ml.getItem().size());
	}
	@Test
	public void testAddLoan() {
		ml = new MyLibrary();
		Friend testFriend = new Friend("bob","here","123","bob@bob");
		Item testItem = new Item("bobJames");
		Loan testLoan = new Loan(testFriend,testItem);
		assertEquals(0,ml.getLoan().size());
		assertThat(ml.getLoan(),instanceOf(ArrayList.class));
		ml.addLoan(testLoan);
		assertEquals(1,ml.getLoan().size());
	}
	
}

