package org.miritis.googleguiceintro.requests;

import com.google.inject.Inject;

import org.miritis.googleguiceintro.DrawShape;
import org.miritis.googleguiceintro.annotations.Square;

public class SquareRequest {
    
    @Inject
    @Square
    DrawShape d;

    public void makeRequest()
    {
        d.draw();
    }
}