package com.company.solid.abstractfactory.landvehicles;

public class Car implements ILandVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto carro");
    }

    @Override
    public void getCargo() {
        System.out.println("pegamos os passageiros, estamos prontos");
    }
}
