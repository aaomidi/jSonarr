package com.aaomidi.jsonarr.episodes;

import lombok.Data;

import java.util.Date;

@Data
public class EpisodeFileResource {
    private final int seriesId;
    private final int seasonNumber;
    private final String relativePath;
    private final String path;
    private final long size;
    private final Date dateAdded;
    private final String sceneName;
    // TODO Add QualityModel quality;
    private boolean qualityCutoffNotMet;
}