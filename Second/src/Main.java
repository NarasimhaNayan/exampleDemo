import factory.ShapesFactory;
import graphics.Circle;
import graphics.Rectangle;
import graphics.Shape;

//public class Main {
//	public static void main(String[] args) {
//			int nC=0,nR=0,nT=0;
//			Shape s = null;
//			for (int i=1;i<=10;i++) {
//				s = ShapesFactory.produceShape();
//				System.out.println(s.area());
//				if(s instanceof Circle) nC++;
//				else if(s instanceof Rectangle) nR++;
//				else nT++;
//			}
//			System.out.println("Circles: "+nC);
//			System.out.println("Rectangle: "+nR);
//			System.out.println("Triangle: "+nT);
//			
//	}
//}

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
	public static void main(String args[]) {
		LocalDate d = LocalDate.now();
		System.out.println(d.getDayOfMonth()+"/"+d.getMonthValue()+"/"+d.getYear());
		
		LocalDate dob = LocalDate.of(2011, 10, 2);
		System.out.println(dob.getDayOfMonth()+"/"+dob.getMonthValue()+"/"+dob.getYear());
	
		LocalTime t = LocalTime.now();
		System.out.println(t.getHour()+":"+t.getMinute()+":"+t.getSecond());
		
		LocalTime tob = LocalTime.of(20, 25,45);
		System.out.println(tob.getHour()+":"+tob.getMinute()+":"+tob.getSecond());
	}
}
