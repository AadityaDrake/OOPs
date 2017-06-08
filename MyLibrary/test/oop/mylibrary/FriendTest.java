package oop.mylibrary;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Test;



public class FriendTest {
	
	private Friend f;
	
	@Test
	public void testConstructor() {
		f = new Friend("bob", "here", "123", "bob@bob");
		assertThat(f, instanceOf(Friend.class));
	//	fail("Not yet implemented");
	}
	@Test 
	public void testSetName() {
		f = new Friend("bob", "here", "123", "bob@bob");
		assertEquals("bob",f.getName());
	}
	@Test 
	public void testSetAddress() {
		f = new Friend("bob", "here", "123", "bob@bob");
		assertEquals("here",f.getAddress());
	}
	@Test 
	public void testSetPhone() {
		f = new Friend("bob", "here", "123", "bob@bob");
		assertEquals("123",f.getPhone());
	}
	@Test 
	public void testSetEmail() {
		f = new Friend("bob", "here", "123", "bob@bob");
		assertEquals("bob@bob",f.getEmail());
	}
}
