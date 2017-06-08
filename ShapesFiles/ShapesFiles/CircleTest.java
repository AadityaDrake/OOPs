package oop.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testConstructor() {
		Point p = new Point(1, 2);
		Circle c = new Circle(p, 1.5);
		assertEquals(c.getCenter(), p);
		assertEquals(c.getRadius(), 1.5, .001);
	}

	@Test
	public void testToString() {
		Point p = new Point(1, 2);
		Circle c = new Circle(p, 1.5);
		assertEquals(c.toString(), "Circle [center=p(1, 2), radius=1.5]");
	}
	
	@Test
	public void testMove() {
		Circle c = new Circle(new Point(1, 2), 1.5);
		assertEquals(c.move(new Point(3, 4)).toString(),
				"Circle [center=p(3, 4), radius=1.5]");
	}
	
	@Test
	public void testEnlarge() {
		Circle c = new Circle(new Point(1, 2), 1.5);
		assertEquals(c.enlarge(2.5).toString(),
				"Circle [center=p(1, 2), radius=2.5]");
	}
}
