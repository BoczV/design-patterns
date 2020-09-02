package com.codecool.state;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("Player is in " + toString());
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
