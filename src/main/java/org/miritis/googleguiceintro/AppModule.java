package org.miritis.googleguiceintro;

import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
    
    @Override
    public void configure()
    {
        bind(DrawShape.class).to(DrawSquare.class);
    }
}