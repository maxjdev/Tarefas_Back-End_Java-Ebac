# Resumo da estrutura do exercício

## Classes

- **Bike**
    - Atributos: color (String), fuelSource (Integer)
    - Métodos: start(), fuel(Integer fuelSource)

- **Factory**
    - Métodos: create(String requested), completeTank(Bike bike), retrieveBike(String requested)

- **OffRoad**
    - Herança: Factory
    - Métodos: retrieveBike(String requested)

- **Sport**
    - Herança: Factory
    - Métodos: retrieveBike(String requested)

- **R1250gs**
    - Herança: Bike
    - Construtor: R1250gs(String color)

- **S1000rr**
    - Herança: Bike
    - Construtor: S1000rr(String color)

- **Client**
    - Atributos: requested (String)
    - Métodos: getInstance(String requested), getRequested()

- **App**
    - Método: main(String[] args), sportOrOffRoad(Client client)

## Relacionamentos

- **Bike** possui uma relação com **Factory** (agregação/composição)
- **Factory** possui uma relação com **OffRoad** e **Sport** (agregação/composição)
- **OffRoad** e **Sport** possuem uma relação com **Bike** (agregação/composição)
- **R1250gs** e **S1000rr** possuem uma relação com **Bike** (herança)
- **Client** possui uma relação com **Factory** (agregação/composição)
- **App** possui uma relação com **Client** e **Factory** (agregação/composição)

