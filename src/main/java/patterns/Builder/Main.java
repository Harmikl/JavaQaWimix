package patterns.Builder;

import enums.Brand;
import lombok.AllArgsConstructor;
import lombok.Getter;


public class Main {
    public static void main(String[] args) {
        CarsBuilder carsBuilder = new CarsBuilder();
        /**
         @see CarsBuilder#setBrand(String)
         */
        Cars kia = carsBuilder
                .setBrand(Brand.KIA.getValue())
                .setModel("Rio")
                .setEngineSize(1.8)
                .setMaxSpeed(220)
                .setTrunkSize(120)
                .build();

        Cars toyota = carsBuilder
                .setBrand(Brand.TOYOTA.getValue())
                .setModel("Land Cruizer")
                .setEngineSize(4.0)
                .setMaxSpeed(180)
                .setTrunkSize(340)
                .build();
        Cars mazda = carsBuilder
                .setBrand(Brand.MAZDA.getValue())
                .setModel("CX-7")
                .setEngineSize(1.8)
                .setMaxSpeed(240)
                .setTrunkSize(340)
                .build();
    }
}
