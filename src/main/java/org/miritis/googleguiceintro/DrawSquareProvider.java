package org.miritis.googleguiceintro;

import com.google.inject.Provider;

public class DrawSquareProvider implements Provider<DrawSquare> {

    @Override
    public DrawSquare get() {
        return new DrawSquare( "Red", 27);
    }

}
