package defpackage;

import java.util.NoSuchElementException;

/* renamed from: mpa reason: default package and case insensitive filesystem */
/* compiled from: DataSourceProvider.kt */
final class C6938mpa<T, R> implements C7118pQa<Throwable, MPa<? extends C3863rda>> {
    final /* synthetic */ C7076opa a;

    C6938mpa(C7076opa opa) {
        this.a = opa;
    }

    /* renamed from: a */
    public final MPa<? extends C3863rda> apply(Throwable th) {
        C7471uYa.b(th, "t");
        if (th instanceof NoSuchElementException) {
            return IPa.b((Throwable) new b(this.a.b));
        }
        return IPa.b(th);
    }
}
