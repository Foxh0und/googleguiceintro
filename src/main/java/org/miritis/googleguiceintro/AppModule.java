package org.miritis.googleguiceintro;

import com.google.inject.AbstractModule;

import org.miritis.googleguiceintro.annotations.Circle;
import org.miritis.googleguiceintro.annotations.Square;



public class AppModule extends AbstractModule {
    
    @Override
    public void configure()
    {
       bind(DrawShape.class).annotatedWith(Square.class).toProvider(DrawSquareProvider.class);
       bind(DrawShape.class).annotatedWith(Circle.class).toProvider(DrawCircleProvider.class);

    }
};