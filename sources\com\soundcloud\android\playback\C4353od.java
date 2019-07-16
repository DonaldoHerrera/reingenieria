package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.od reason: case insensitive filesystem */
/* compiled from: StreamPreloader.kt */
final class C4353od<T> implements C7256rQa<C3509cea> {
    final /* synthetic */ C4515vd a;

    C4353od(C4515vd vdVar) {
        this.a = vdVar;
    }

    /* renamed from: a */
    public final boolean test(C3509cea cea) {
        C7471uYa.b(cea, "nextTrack");
        return !this.a.a.j.a(cea.y());
    }
}
