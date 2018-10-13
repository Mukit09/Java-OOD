package com.mukit.factory;

import java.util.Scanner;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ShapeFactory shapeFactory = new ShapeFactory();
		
		while(scanner.hasNext()) {
			
			String shapeType = scanner.nextLine();
			Shape shape = shapeFactory.getShape(shapeType);
			if(shape != null)
				shape.draw();
			else
				System.out.println("Shape not Found!");
		}
	}

}
