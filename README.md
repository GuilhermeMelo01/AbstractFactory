# AbstractFactory (Design Pattern)
***
#### Aqui temos um projeto de abstract factory, que é um padrao de projeto com programaçao orientada a interface.

1. temos o package landvehicles que vai ter meus veiculos terrestres.
   - Temos a interface ILandVehicle que vai cria os metodos startRoute() e getCargo() que vou implementar nas minhas classes **Car** e **Motorcycle**
      - *startRoute()* > vai da inicio a minha rota.
      - *getCargo()* > vai ser responsavel para ver se meu vehicle esta com a carga.
      
2. temos o package aircraftvehicle que vai ter meus veiculos aereos.
   - Temos a interface IAircraft que vai cria os metodos startRoute(), getCargo() e wind() que vou implementar nas minhas classes **Airplane** e **Helicopter**
      - __*temos os mesmos metodos startRoute() e getCargo(), so que agora temos mais uma adição.*__
      - *wind()* > que vai verificar a velocidade dos ventos
   



