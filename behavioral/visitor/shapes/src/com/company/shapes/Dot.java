package com.company.shapes;

import com.company.visitor.Visitor;

/*
 * Each concrete element class must implement the `accept`
 * method in such a way that it calls the visitor's method that
 * corresponds to the element's class.
 */

public class Dot implements Shape{
    private int id;
    private int x;
    private int y;

    public Dot() {}

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        //Do something
    }

    @Override
    public void draw() {
        //Do something
    }

    /*
     * Note that we're calling `visitDot`, which matches the
     * current class name. This way we let the visitor know the
     * class of the element it works with.
     */
    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
