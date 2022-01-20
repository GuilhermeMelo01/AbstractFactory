package com.company.solid.abstractfactory;

import com.company.solid.abstractfactory.app.Application;
import com.company.solid.abstractfactory.factories.ITransportFactory;
import com.company.solid.abstractfactory.factories.NineNineTransport;
import com.company.solid.abstractfactory.factories.UberTransport;

import java.lang.reflect.AccessibleObject;

public class Main {

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        String company = "uber";

        if (company == "uber"){
            factory = new UberTransport();
        } else{
            factory = new NineNineTransport();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
            Application app = configureApplication();
            app.startRoute();


    }
}
