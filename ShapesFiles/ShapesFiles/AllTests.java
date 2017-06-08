package oop.shapes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CircleTest.class, PointTest.class, QuadrilateralTest.class, ShapesTest.class, 
	TrapazoidTest.class, ParallelogramTest.class, RhombusTest.class, 
	RectangleTest.class, SquareTest.class})
public class AllTests {

}
