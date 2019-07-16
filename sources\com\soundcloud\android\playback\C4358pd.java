package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.pd reason: case insensitive filesystem */
/* compiled from: Observables.kt */
public final class C4358pd<T1, T2, T3, R> implements C6844lQa<T1, T2, T3, R> {
    public final R a(T1 t1, T2 t2, T3 t3) {
        C4519wc wcVar = (C4519wc) t3;
        C6902mGa mga = (C6902mGa) t2;
        C4431ub ubVar = (C4431ub) t1;
        C7471uYa.a((Object) ubVar, "playStateEvent");
        C7471uYa.a((Object) wcVar, "playbackProgress");
        C7471uYa.a((Object) mga, "connectionType");
        return new b(ubVar, wcVar, mga);
    }
}
