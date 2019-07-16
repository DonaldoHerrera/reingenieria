package defpackage;

/* renamed from: epa reason: default package and case insensitive filesystem */
/* compiled from: DataSourceProvider.kt */
final class C6394epa<T, R> implements C7118pQa<Throwable, MPa<? extends C4928GKa<Exception>>> {
    public static final C6394epa a = new C6394epa();

    C6394epa() {
    }

    /* renamed from: a */
    public final MPa<? extends C4928GKa<Exception>> apply(Throwable th) {
        C7471uYa.b(th, "it");
        if (!C6972nIa.d(th)) {
            return IPa.b(th);
        }
        if (th instanceof Exception) {
            return IPa.a(C4928GKa.c(th));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(th);
        sb.append(" not of type ");
        sb.append(Exception.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }
}
