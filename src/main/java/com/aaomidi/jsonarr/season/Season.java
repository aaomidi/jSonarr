package com.aaomidi.jsonarr.season;

import lombok.Data;

@Data
public class Season {

    private final int seasonNumber;
    private final boolean monitored;
    private final SeasonStatistics seasonStatistics;

}
