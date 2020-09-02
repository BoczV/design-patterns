package com.codecool.strategy.operations;

public class DivideOperation implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a / b;
    }
}
