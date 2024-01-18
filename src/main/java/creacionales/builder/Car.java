package creacionales.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    private  CarType carType; // establecer tipo de carro
    private  Integer seats; // establecer numero de asientos
    private  Integer bigWheels; // establecer ruedas grandes
    private  Engine  engine; // establecer motor
    private  Boolean leatherSeats; // establecer asientos de cuero
    private  Integer batteries; // establecer baterias
    private  Boolean convertible; // establecer convertible
    private  Boolean electricCar; // establecer carro electrico

    public Car(CarType carType, Integer seats, Integer bigWheels,
               Engine engine, Boolean leatherSeats, Integer batteries, Boolean convertible,
               Boolean electricCar) {
        this.carType = carType;
        this.seats = seats;
        this.bigWheels = bigWheels;
        this.engine = engine;
        this.leatherSeats = leatherSeats;
        this.batteries = batteries;
        this.convertible = convertible;
        this.electricCar = electricCar;
    }
}