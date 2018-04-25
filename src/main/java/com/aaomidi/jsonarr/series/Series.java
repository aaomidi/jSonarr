package com.aaomidi.jsonarr.series;

import com.aaomidi.jsonarr.mediacover.MediaCover;
import com.aaomidi.jsonarr.season.Season;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Series {

    private final String title;
    private final List<AlternateTitle> alternateTitles;
    private final String sortTitle;

    private final int seasonCount;
    private final int totalEpisodeCount;
    private final int episodeCount;
    private final int episodeFileCount;
    private final long sizeOnDisk;
    private final SeriesStatusType status;
    private final String overview;
    private final Date nextAiring;
    private final Date previousAiring;
    private final String network;
    private final String airTime;
    private final List<MediaCover> images;

    private final String remotePoster;
    private final List<Season> seasons;
    private final int year;

    private final String path;
    private final int profileId;

    private final boolean seasonFolder;
    private final boolean monitored;

    private final boolean useSceneNumbering;
    private final int runtime;
    private final int tvdbId;
    private final int tvRageId;
    private final int tvMazeId;
    private final Date firstAired;
    private final Date lastInfoSync;
    private final SeriesType seriesType;
    private final String cleanTitle;
    private final String imdbId;
    private final String titleSlug;
    private final String rootFolderPath;
    private final String certification;
    private final List<String> genres;
    private final HashSet<Integer> tags;
    private final Date added;
    private final AddSeriesOptions addOptions;
    private final Ratings ratings;

    private final int qualityProfileId;

}
