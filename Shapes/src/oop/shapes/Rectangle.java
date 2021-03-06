package oop.shapes;

public class Rectangle extends Parallelogram implements AreaComparable {

	public Rectangle(Point a, Point b, Point c, Point d) {
		super(a, b, c, d);
	}
	public String toString() {
				return "Rectangle["+tl+tr+bl+br+"]";
			}
	public static void main(String args[])
			{
				Point tl=new Point(0, 0);
				Point tr=new Point(0, 2);
				Point bl=new Point(1, 0);
				Point br=new Point(1, 2);
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
				if(atl==90 && atr==90 && abl==90 && abr==90)
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
		return Shapes.distance(tl,tr)*Shapes.distance(bl, br);
	}
	boolean areaLT(Rectangle r)
	{
		if(this.area()<r.area())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	boolean areaGT(Rectangle r)
	{
		if(this.area()>r.area())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	boolean areaEqual(Rectangle r)
	{
		if(this.area()==r.area())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

		
	}

