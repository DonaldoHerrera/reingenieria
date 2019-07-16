package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: ti reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1724ti implements Comparator<File> {
    C1724ti() {
    }

    /* renamed from: a */
    public int compare(File file, File file2) {
        return file.getName().compareTo(file2.getName());
    }
}
