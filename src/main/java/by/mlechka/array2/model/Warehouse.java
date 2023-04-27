package by.mlechka.array2.model;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Warehouse {

    private static Warehouse instance;

    private Map<UUID, ArrayStatistics> mapWithArrayCharacteristics = new HashMap<>();

    public Warehouse() {
    }

    public static Warehouse getInstance() {

        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public ArrayStatistics put(UUID key, ArrayStatistics value) {
        return mapWithArrayCharacteristics.put(key, value);
    }

    public ArrayStatistics remove(UUID key) {
        return mapWithArrayCharacteristics.remove(key);
    }

    public ArrayStatistics replace(UUID key, ArrayStatistics value) {
        return mapWithArrayCharacteristics.replace(key, value);
    }
}
