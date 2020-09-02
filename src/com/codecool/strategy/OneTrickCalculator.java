package com.codecool.strategy;

import com.codecool.strategy.operations.Operation;

public class OneTrickCalculator {
    private Operation operation;


    public OneTrickCalculator(Operation operation) {
        this.operation = operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int executeOperation(int a, int b){
        return operation.doOperation(a, b);
    }
}
