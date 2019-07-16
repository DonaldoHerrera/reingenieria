package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.collections.data.C2862s;
import java.util.List;

/* renamed from: com.soundcloud.android.features.library.downloads.d reason: case insensitive filesystem */
/* compiled from: DownloadsDataSource.kt */
final class C3570d<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C3577k a;

    C3570d(C3577k kVar) {
        this.a = kVar;
    }

    /* renamed from: a */
    public final APa<List<C2862s>> apply(Boolean bool) {
        C7471uYa.b(bool, "isSynced");
        if (bool.booleanValue()) {
            return this.a.a.b().b(this.a.e);
        }
        return APa.c(C6918mWa.a());
    }
}
