package defpackage;

/* renamed from: Fpa reason: default package and case insensitive filesystem */
/* compiled from: DefaultPlaylistRepository.kt */
final class C4907Fpa<T, R> implements C7118pQa<Throwable, MPa<? extends MV>> {
    public static final C4907Fpa a = new C4907Fpa();

    C4907Fpa() {
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
