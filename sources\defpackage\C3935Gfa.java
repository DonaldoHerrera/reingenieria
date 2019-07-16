package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: Gfa reason: default package and case insensitive filesystem */
/* compiled from: DefaultVault.kt */
final class C3935Gfa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Qfa a;
    final /* synthetic */ Set b;

    C3935Gfa(Qfa qfa, Set set) {
        this.a = qfa;
        this.b = set;
    }

    /* renamed from: a */
    public final Wfa<Key, List<Model>> apply(List<? extends Model> list) {
        C7471uYa.b(list, "it");
        return this.a.a(list, this.b);
    }
}
