package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.hc reason: case insensitive filesystem */
/* compiled from: PlaybackMediaProvider.kt */
final class C4317hc<T, R> implements C7118pQa<Throwable, MPa<? extends C4633ona>> {
    public static final C4317hc a = new C4317hc();

    C4317hc() {
    }

    /* renamed from: a */
    public final MPa<? extends C4633ona> apply(Throwable th) {
        C7471uYa.b(th, "error");
        if (th instanceof J) {
            return IPa.a(new a(C0136b.a));
        }
        if (th instanceof Ka) {
            return IPa.a(new a(c.a));
        }
        return IPa.b(th);
    }
}
