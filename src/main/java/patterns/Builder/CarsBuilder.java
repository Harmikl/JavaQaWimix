package patterns.Builder;

public class CarsBuilder {
    private final Cars cars;

    public CarsBuilder() {
        this.cars = new Cars();
    }

    public CarsBuilder setBrand(String brand){
        this.cars.brand = brand;
        return this;
    }

    public CarsBuilder setModel(String model){
        this.cars.model = model;
        return this;
    }

    public CarsBuilder setMaxSpeed(int maxSpeed){
        this.cars.max_speed = maxSpeed;
        return this;
    }

    public CarsBuilder setEngineSize(double engineSize){
        this.cars.engine_size = engineSize;
        return this;
    }

    public CarsBuilder setTrunkSize(int trunkSize){
        this.cars.trunk_size = trunkSize;
        return this;
    }

    public Cars build(){
        System.out.println(cars);
        return cars;
    }

}
