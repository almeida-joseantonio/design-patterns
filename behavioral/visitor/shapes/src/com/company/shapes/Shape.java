package com.company.shapes;

import com.company.visitor.Visitor;

/*
 * The element interface declares an `accept` method that takes
 * the base visitor interface as an argument.
 */

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
