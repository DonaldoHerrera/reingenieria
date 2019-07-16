package com.soundcloud.android.player.ui.waveform;

import java.util.Set;

/* compiled from: WaveformViewController.kt */
final class j<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ k a;
    final /* synthetic */ b b;

    j(k kVar, b bVar) {
        this.a = kVar;
        this.b = bVar;
    }

    /* renamed from: a */
    public final d apply(Set<C3799jda> set) {
        C7471uYa.b(set, "it");
        b bVar = this.b;
        C7471uYa.a((Object) bVar, "waveformData");
        return new d(bVar, set, this.a.b);
    }
}
