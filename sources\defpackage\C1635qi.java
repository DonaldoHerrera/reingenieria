package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: qi reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1635qi implements FilenameFilter {
    C1635qi() {
    }

    public boolean accept(File file, String str) {
        return str.length() == 39 && str.endsWith(".cls");
    }
}
