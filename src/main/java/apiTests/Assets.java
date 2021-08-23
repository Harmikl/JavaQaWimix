package apiTests;

import lombok.AllArgsConstructor;
import lombok.Getter;
//
//@Getter
//@AllArgsConstructor
public enum Assets {

    ADAUSD(5);

    public int getAssetType() {
        return assetType;
    }

    private final int assetType;

    Assets(int assetType) {
        this.assetType = assetType;
    }
}