package com.company.solid.abstractfactory.factories;

import com.company.solid.abstractfactory.aircraftsvehicles.Airplane;
import com.company.solid.abstractfactory.aircraftsvehicles.IAircraft;
import com.company.solid.abstractfactory.landvehicles.Car;
import com.company.solid.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
