import static graphics.Calculator.square;

import graphics.Circle;
import graphics.Rectangle; 
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(4.5);
		Rectangle r1 = new Rectangle(3,6);
		System.out.println("Area of circle:" + c1.area());
		System.out.println("Area of rectangle"+ r1.area());
		System.out.println("Sqaure: "+square(9));
	}

}
