package patterns.Builder;

public class Main {
    public static void main(String[] args) {
        CarsBuilder carsBuilder = new CarsBuilder();

        Cars kia = carsBuilder
                .setBrand("Kia")
                .setModel("Rio")
                .setEngineSize(1.8)
                .setMaxSpeed(220)
                .setTrunkSize(120)
                .build();

        Cars toyota = carsBuilder
                .setBrand("Toyota")
                .setBrand("Land Cruizer")
                .setEngineSize(4.0)
                .setMaxSpeed(180)
                .setTrunkSize(340)
                .build();

        carsBuilder.setMaxSpeed(220).build();
    }
}
