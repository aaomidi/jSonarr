package com.aaomidi.jsonarr.season;

import lombok.Data;

import java.util.Date;

@Data
public class SeasonStatistics {

    private final Date nextAiring;
    private final Date previousAiring;
    private final int episodeFileCount;
    private final int episodeCount;
    private final int totalEpisodeCount;
    private final long sizeOnDisk;

    private final double percentOfEpisodes;

}
