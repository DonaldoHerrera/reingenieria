package com.soundcloud.android.discovery.systemplaylist;

import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.z reason: case insensitive filesystem */
/* compiled from: SystemPlaylistItemMapper.kt */
final class C3534z<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ B a;

    C3534z(B b) {
        this.a = b;
    }

    /* renamed from: a */
    public final APa<List<C6185ma>> apply(List<C3508cda> list) {
        C7471uYa.b(list, "trackUrns");
        return this.a.b.a(list);
    }
}
