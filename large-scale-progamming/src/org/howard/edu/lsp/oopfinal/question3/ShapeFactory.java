package org.howard.edu.lsp.oopfinal.question3;

//ShapeFactory.java
public class ShapeFactory {
 
 // Factory method to create shapes
 public Shape getShape(String shapeType) {
     if (shapeType == null) {
         return null;
     }
     if (shapeType.equalsIgnoreCase("CIRCLE")) {
         return new Circle();
     } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
         return new Rectangle();
     }
     return null;
 }
}

