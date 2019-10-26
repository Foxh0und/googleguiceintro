package org.miritis.googleguiceintro;

import com.google.inject.Inject;

import org.miritis.googleguiceintro.annotations.ColourValue;
import org.miritis.googleguiceintro.annotations.EdgeValue;

public class DrawSquare implements DrawShape {

    private String fColour;
    private Integer fEdge;

    @Inject
    public DrawSquare( @ColourValue String aColour, @EdgeValue Integer aEdge )
    {
        super();
        fColour = aColour;
        fEdge = aEdge;

    }

    @Override
    public void draw()
    {
        System.out.println("Square of colour " + fColour + "and edge count of " + fEdge );
    }
    
}