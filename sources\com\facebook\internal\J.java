package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: FileLruCache */
class J implements FilenameFilter {
    J() {
    }

    public boolean accept(File file, String str) {
        return str.startsWith("buffer");
    }
}
