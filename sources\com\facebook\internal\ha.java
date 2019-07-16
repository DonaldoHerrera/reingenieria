package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: Utility */
class ha implements FilenameFilter {
    ha() {
    }

    public boolean accept(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }
}
