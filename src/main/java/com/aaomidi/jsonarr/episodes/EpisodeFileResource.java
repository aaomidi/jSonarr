package com.aaomidi.jsonarr.episodes;

import com.aaomidi.jsonarr.quality.QualityModel;
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
    private final QualityModel quality;
    private boolean qualityCutoffNotMet;
}
