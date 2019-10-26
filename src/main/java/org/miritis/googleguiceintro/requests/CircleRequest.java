package org.miritis.googleguiceintro.requests;

import com.google.inject.Inject;

import org.miritis.googleguiceintro.DrawShape;
import org.miritis.googleguiceintro.annotations.Circle;

public class CircleRequest {
    
    @Inject
    @Circle
    DrawShape d;

    public void makeRequest()
    {
        d.draw();
    }
}