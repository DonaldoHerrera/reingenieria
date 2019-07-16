package defpackage;

import java.io.File;

/* renamed from: gi reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1327gi extends d {
    C1327gi(String str) {
        super(str);
    }

    public boolean accept(File file, String str) {
        return super.accept(file, str) && str.endsWith(".cls");
    }
}
