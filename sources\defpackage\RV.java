package defpackage;

/* renamed from: RV reason: default package */
/* compiled from: NetworkFetcherExtensions.kt */
final class RV<T, R> implements C7118pQa<Throwable, MPa<? extends C3953bga<Key, Model>>> {
    public static final RV a = new RV();

    RV() {
    }

    /* renamed from: a */
    public final MPa<? extends C3953bga<Key, Model>> apply(Throwable th) {
        C4538dga dga;
        C7471uYa.b(th, "it");
        if (!(th instanceof ifa)) {
            return IPa.b(th);
        }
        if (((ifa) th).c()) {
            dga = new a((Exception) th);
        } else {
            dga = new b((Exception) th);
        }
        return IPa.a(new a(dga));
    }
}
