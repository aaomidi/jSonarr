package com.aaomidi.jsonarr.profile;

import com.aaomidi.jsonarr.quality.Quality;
import lombok.Data;

import java.util.List;

@Data
public class Profile {

    private final String name;
    private final Quality cutoff;
    private final List<ProfileQualityItem> items;
    private final Language language;

}
