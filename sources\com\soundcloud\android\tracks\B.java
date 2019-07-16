package com.soundcloud.android.tracks;

/* compiled from: DefaultTrackRepository.kt */
final class B<T, R> implements C7118pQa<Throwable, MPa<? extends MV>> {
    public static final B a = new B();

    B() {
    }

    /* renamed from: a */
    public final MPa<? extends MV> apply(Throwable th) {
        C7471uYa.b(th, "it");
        if (C6972nIa.f(th)) {
            return IPa.a(new a(new Jda((Exception) th)));
        }
        if (th instanceof ifa) {
            return IPa.a(new a(new Oda((Exception) th)));
        }
        return IPa.b(th);
    }
}
