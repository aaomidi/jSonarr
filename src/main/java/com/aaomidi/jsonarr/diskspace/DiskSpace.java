package com.aaomidi.jsonarr.diskspace;

import lombok.Data;

@Data
public class DiskSpace {

    private final String path;
    private final String label;
    private final long freeSpace;
    private final long totalSpace;

}
