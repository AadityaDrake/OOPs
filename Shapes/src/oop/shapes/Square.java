package oop.shapes;

public class Square extends Rhombus implements AreaComparable {

	public Square(Point a, Point b, Point c, Point d) {
		super(a, b, c, d);
	}
	public String toString()
	{
		return "Square["+tl+tr+bl+br+"]";
	}
public static void main(String args[])
	{
		Point tl=new Point(0, 0);
		Point tr=new Point(0, 1);
		Point bl=new Point(1, 0);
		Point br=new Point(1, 1);
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
		if(atl==90 && atr==90 && abl == 90 && abr==90 )
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
	}

public double area()
{
	return Shapes.distance(tl, tr)*Shapes.distance(bl, br);
}
boolean areaLT(Square s)
{	
	if(this.area()<s.area())
	{
	return true;
	}
	else
	{
		return false;
	}
}
boolean areaGT(Square s)
{	
	if(this.area()>s.area())
	{
	return true;
	}
	else
	{
		return false;
	}
}
boolean areaEqual(Square s)
{	
	return Shapes.compare(this.area(), s.area());
}



}
