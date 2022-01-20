package com.company.solid.abstractfactory.landvehicles;

public class Motorcycle implements ILandVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Fazendo a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a encomenda, estamos prontos");
    }
}
