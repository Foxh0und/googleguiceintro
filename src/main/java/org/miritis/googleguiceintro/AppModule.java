package org.miritis.googleguiceintro;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import org.miritis.googleguiceintro.annotations.Circle;
import org.miritis.googleguiceintro.annotations.Square;


public class AppModule extends AbstractModule {
    
    @Override
    public void configure()
    {
       // bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
       // bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);
    }

    @Provides
    @Square
    public DrawShape provideDrawSquare()
    {
        DrawShape lResult = new DrawSquare("Red", 25);
        return lResult;
    }

    @Provides
    @Circle
    public DrawShape providesDrawCircle()
    {
        DrawShape lResult = new DrawCircle("Blue", 16);
        return lResult;
    }
}