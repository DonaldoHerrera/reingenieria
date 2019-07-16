package com.crashlytics.android.ndk;

import java.io.File;
import java.util.Comparator;

/* compiled from: NdkCrashFilesManager */
class f implements Comparator<File> {
    f() {
    }

    /* renamed from: a */
    public int compare(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }
}
