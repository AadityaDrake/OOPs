package oop.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	Point tl = new Point(0, 0);
	Point tr = new Point(0, 0);
	Point bl = new Point(0, 0);
	Point br = new Point(0, 0);
	Square s;
	
	@Test
	public void testArea() {
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		s = new Square(tl, tr, bl, br);		
		assertTrue(s.isRightShape());
		assertEquals(1, s.area(), .001);
	}

	@Test
	public void testAreaLT() {
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		s = new Square(tl, tr, bl, br);		
		assertTrue(s.isRightShape());
		tl = new Point(0, 0);
		tr = new Point(0, 2);
		bl = new Point(2, 0);
		br = new Point(2, 2);
		Square s1 = new Square(tl, tr, bl, br);		
		assertTrue(s1.isRightShape());
		assertTrue(s.areaLT(s1));
		assertFalse(s1.areaLT(s));
	}

	@Test
	public void testAreaGT() {
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		s = new Square(tl, tr, bl, br);		
		assertTrue(s.isRightShape());
		tl = new Point(0, 0);
		tr = new Point(0, 2);
		bl = new Point(2, 0);
		br = new Point(2, 2);
		Square s1 = new Square(tl, tr, bl, br);		
		assertTrue(s1.isRightShape());
		assertFalse(s.areaGT(s1));
		assertTrue(s1.areaGT(s));
	}

	@Test
	public void testAreaEqual() {
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		s = new Square(tl, tr, bl, br);		
		assertTrue(s.isRightShape());
		tl = new Point(0, 0);
		tr = new Point(0, 2);
		bl = new Point(2, 0);
		br = new Point(2, 2);
		Square s1 = new Square(tl, tr, bl, br);		
		assertTrue(s1.isRightShape());
		assertTrue(s.areaEqual(s));
		assertFalse(s1.areaEqual(s));
	}

	@Test
	public void testNotQuadrilateral() {
		//not Quadrilateral
		tl = new Point(0, 0);
		tr = new Point(0, 0);
		bl = new Point(0, 0);
		br = new Point(0, 0);
		s = new Square(tl, tr, br, bl);
		assertFalse(s.isRightShape());
	}
		
	@Test
	public void testQuadrilateral() {
		//Quadrilateral
		tl = new Point(0, 1);
		tr = new Point(3, 2);
		bl = new Point(0, 0);
		br = new Point(4, 1);
		s = new Square(tl, tr, bl, br);
		assertFalse(s.isRightShape());	
	}
		
	@Test
	public void testTrapazoid() {
		//Trapezoid
		tl = new Point(1, 2);
		tr = new Point(2, 2);
		bl = new Point(0, 0);
		br = new Point(4, 0);
		s = new Square(tl, tr, bl, br);
		assertFalse(s.isRightShape());
	}
		
	@Test
	public void testParralelogram() {
		// Parallelogram
		tl = new Point(4, 3);
		tr = new Point(10, 3);
		bl = new Point(0, 0);
		br = new Point(6, 0);
		s = new Square(tl, tr, bl, br);
//		r.printQuadrilateralInfo();
		assertFalse(s.isRightShape());
	}
		
	@Test
	public void testRhombus() {
		// Square
		tl = new Point(4, 3);
		tr = new Point(9, 3);
		bl = new Point(0, 0);
		br = new Point(5, 0);
		s = new Square(tl, tr, bl, br);
//		s.printQuadrilateralInfo();
		assertFalse(s.isRightShape());
	}
		
	@Test
	public void testRectangle() {
		//Rectangle
		tl = new Point(0, 0);
		tr = new Point(0, 2);
		bl = new Point(1, 0);
		br = new Point(1, 2);
		s = new Square(tl, tr, bl, br);
//		r.printQuadrilateralInfo();
		assertTrue(s.isRightShape());
	}
		
	@Test
	public void testSquare() {
		//Square
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		s = new Square(tl, tr, bl, br);		
//		r.printQuadrilateralInfo();
		System.out.format("%n%s%n", s);
		assertTrue(s.isRightShape());
	}

}
