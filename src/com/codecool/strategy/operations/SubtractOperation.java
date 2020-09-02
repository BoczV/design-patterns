package com.codecool.strategy.operations;

public class SubtractOperation implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
