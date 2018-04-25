package com.aaomidi.jsonarr;

import com.aaomidi.jsonarr.episodes.Episode;
import lombok.Data;

import java.util.List;

@Data
public class Calendar {

    List<Episode> episodes;

}
