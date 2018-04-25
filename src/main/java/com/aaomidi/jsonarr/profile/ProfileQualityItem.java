package com.aaomidi.jsonarr.profile;

import com.aaomidi.jsonarr.quality.Quality;
import lombok.Data;

@Data
public class ProfileQualityItem {

    private final Quality quality;
    private final boolean allowed;

}
