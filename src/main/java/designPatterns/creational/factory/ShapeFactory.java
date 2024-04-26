package designPatterns.creational.factory;

public class ShapeFactory {
    public static Shape getShape(String input){
        return switch (input) {
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}
