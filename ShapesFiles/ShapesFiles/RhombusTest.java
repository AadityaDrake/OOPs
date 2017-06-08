package oop.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class RhombusTest {

	Point tl = new Point(0, 0);
	Point tr = new Point(0, 0);
	Point bl = new Point(0, 0);
	Point br = new Point(0, 0);
	Rhombus r;

	@Test
	public void testNotQuadrilateral() {
		//not Quadrilateral
		tl = new Point(0, 0);
		tr = new Point(0, 0);
		bl = new Point(0, 0);
		br = new Point(0, 0);
		r = new Rhombus(tl, tr, br, bl);
		assertFalse(r.isRightShape());
	}
		
	@Test
	public void testQuadrilateral() {
		//Quadrilateral
		tl = new Point(0, 1);
		tr = new Point(3, 2);
		bl = new Point(0, 0);
		br = new Point(4, 1);
		r = new Rhombus(tl, tr, bl, br);
		assertFalse(r.isRightShape());	
	}
		
	@Test
	public void testTrapazoid() {
		//Trapezoid
		tl = new Point(1, 2);
		tr = new Point(2, 2);
		bl = new Point(0, 0);
		br = new Point(4, 0);
		r = new Rhombus(tl, tr, bl, br);
		assertFalse(r.isRightShape());
	}
		
	@Test
	public void testParralelogram() {
		// Parallelogram
		tl = new Point(4, 3);
		tr = new Point(10, 3);
		bl = new Point(0, 0);
		br = new Point(6, 0);
		r = new Rhombus(tl, tr, bl, br);
//		r.printQuadrilateralInfo();
		assertFalse(r.isRightShape());
	}
		
	@Test
	public void testRhombus() {
		// Rhombus
		tl = new Point(4, 3);
		tr = new Point(9, 3);
		bl = new Point(0, 0);
		br = new Point(5, 0);
		r = new Rhombus(tl, tr, bl, br);
//		r.printQuadrilateralInfo();
		System.out.format("%n%s%n", r);
		assertTrue(r.isRightShape());
	}
		
	@Test
	public void testRectangle() {
		//Rectangle
		tl = new Point(0, 0);
		tr = new Point(0, 2);
		bl = new Point(1, 0);
		br = new Point(1, 2);
		r = new Rhombus(tl, tr, bl, br);
//		r.printQuadrilateralInfo();
		assertFalse(r.isRightShape());
	}
		
	@Test
	public void testSquare() {
		//Square
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		r = new Rhombus(tl, tr, bl, br);		
//		r.printQuadrilateralInfo();
		assertTrue(r.isRightShape());
	}

}
