package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;

/* renamed from: ai reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C0308ai implements FilenameFilter {
    final /* synthetic */ Set a;
    final /* synthetic */ C1874yi b;

    C0308ai(C1874yi yiVar, Set set) {
        this.b = yiVar;
        this.a = set;
    }

    public boolean accept(File file, String str) {
        if (str.length() < 35) {
            return false;
        }
        return this.a.contains(str.substring(0, 35));
    }
}
