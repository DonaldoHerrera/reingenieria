package defpackage;

import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: gga reason: default package and case insensitive filesystem */
/* compiled from: TombstoneNetworkFetcher.kt */
final class C4562gga<V> implements Callable<T> {
    final /* synthetic */ C4586jga a;
    final /* synthetic */ Set b;

    C4562gga(C4586jga jga, Set set) {
        this.a = jga;
        this.b = set;
    }

    public final Set<C4554fga<Key>> call() {
        return this.a.b(this.b);
    }
}
