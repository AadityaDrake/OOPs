package oop.shapes;

public class Trapazoid extends Quadrilateral {

	public Trapazoid(Point a, Point b, Point c, Point d) {
		super(a, b, c, d);
		
	}
	
	public String toString()
	{
		return "Trapazoid["+tl+tr+bl+br+"]";
	}
public static void main(String args[])
	{
		Point tl=new Point(1, 2);
		Point tr=new Point(2, 2);
		Point bl=new Point(0, 0);
		Point br=new Point(4, 0);
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
		if(atl+atr+abl+abr==360)
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
