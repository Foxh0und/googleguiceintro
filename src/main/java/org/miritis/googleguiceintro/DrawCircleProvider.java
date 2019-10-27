package org.miritis.googleguiceintro;

import com.google.inject.Provider;

public class DrawCircleProvider implements Provider<DrawSquare> {

    @Override
    public DrawSquare get() {
        return new DrawSquare( "Magenta", 999);
    }

}
