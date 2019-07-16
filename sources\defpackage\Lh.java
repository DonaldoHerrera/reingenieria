package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: Lh reason: default package */
/* compiled from: ClsFileOutputStream */
class Lh implements FilenameFilter {
    Lh() {
    }

    public boolean accept(File file, String str) {
        return str.endsWith(".cls_temp");
    }
}
