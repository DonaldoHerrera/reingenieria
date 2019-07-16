package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: FileLruCache */
class I implements FilenameFilter {
    I() {
    }

    public boolean accept(File file, String str) {
        return !str.startsWith("buffer");
    }
}
