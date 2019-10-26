package org.miritis.googleguiceintro;


public class DrawSquare implements DrawShape {

    private String fColour;
    private Integer fEdge;

    
    public DrawSquare( String aColour, Integer aEdge )
    {
        fColour = aColour;
        fEdge = aEdge;
    }
    @Override
    public void draw()
    {
        System.out.println( "Square of colour" + fColour + "edge count of " + fEdge );
    }
    
}