package com.aaomidi.jsonarr.history;

public enum HistoryEventType {

    UNKNOWN(0),
    GRABBED(1),
    SERIESFOLDERIMPORTED(2),
    DOWNLOADFOLDERIMPORTED(3),
    DOWNLOADFAILED(4),
    EPISODEFILEDELETED(5),
    EPISODEFILERENAMED(6);

    private final int id;

    HistoryEventType(int id) {
        this.id = id;
    }

}
