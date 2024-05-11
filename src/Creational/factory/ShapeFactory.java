package Creational.factory;

/*
 *   FACTORY DESIGN PATTERN:
 *   =======================
 *   It is used when all the object creation, and it's business logic
 *   need to keep at one place.
 *
 *
 * */

public class ShapeFactory {
    Shape getShape(String input) {
        switch (input) {
            case "RECTANGLE":
                return new Rectangle();
            case "CIRCLE":
                return new Circle();
            default:
                return null;
        }
    }
}