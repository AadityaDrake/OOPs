package oop.mylibrary;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {
	
	private Item i = new Item("Playstation");

	@Test
	public void testConstructor() {
		assertThat(i, instanceOf(Item.class));
	//	fail("Not yet implemented");
	}
	@Test
	public void testSetDescription() {
		assertEquals("Playstation", i.getDescription());
	}
}
