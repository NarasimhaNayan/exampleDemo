package factory;

import java.util.Random;

import graphics.Circle;
import graphics.Rectangle;
import graphics.Shape;
import graphics.Triangle;

public class ShapesFactory {
	public static Shape produceShape() {
		int n = new Random().nextInt();
		switch(n%3) {
			case 0:
				return new Circle(4.5);
			case 1:
				return new Triangle(4.5,5);
			default:
				return new Rectangle(6,5);
		}
	}
}
