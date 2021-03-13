package com.company;

import com.company.shapes.*;

import com.company.visitor.Visitor;
import com.company.visitor.XMLExportVisitor;

/*
 * The client code can run visitor operations over any set of
 * elements without figuring out their concrete classes. The
 * accept operation directs a call to the appropriate operation
 * in the visitor object.
 */

public class Main {

    public static void main(String[] args) {
	    Dot dot = new Dot(1, 10, 55);
	    Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        Visitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}