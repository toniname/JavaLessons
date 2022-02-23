package com.homeworks.lessons8.table;

import java.time.Month;
import java.util.Map;

public class Table {

    private Map<String, Map<Month, Float>> map;

    public Table() {
        map = Map.of(
                "Item1", Map.of(Month.MAY, 12.45f),
                "Item1", Map.of(Month.MAY, 12.45f),
                "Item1", Map.of(Month.MAY, 12.45f)
        );
    }

    
}
