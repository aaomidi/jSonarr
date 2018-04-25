package com.aaomidi.jsonarr.quality;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Quality {
    private final int id;
    private final String name;
    private final QualitySource qualitySource;
    private final int resolution;

}
