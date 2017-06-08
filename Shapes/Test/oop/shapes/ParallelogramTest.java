package oop.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParallelogramTest {

	Point tl = new Point(0, 0);
	Point tr = new Point(0, 0);
	Point bl = new Point(0, 0);
	Point br = new Point(0, 0);
	Parallelogram p;

	@Test
	public void testNotQuadrilateral() {
		//not Quadrilateral
		tl = new Point(0, 0);
		tr = new Point(0, 0);
		bl = new Point(0, 0);
		br = new Point(0, 0);
		p = new Parallelogram(tl, tr, br, bl);
		assertFalse(p.isRightShape());
	}
		
	@Test
	public void testQuadrilateral() {
		//Quadrilateral
		tl = new Point(0, 1);
		tr = new Point(3, 2);
		bl = new Point(0, 0);
		br = new Point(4, 1);
		p = new Parallelogram(tl, tr, bl, br);
		assertFalse(p.isRightShape());	
	}
		
	@Test
	public void testTrapazoid() {
		//Trapezoid
		tl = new Point(1, 2);
		tr = new Point(2, 2);
		bl = new Point(0, 0);
		br = new Point(4, 0);
		p = new Parallelogram(tl, tr, bl, br);
		assertTrue(p.isRightShape());
	}
		
	@Test
	public void testParralelogram() {
		// Parallelogram
		tl = new Point(4, 3);
		tr = new Point(10, 3);
		bl = new Point(0, 0);
		br = new Point(6, 0);
		p = new Parallelogram(tl, tr, bl, br);
//		p.printQuadrilateralInfo();
		System.out.format("%n%s%n", p);
		assertTrue(p.isRightShape());
	}
		
	@Test
	public void testRhombus() {
		// Rhombus
		tl = new Point(4, 3);
		tr = new Point(8, 3);
		bl = new Point(0, 0);
		br = new Point(4, 0);
		p = new Parallelogram(tl, tr, bl, br);
//		p.printQuadrilateralInfo();
		assertTrue(p.isRightShape());
	}
		
	@Test
	public void testRectangle() {
		//Rectangle
		tl = new Point(0, 0);
		tr = new Point(0, 2);
		bl = new Point(1, 0);
		br = new Point(1, 2);
		p = new Parallelogram(tl, tr, bl, br);
//		p.printQuadrilateralInfo();
		assertTrue(p.isRightShape());
	}
		
	@Test
	public void testSquare() {
		//Square
		tl = new Point(0, 0);
		tr = new Point(0, 1);
		bl = new Point(1, 0);
		br = new Point(1, 1);
		p = new Parallelogram(tl, tr, bl, br);		
//		p.printQuadrilateralInfo();
		assertTrue(p.isRightShape());
	}
}
