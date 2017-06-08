package oop.shapes;

public class Point {

	int x,y;
	Point(int a, int b)
	{
		x=a;
		y=b;
	}
	int getX()
	{
		return x;
	}
	int getY()
	{
		return y;
	}
	void move(int a,int b)
	{
		x=a;
		y=b;
	}
	public String toString()
	{
		return "p("+getX()+"," +getY()+")";
	}

}
