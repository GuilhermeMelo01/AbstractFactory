package com.company.solid.abstractfactory.aircraftsvehicles;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("pegamos os passageiros, ligando elices");
    }

    @Override
    public void wind() {
        System.out.println("ventos a 20km sudeste");
    }
}
