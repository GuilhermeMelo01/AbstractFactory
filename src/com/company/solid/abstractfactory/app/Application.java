package com.company.solid.abstractfactory.app;

import com.company.solid.abstractfactory.aircraftsvehicles.IAircraft;
import com.company.solid.abstractfactory.factories.ITransportFactory;
import com.company.solid.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
