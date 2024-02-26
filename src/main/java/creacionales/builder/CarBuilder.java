package creacionales.builder;


public class CarBuilder implements Builder {

    private  Integer seats; // numero de asientos
    private  CarType carType; // tipo de carro
    private  Integer bigWheels; // ruedas grandes
    private  Engine  engine; // motor
    private  Boolean leatherSeats; // asientos de cuero
    private  Integer batteries; // baterias
    private  Boolean convertible; // convertible
    private  Boolean electricCar; // carro electrico

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setWheels(int wheels) {
        this.bigWheels = wheels;
    }

    @Override
    public void setLeatherSeats(Boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
    }

    @Override
    public void setBatteries(int batteries) {
        this.batteries = batteries;
    }

    @Override
    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public void setElectricCar(Boolean electricCar) {
        this.electricCar = electricCar;
    }

    public Car getCar() {
        return new Car(carType, seats, bigWheels, engine, leatherSeats, bigWheels, convertible, electricCar);
    }

}