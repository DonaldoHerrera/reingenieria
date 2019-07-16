package com.soundcloud.android.playback;

/* compiled from: DefaultPlaySessionController.kt */
final class W<T> implements C6776kQa<VPa> {
    final /* synthetic */ long a;

    W(long j) {
        this.a = j;
    }

    /* renamed from: a */
    public final void accept(VPa vPa) {
        StringBuilder sb = new StringBuilder();
        sb.append("play() requested, with position = ");
        sb.append(this.a);
        SDb.c(sb.toString(), new Object[0]);
    }
}
