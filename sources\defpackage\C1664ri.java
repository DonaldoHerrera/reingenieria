package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: ri reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1664ri implements FileFilter {
    C1664ri() {
    }

    public boolean accept(File file) {
        return file.isDirectory() && file.getName().length() == 35;
    }
}
