package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: si reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1694si implements Comparator<File> {
    C1694si() {
    }

    /* renamed from: a */
    public int compare(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }
}
