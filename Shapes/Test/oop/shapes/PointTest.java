package oop.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	@Test
	public void testConstructor() {
		// Point has an X and a Y value
		Point p = new Point(2, 3);
		assertEquals(2, p.getX());
		assertEquals(3, p.getY());
	}
	
	@Test
	public void testMove() {
		Point p = new Point(2, 3);
		assertEquals(2, p.getX());
		assertEquals(3, p.getY());
		
		p.move(4,5);
		assertEquals(4, p.getX());
		assertEquals(5, p.getY());
	}
	/*
	@Test
	public void testToString() {
		Point p = new Point(2, 3);
		assertEquals("p(2, 3)", p.toString());
	}
	*/
}
