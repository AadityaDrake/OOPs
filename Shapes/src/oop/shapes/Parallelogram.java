package oop.shapes;

public class Parallelogram extends Trapazoid implements AreaComparable {

	public Parallelogram(Point a, Point b, Point c, Point d) {
		super(a, b, c, d);
	}
	
	public String toString() {
		return "Parallelogram["+tl+tr+bl+br+"]";
	}
	
public static void main(String args[]) {
		Point tl=new Point(4, 3);
		Point tr=new Point(10, 3);
		Point bl=new Point(0, 0);
		Point br=new Point(6, 0);
		Quadrilateral q =new Quadrilateral(tl,tr,bl,br);
		System.out.println(q);
	}

public boolean isRightShape() {
		int atl,atr,abl,abr;
		boolean flag;
		atl=Shapes.angle(tl,tr,bl);
		atr=Shapes.angle(tr,tl,br);
		abl=Shapes.angle(bl,tl,br);
		abr=Shapes.angle(br,tr,bl);
		
		if((atl+abl==180)&&(atr+abr==180)) {
			flag=true;
		}
		
		else {
			flag=false;
		}
		
		return flag;
	}
}