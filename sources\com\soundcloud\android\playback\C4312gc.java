package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.gc reason: case insensitive filesystem */
/* compiled from: PlaybackMediaProvider.kt */
final class C4312gc<T> implements C6776kQa<Throwable> {
    public static final C4312gc a = new C4312gc();

    C4312gc() {
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        b a2 = SDb.a("PlaybackMediaProvider");
        StringBuilder sb = new StringBuilder();
        sb.append("Not playing track: ");
        sb.append(th.getMessage());
        a2.a(th, sb.toString(), new Object[0]);
    }
}
