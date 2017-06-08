package oop.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	Point tl = new Point(0, 0);
	Point tr = new Point(0, 0);
	Point bl = new Point(0, 0);
	Point br = new Point(0, 0);
	Rectangle r;

	@Test
	public void testArea() {
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		r = new Rectangle(tl, tr, bl, br);		
		assertTrue(r.isRightShape());
		assertEquals(1, r.area(), .001);
	}

	@Test
	public void testAreaLT() 
	{
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		r = new Rectangle(tl, tr, bl, br);		
		assertTrue(r.isRightShape());
		tl = new Point(0, 0);
		tr = new Point(0, 2);
		bl = new Point(2, 0);
		br = new Point(2, 2);
		Rectangle r1 = new Rectangle(tl, tr, bl, br);		
		assertTrue(r1.isRightShape());
		assertTrue(r.areaLT(r1));
		assertFalse(r1.areaLT(r));
	}

	@Test
	public void testAreaGT() {
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		r = new Rectangle(tl, tr, bl, br);		
		assertTrue(r.isRightShape());
		tl = new Point(0, 0);
		tr = new Point(0, 2);
		bl = new Point(2, 0);
		br = new Point(2, 2);
		Rectangle r1 = new Rectangle(tl, tr, bl, br);		
		assertTrue(r1.isRightShape());
		assertFalse(r.areaGT(r1));
		assertTrue(r1.areaGT(r));
	}

	@Test
	public void testAreaEqual() {
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		r = new Rectangle(tl, tr, bl, br);		
		assertTrue(r.isRightShape());
		tl = new Point(0, 0);
		tr = new Point(0, 2);
		bl = new Point(2, 0);
		br = new Point(2, 2);
		Rectangle r1 = new Rectangle(tl, tr, bl, br);		
		assertTrue(r1.isRightShape());
		assertTrue(r.areaEqual(r));
		assertFalse(r1.areaEqual(r));
	}

	@Test
	public void testNotQuadrilateral() {
		//not Quadrilateral
		tl = new Point(0, 0);
		tr = new Point(0, 0);
		bl = new Point(0, 0);
		br = new Point(0, 0);
		r = new Rectangle(tl, tr, br, bl);
		assertFalse(r.isRightShape());
	}
		
	@Test
	public void testQuadrilateral() {
		//Quadrilateral
		tl = new Point(0, 1);
		tr = new Point(3, 2);
		bl = new Point(0, 0);
		br = new Point(4, 1);
		r = new Rectangle(tl, tr, bl, br);
		assertFalse(r.isRightShape());	
	}
		
	@Test
	public void testTrapazoid() {
		//Trapezoid
		tl = new Point(1, 2);
		tr = new Point(2, 2);
		bl = new Point(0, 0);
		br = new Point(4, 0);
		r = new Rectangle(tl, tr, bl, br);
		assertFalse(r.isRightShape());
	}
		
	@Test
	public void testParralelogram() {
		// Rectangle
		tl = new Point(4, 3);
		tr = new Point(10, 3);
		bl = new Point(0, 0);
		br = new Point(6, 0);
		r = new Rectangle(tl, tr, bl, br);
//		p.printQuadrilateralInfo();
		assertFalse(r.isRightShape());
	}
		
	@Test
	public void testRhombus() {
		// Rhombus
		tl = new Point(4, 3);
		tr = new Point(8, 3);
		bl = new Point(0, 0);
		br = new Point(4, 0);
		r = new Rectangle(tl, tr, bl, br);
//		p.printQuadrilateralInfo();
		assertFalse(r.isRightShape());
	}
		
	@Test
	public void testRectangle() {
		//Rectangle
		tl = new Point(0, 0);
		tr = new Point(0, 2);
		bl = new Point(1, 0);
		br = new Point(1, 2);
		r = new Rectangle(tl, tr, bl, br);
//		p.printQuadrilateralInfo();
		System.out.format("%n%s%n", r);
		assertTrue(r.isRightShape());
	}
		
	@Test
	public void testSquare() {
		//Square
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		r = new Rectangle(tl, tr, bl, br);		
//		p.printQuadrilateralInfo();
		assertTrue(r.isRightShape());
	}

}
