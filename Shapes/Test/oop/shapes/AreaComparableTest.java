package oop.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaComparableTest implements AreaComparable {

	@Test
	public void testAreaLT() {
		assertEquals(false, this.areaLT(this));
	}

	@Test
	public void testAreaGT() {
		assertEquals(false, this.areaGT(this));
	}

	@Test
	public void testAreaEqual() {
		assertEquals(false, this.areaEqual(this));
	}

	@Test
	public void testArea() {
		assertEquals(0, this.area(), .001);
	}

}
