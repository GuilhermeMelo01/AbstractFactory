package com.company.solid.abstractfactory.factories;

import com.company.solid.abstractfactory.aircraftsvehicles.Helicopter;
import com.company.solid.abstractfactory.aircraftsvehicles.IAircraft;
import com.company.solid.abstractfactory.landvehicles.ILandVehicle;
import com.company.solid.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
