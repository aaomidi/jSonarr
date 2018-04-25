package com.aaomidi.jsonarr.mediacover;

public enum MediaCoverType {

    UNKNOWN(0),
    POSTER(1),
    BANNER(2),
    FANART(3),
    SCREENSHOT(4),
    HEADSHOT(5);

    private final int id;

    MediaCoverType(int id) {
        this.id = id;
    }

}
