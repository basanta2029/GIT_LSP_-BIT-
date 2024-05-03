package org.howard.edu.lsp.oopfinal.question3;

//Client.java
public class Client {
 public static void main(String[] args) {
     ShapeFactory shapeFactory = new ShapeFactory();

     // Create a Circle and draw
     Shape circle = shapeFactory.getShape("CIRCLE");
     circle.draw();

     // Create a Rectangle and draw
     Shape rectangle = shapeFactory.getShape("RECTANGLE");
     rectangle.draw();
 }
}

