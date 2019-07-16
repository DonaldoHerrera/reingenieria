package com.soundcloud.android.discovery.systemplaylist;

import com.soundcloud.android.tracks.C6185ma;
import java.util.Collection;
import java.util.List;

/* compiled from: SystemPlaylistItemMapper.kt */
final class A<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ B a;
    final /* synthetic */ C3520k b;

    A(B b2, C3520k kVar) {
        this.a = b2;
        this.b = kVar;
    }

    /* renamed from: a */
    public final ba apply(List<? extends C6185ma> list) {
        C7471uYa.b(list, "trackItems");
        return new ba(C7676xWa.c((Collection) C6850lWa.a(this.a.a(this.b, list)), (Iterable) this.a.b(this.b, list)));
    }
}
