package org.miritis.googleguiceintro;

import com.google.inject.AbstractModule;

import org.miritis.googleguiceintro.annotations.ColourValue;
import org.miritis.googleguiceintro.annotations.EdgeValue;
import org.miritis.googleguiceintro.requests.SquareRequest;

public class AppModule extends AbstractModule {
    
    @Override
    public void configure()
    {
        bind(DrawShape.class).to(DrawSquare.class);
        bind( String.class ).annotatedWith(ColourValue.class).toInstance("Red");;
        bind( Integer.class ).annotatedWith(EdgeValue.class).toInstance(25);;
    }
}