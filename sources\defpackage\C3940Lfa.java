package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: Lfa reason: default package and case insensitive filesystem */
/* compiled from: DefaultVault.kt */
final class C3940Lfa<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Qfa a;
    final /* synthetic */ Set b;

    C3940Lfa(Qfa qfa, Set set) {
        this.a = qfa;
        this.b = set;
    }

    /* renamed from: a */
    public final APa<Wfa<Key, List<Model>>> apply(C3953bga<Key, NetworkModel> bga) {
        C7471uYa.b(bga, "networkResult");
        if (bga instanceof b) {
            return this.a.c(this.b);
        }
        if (bga instanceof a) {
            APa<Wfa<Key, List<Model>>> c = APa.c(new Rfa(((a) bga).a()));
            C7471uYa.a((Object) c, "Observable.just(Failure(networkResult.exception))");
            return c;
        }
        throw new FVa();
    }
}
