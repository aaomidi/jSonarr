package com.aaomidi.jsonarr.episodes;

import com.aaomidi.jsonarr.series.Series;
import lombok.Data;

import java.util.Date;

@Data
public class Episode {
    private final int seriesId;
    private final int episodeFileId;
    private final int seasonId;
    private final int episodeNumber;
    private final String title;
    private final String airDate;
    private final Date airDateUTC;
    private final String overview;
    private final EpisodeFileResource episodeFile;

    private final boolean hasFile;
    private final boolean monitored;
    private final int absoluteEpisodeNumber;
    private final int sceneAbsoluteEpisodeNumber;
    private final int sceneEpisodeNumber;
    private final int sceneSeasonNumber;
    private final boolean unverifiedSceneNumbering;
    private final String seriesTitle;
    private final Series series;
    private final boolean grabbed;


}
