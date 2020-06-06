package logic;

import logic.model.WineType;

import java.util.ArrayList;
import java.util.List;

public class WineService {

    public List getAvailableBrands(WineType type){
        List<String> brands = new ArrayList<String>();

        switch (type){
            case RED:
                brands.add("B&G");
                brands.add("Betaneli");
                break;
            case WHITE:
                brands.add("Aetos");
                brands.add("Barista");
                break;
            case CHAMPAGNE:
                brands.add("Sovetskoe");
                brands.add("Don Perinyon");
                brands.add("Moit and Shandon");
                break;
            default:
                brands.add("Not found");
        }
        return brands;
    }

}
