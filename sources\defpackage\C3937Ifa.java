package defpackage;

import java.util.Set;

/* renamed from: Ifa reason: default package and case insensitive filesystem */
/* compiled from: DefaultVault.kt */
public final class C3937Ifa extends C3043iC<Set<? extends Key>, IPa<C3953bga<Key, NetworkModel>>> {
    final /* synthetic */ Qfa a;

    C3937Ifa(Qfa qfa) {
        this.a = qfa;
    }

    public IPa<C3953bga<Key, NetworkModel>> a(Set<? extends Key> set) {
        C7471uYa.b(set, "keys");
        IPa<C3953bga<Key, NetworkModel>> c = this.a.b.a(set).c();
        C7471uYa.a((Object) c, "networkFetcher.fetch(keys).cache()");
        return c;
    }
}
