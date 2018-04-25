package com.aaomidi.jsonarr.series;

public enum SeriesType {

    STANDARD(0),
    DAILY(1),
    ANIME(2);

    private final int id;

    SeriesStatusType(int id) {
        this.id = id;
    }

}
