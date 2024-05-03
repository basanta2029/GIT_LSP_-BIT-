package org.howard.edu.lsp.oopfinal.question3;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ShapeFactoryTest {

    @Test
    public void testCircleCreation() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("CIRCLE");
        assertNotNull("The created shape should not be null", shape);
        assertTrue("The shape should be an instance of Circle", shape instanceof Circle);
    }

    @Test
    public void testRectangleCreation() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("RECTANGLE");
        assertNotNull("The created shape should not be null", shape);
        assertTrue("The shape should be an instance of Rectangle", shape instanceof Rectangle);
    }
}

