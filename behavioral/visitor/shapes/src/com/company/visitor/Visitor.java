package com.company.visitor;

import com.company.shapes.*;

/*
 * The Visitor interface declares a set of visiting methods that
 * correspond to element classes. The signature of a visiting
 * method lets the visitor identify the exact class of the
 * element that it's dealing with.
 */

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape compoundShape);

    String export(Shape... args);
}
