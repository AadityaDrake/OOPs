package oop.shapes;

public class Shapes {
	
	public static boolean compare(double a, double b) {
		return Math.abs(a - b) < .001;
	}
	
	public static double square(double a) {
		return a * a;
	}
	
	// Calculated the Euclidian distance between two points
	public static double distance(Point a, Point b) {
		return Math.sqrt(square(a.getX() - b.getX()) + square(a.getY() - b.getY()));
	}
	
	// Calculates the angle from three points based on the law of cosines
	public static int angle(Point pointA, Point pointB, Point pointC) {
		double a = distance(pointA, pointB);
		double b = distance(pointA, pointC);
		double c = distance(pointB, pointC);
		double squares = square(a) + square(b) - square(c);
		double degrees = Math.toDegrees(Math.acos(squares / (2 * a * b)));
		return (int) Math.round(degrees);
	}

}
