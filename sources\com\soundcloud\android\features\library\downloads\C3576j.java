package com.soundcloud.android.features.library.downloads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.soundcloud.android.features.library.downloads.j reason: case insensitive filesystem */
/* compiled from: DownloadsDataSource.kt */
final class C3576j<T, R> implements C7118pQa<T, R> {
    public static final C3576j a = new C3576j();

    C3576j() {
    }

    /* renamed from: a */
    public final List<s> apply(List<? extends s> list) {
        C7471uYa.b(list, "it");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((s) next).a() != C3823mda.NOT_OFFLINE) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
