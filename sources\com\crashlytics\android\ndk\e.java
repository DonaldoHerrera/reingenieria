package com.crashlytics.android.ndk;

import java.io.File;
import java.io.FileFilter;

/* compiled from: NdkCrashFilesManager */
class e implements FileFilter {
    e() {
    }

    public boolean accept(File file) {
        return file.isDirectory();
    }
}
