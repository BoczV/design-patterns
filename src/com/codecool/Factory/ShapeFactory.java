package com.codecool.Factory;

import com.codecool.Factory.shapes.Circle;
import com.codecool.Factory.shapes.Rectangle;
import com.codecool.Factory.shapes.Shape;
import com.codecool.Factory.shapes.Square;

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
