package patterns.Builder;

public class Cars {
    String brand;
    String model;
    int max_speed;
    double engine_size;
    int trunk_size;

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", max_speed=" + max_speed +
                ", engine_size=" + engine_size +
                ", trunk_size=" + trunk_size +
                '}';
    }
}
