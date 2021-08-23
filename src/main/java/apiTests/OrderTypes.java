package apiTests;

import lombok.AllArgsConstructor;
import lombok.Getter;

//@Getter
//@AllArgsConstructor
public enum OrderTypes {

    OPEN(0),
    CLOSED(1);

    private final int type;

    public int getType() {
        return type;
    }

    OrderTypes(int type) {
        this.type = type;
    }
}