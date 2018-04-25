package com.aaomidi.jsonarr.series;

public enum SeriesType {

    STANDARD(0),
    DAILY(1),
    ANIME(2);

    private final int id;

    SeriesType(int id) {
        this.id = id;
    }

}
