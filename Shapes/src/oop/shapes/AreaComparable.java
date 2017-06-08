package oop.shapes;

public interface AreaComparable 
{
	default boolean areaLT(Object o)
	{
		System.out.println("oop.shapes.AreaComparableTest.areaLT(oop.shapes.AreaComparableTest) is not defined");
		return false;
	}
	default boolean areaGT(Object o)
	{
		System.out.println("oop.shapes.AreaComparableTest.areaGT(oop.shapes.AreaComparableTest) is not defined");
		return false;
	}
	default boolean areaEqual(Object o)
	{
		System.out.println("oop.shapes.AreaComparableTest.areaEqual(oop.shapes.AreaComparableTest) is not defined");
		return false;
	}
	default double area()
	{
		System.out.println("oop.shapes.AreaComparableTest.area() is not defined");
		return 0;
	}
}