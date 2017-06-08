package oop.shapes;

public class Quadrilateral {

	Point tl,tr,bl,br;
	Quadrilateral(Point a,Point b,Point c,Point d)
	{
		tl=a;
		tr=b;
		bl=c;
		br=d;
		
	}
	public String toString()
	{
		return "Quadrilateral["+tl+tr+bl+br+"]";
	}
	public static void main(String args[])
	{
		Point tl=new Point(0,1);
		Point tr=new Point(3,2);
		Point bl=new Point(0,0);
		Point br=new Point(4,1);
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
