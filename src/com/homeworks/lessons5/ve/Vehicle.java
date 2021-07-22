package com.homeworks.lessons5.ve;
/*Hастоятельно рекомендуется использовать интерфейсы, абстрактные классы и наследования и абстрактные методы.
        Также необходимы исключения.
        Транспортные средства. Есть разные виды транспорта - легковые, грузовые, автобусы.
        Машины тоже могут быть разного вида - внедорожник, гоночный автомобиль, компактный автомобиль.
        Автомобиль работает на некотором топливе - бензине, дизеле, электричестве.
        Можно заправить машину топливом. При неправильном использовании топлива машина должна сломаться. (исключение)
        Все автомобили могут выполнять определенные действия: например, ускоряться или тормозить.
        У каждого автомобиля есть колеса. Но у грузовиков и автобусов больше колес, чем у автомобилей.
        Должна быть возможность запрашивать количество колес у автомобиля.
        P.S. БОНУС - за реализацию подключаемого гибридного автомобиля: работает на бензине.
        Но также может заряжаться электричеством.*/
public abstract class Vehicle {
    private final String name;
    private final int number;//rename
    private Color color;//enum
    private String fuel;

    public Vehicle(String nameCar, int numberCar, Color color) {
        this.name = nameCar;
        this.number = numberCar;
    }

    public String getFuel() {
        return fuel;
    }

    public String getNameCar() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return getColor();
    }

    public void fuelForVehicle(){

    }
}
