package org.miritis.googleguiceintro;

import com.google.inject.Guice;
import com.google.inject.Injector;

import org.miritis.googleguiceintro.requests.SquareRequest;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Injector lInjector = Guice.createInjector( new AppModule() );
        SquareRequest lRequest = lInjector.getInstance( SquareRequest.class );
        lRequest.makeRequest();
    }
}
