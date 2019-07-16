package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: sNa reason: default package and case insensitive filesystem */
/* compiled from: CommonUtils */
class C7322sNa implements Comparator<File> {
    C7322sNa() {
    }

    /* renamed from: a */
    public int compare(File file, File file2) {
        return (int) (file.lastModified() - file2.lastModified());
    }
}
