package org.miritis.googleguiceintro;


public class DrawCircle implements DrawShape {

    private String fColour;
    private Integer fEdge;

    
    public DrawCircle( String aColour, Integer aEdge )
    {
        fColour = aColour;
        fEdge = aEdge;
    }
    @Override
    public void draw()
    {
        System.out.println( "Circle of colour" + fColour + "edge count of " + fEdge );
    }
    
}