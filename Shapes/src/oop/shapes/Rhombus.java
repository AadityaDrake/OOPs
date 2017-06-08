package oop.shapes;

public class Rhombus extends Trapazoid {

	public Rhombus(Point a, Point b, Point c, Point d) {
		super(a, b, c, d);

	}
	public String toString()
	{
		return "Rhombus["+tl+tr+bl+br+"]";
	}
public static void main(String args[])
	{
		Point tl=new Point(4, 3);
		Point tr=new Point(9, 3);
		Point bl=new Point(0, 0);
		Point br=new Point(5, 0);
		Quadrilateral q =new Quadrilateral(tl,tr,bl,br);
		System.out.println(q);
	}
public boolean isRightShape() 
	{
		int atl,atr,abl,abr;
		boolean flag;
		atl=Shapes.angle(tl,tr,bl);
		atr=Shapes.angle(tr,tl,br);
		abl=Shapes.angle(bl,tl,br);
		abr=Shapes.angle(br,tr,bl);
		if(atl==abr && atr==abl)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
	}


}
