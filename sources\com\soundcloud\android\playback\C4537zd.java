package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.zd reason: case insensitive filesystem */
/* compiled from: StreamSelector.kt */
final class C4537zd<T> implements C6776kQa<String> {
    final /* synthetic */ C3509cea a;

    C4537zd(C3509cea cea) {
        this.a = cea;
    }

    /* renamed from: a */
    public final void accept(String str) {
        b a2 = SDb.a("StreamSelector");
        StringBuilder sb = new StringBuilder();
        sb.append("Payload for ");
        sb.append(this.a.y());
        sb.append(" [blocked=");
        sb.append(this.a.a());
        sb.append("]: ");
        sb.append(str);
        a2.d(sb.toString(), new Object[0]);
    }
}
