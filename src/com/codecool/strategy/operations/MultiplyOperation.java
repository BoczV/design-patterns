package com.codecool.strategy.operations;

public class MultiplyOperation implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
