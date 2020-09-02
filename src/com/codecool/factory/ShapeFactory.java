package com.codecool.factory;

import com.codecool.factory.shapes.Circle;
import com.codecool.factory.shapes.Rectangle;
import com.codecool.factory.shapes.Shape;
import com.codecool.factory.shapes.Square;

public class ShapeFactory {

    public Shape createShape(ShapeTypes shapeTypes){
        switch (shapeTypes){
            case CIRCLE -> {
                return new Circle();
            }
            case SQUARE -> {
                return new Square();
            }
            case RECTANGLE -> {
                return new Rectangle();
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}
