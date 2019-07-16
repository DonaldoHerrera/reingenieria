package defpackage;

import java.util.concurrent.Callable;

/* renamed from: Kra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistOperations.kt */
final class C5065Kra<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C5157Nra a;

    C5065Kra(C5157Nra nra) {
        this.a = nra;
    }

    /* renamed from: a */
    public final IPa<C3508cda> apply(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        C5157Nra nra = this.a;
        return nra.e ? nra.a.h.b(cda).b((Callable<? extends T>) new C5034Jra<Object>(cda)) : IPa.a(cda);
    }
}
