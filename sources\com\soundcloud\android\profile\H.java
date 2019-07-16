package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import java.util.List;

/* compiled from: ProfileBucketsDataSource.kt */
final class H<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ I a;
    final /* synthetic */ SearchQuerySourceInfo b;

    H(I i, SearchQuerySourceInfo searchQuerySourceInfo) {
        this.a = i;
        this.b = searchQuerySourceInfo;
    }

    /* renamed from: a */
    public final APa<List<P>> apply(C5785g gVar) {
        C7471uYa.b(gVar, "it");
        return this.a.c.a(new G(this, gVar), this.a.a(gVar, this.b));
    }
}
