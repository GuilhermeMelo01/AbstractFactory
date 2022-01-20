package com.company.solid.abstractfactory.aircraftsvehicles;

public class Airplane implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniando subida para o destino");
    }

    @Override
    public void getCargo() {
        System.out.println("passageiros a bordo, tudo pronto");
    }

    @Override
    public void wind() {
        System.out.println("ventos a 25km");
    }
}
