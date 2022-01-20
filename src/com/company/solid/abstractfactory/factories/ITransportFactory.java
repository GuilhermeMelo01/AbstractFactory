package com.company.solid.abstractfactory.factories;

import com.company.solid.abstractfactory.aircraftsvehicles.IAircraft;
import com.company.solid.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
