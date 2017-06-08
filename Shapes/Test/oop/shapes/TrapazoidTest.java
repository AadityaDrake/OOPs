package oop.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrapazoidTest {

	Point tl = new Point(0, 0);
	Point tr = new Point(0, 0);
	Point bl = new Point(0, 0);
	Point br = new Point(0, 0);
	Trapazoid t;

	@Test
	public void testNotQuadrilateral() {
		//not Quadrilateral
		tl = new Point(0, 0);
		tr = new Point(0, 0);
		bl = new Point(0, 0);
		br = new Point(0, 0);
		t = new Trapazoid(tl, tr, br, bl);
		assertFalse(t.isRightShape());
	}
		
	@Test
	public void testQuadrilateral() {
		//Quadrilateral
		tl = new Point(0, 1);
		tr = new Point(3, 2);
		bl = new Point(0, 0);
		br = new Point(4, 1);
		t = new Trapazoid(tl, tr, bl, br);
		assertTrue(t.isRightShape());	
	}
		
	@Test
	public void testTrapazoid() {
		//Trapezoid
		tl = new Point(1, 2);
		tr = new Point(2, 2);
		bl = new Point(0, 0);
		br = new Point(4, 0);
		t = new Trapazoid(tl, tr, bl, br);
		System.out.format("%n%s%n", t);
		assertTrue(t.isRightShape());
	}
		
	@Test
	public void testParralelogram() {
		// Parallelogram
		tl = new Point(4, 3);
		tr = new Point(10, 3);
		bl = new Point(0, 0);
		br = new Point(6, 0);
		t = new Trapazoid(tl, tr, bl, br);
		assertTrue(t.isRightShape());
	}
		
	@Test
	public void testRhombus() {
		// Rhombus
		tl = new Point(4, 3);
		tr = new Point(8, 3);
		bl = new Point(0, 0);
		br = new Point(4, 0);
		t = new Trapazoid(tl, tr, bl, br);
		assertTrue(t.isRightShape());
	}
		
	@Test
	public void testRectangle() {
		//Rectangle
		tl = new Point(0, 0);
		tr = new Point(0, 2);
		bl = new Point(1, 0);
		br = new Point(1, 2);
		t = new Trapazoid(tl, tr, bl, br);
		assertTrue(t.isRightShape());
	}
		
	@Test
	public void testSquare() {
		//Square
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		t = new Trapazoid(tl, tr, bl, br);		
		assertTrue(t.isRightShape());
	}

}
