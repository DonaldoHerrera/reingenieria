package defpackage;

import java.util.List;

/* renamed from: jpa reason: default package and case insensitive filesystem */
/* compiled from: DataSourceProvider.kt */
final class C6734jpa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C5662bpa a;
    final /* synthetic */ C3863rda b;

    C6734jpa(C5662bpa bpa, C3863rda rda) {
        this.a = bpa;
        this.b = rda;
    }

    /* renamed from: a */
    public final List<C3863rda> apply(List<? extends C3863rda> list) {
        C7471uYa.b(list, "it");
        return this.a.a(list, this.b);
    }
}
