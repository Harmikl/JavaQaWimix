package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Brand {
    KIA("Kia"),
    TOYOTA("Toyota"),
    MAZDA("Mazda");

    private final String value;

//    public String getValue() {
//        return value;
//    }
//
//    Brand(String value) {
//        this.value = value;
//    }
}
