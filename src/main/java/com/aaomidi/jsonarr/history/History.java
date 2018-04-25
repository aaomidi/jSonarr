package com.aaomidi.jsonarr.history;

import com.aaomidi.jsonarr.episodes.Episode;
import com.aaomidi.jsonarr.quality.QualityModel;
import com.aaomidi.jsonarr.series.Series;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class History {

    private final int episodeId;
    private final int seriesId;
    private final String sourceTitle;
    private final QualityModel quality;
    private final boolean qualityCutoffNotMet;
    private final Date date;
    private final String downloadId;

    private final HistoryEventType eventType;

    private final Map<String, String> data;

    private final Episode episode;
    private final Series series;

}
