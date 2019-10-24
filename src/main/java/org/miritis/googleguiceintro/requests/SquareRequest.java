package org.miritis.googleguiceintro.requests;

import com.google.inject.Inject;

import org.miritis.googleguiceintro.DrawShape;

public class SquareRequest {
    DrawShape d;

    @Inject
    public SquareRequest( DrawShape aShape )
    {
        d = aShape;
    }

    public void makeRequest()
    {
        d.draw();
    }
}