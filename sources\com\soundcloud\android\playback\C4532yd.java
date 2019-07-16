package com.soundcloud.android.playback;

import com.soundcloud.android.playback.Id.a;

/* renamed from: com.soundcloud.android.playback.yd reason: case insensitive filesystem */
/* compiled from: StreamSelector.kt */
final class C4532yd<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C4527xd a;
    final /* synthetic */ String b;

    C4532yd(C4527xd xdVar, String str) {
        this.a = xdVar;
        this.b = str;
    }

    /* renamed from: a */
    public final a apply(C6762kDa kda) {
        C7471uYa.b(kda, "it");
        C4308fd fdVar = new C4308fd(this.b, "file", kda.b(), kda.c(), this.a.a(kda));
        return new a(fdVar);
    }
}
