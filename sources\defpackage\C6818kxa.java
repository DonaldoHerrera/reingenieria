package defpackage;

/* renamed from: kxa reason: default package and case insensitive filesystem */
/* compiled from: ShareOperations.kt */
final class C6818kxa<T, R> implements C7118pQa<Throwable, MPa<? extends C4928GKa<String>>> {
    final /* synthetic */ IPa a;

    C6818kxa(IPa iPa) {
        this.a = iPa;
    }

    /* renamed from: a */
    public final MPa<? extends C4928GKa<String>> apply(Throwable th) {
        C7471uYa.b(th, "throwable");
        if (th instanceof Kda) {
            return this.a;
        }
        return IPa.b(th);
    }
}
