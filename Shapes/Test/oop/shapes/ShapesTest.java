package oop.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapesTest {
	
	Point pointA;
	Point pointB;
	Point pointC;

	@Test
	public void testDistance() {
		pointA = new Point(0, 0);
		pointB = new Point(0, 1);
		assertEquals(Shapes.distance(pointA, pointB), 1, .001);
		pointA = new Point(0, 2);
		pointB = new Point(0, 1);
		assertEquals(Shapes.distance(pointA, pointB), 1, .001);
		pointA = new Point(1, 0);
		pointB = new Point(0, 0);
		assertEquals(Shapes.distance(pointA, pointB), 1, .001);
		pointA = new Point(1, 0);
		pointB = new Point(2, 0);
		assertEquals(Shapes.distance(pointA, pointB), 1, .001);
		pointA = new Point(1, 0);
		pointB = new Point(0, 1);
		assertEquals(Shapes.distance(pointA, pointB), Math.sqrt(2), .001);
	}
	
	@Test
	public void testAngle() {
		pointA = new Point(0, 0);
		pointB = new Point(0, 3);
		pointC = new Point(4, 0);
		assertEquals(90, Shapes.angle(pointA, pointB, pointC), .001);		
		pointA = new Point(0, 0);
		pointB = new Point(0, 1);
		pointC = new Point(1, 0);
		assertEquals(90, Shapes.angle(pointA, pointB, pointC), .001);		
	}

}
