package com.codecool.strategy.operations;

public class AddOperation implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
