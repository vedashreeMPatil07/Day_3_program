package oops_polymorphism_ex;
class Shape {
    void draw() {
        // Default drawing method for a shape
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
        // Code to draw a circle
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
        // Code to draw a rectangle
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
        // Code to draw a triangle
    }
}

public class Example_2 {
	 public static void main(String[] args) {
	        Shape[] shapes = new Shape[3];
	        shapes[0] = new Circle();
	        shapes[1] = new Rectangle();
	        shapes[2] = new Triangle();

	        for (Shape shape : shapes) {
	            shape.draw();
	        }

}}
