package com.source.it.lecture5.examples.stack;

import java.util.Arrays;

public class Stack {
    private static final int DEFAULT_STACK_SIZE          = 10;// ToDo: HomeWork - implement auto resize of inner array
    private static final int DEFAULT_CAPACITY_MULTIPLIER = 2; // ToDo: you should use this variable to increase/decrease
                                                              // ToDo: holder size in push() & pop() methods.
    private int[] holder;
    private int currentPosition = -1;

    public Stack(int size) {
        this.holder = new int[size];
    }

    public Stack() {
        this.holder = new int[DEFAULT_STACK_SIZE];
    }

    public int pop() {
        if (currentPosition < 0) {
            System.err.println("No elements in stack, returning Integer.MIN_VALUE");
            return Integer.MIN_VALUE;
        }
        if (currentPosition == Math.round(holder.length * 0.2)) {
            int[] copyHolder = new int[currentPosition + 1];
            System.arraycopy(holder, 0, copyHolder, 0, currentPosition + 1);
            this.holder = new int[holder.length / DEFAULT_CAPACITY_MULTIPLIER];
            System.arraycopy(copyHolder, 0, holder, 0, currentPosition + 1);
        }
        return holder[currentPosition--];
    }

    public void push(int element) {
        if (currentPosition == Math.round(holder.length * 0.4)) {
            int[] copyHolder = new int[currentPosition + 1];
            System.arraycopy(holder, 0, copyHolder, 0, currentPosition + 1);
            this.holder = new int[holder.length * DEFAULT_CAPACITY_MULTIPLIER];
            System.arraycopy(copyHolder, 0, holder, 0, currentPosition + 1);
        }
        holder[++currentPosition] = element;
    }

    public int peek() {
        if (currentPosition < 0) {
            return Integer.MIN_VALUE;
        }
        return holder[currentPosition];
    }

    public void print() {
        if (currentPosition < 0) {
            return;
        }
        int[] realStack = new int[currentPosition + 1];
        System.arraycopy(holder, 0, realStack, 0, currentPosition + 1);
        System.out.println(Arrays.toString(realStack));
    }
}
