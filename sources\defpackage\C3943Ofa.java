package defpackage;

import java.util.List;

/* renamed from: Ofa reason: default package and case insensitive filesystem */
/* compiled from: DefaultVault.kt */
final class C3943Ofa<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C3944Pfa a;

    C3943Ofa(C3944Pfa pfa) {
        this.a = pfa;
    }

    /* renamed from: a */
    public final APa<Wfa<Key, List<Model>>> apply(C3953bga<Key, NetworkModel> bga) {
        C7471uYa.b(bga, "networkResult");
        C3944Pfa pfa = this.a;
        return C4757Aua.a(pfa.a.c(pfa.c), new C3942Nfa(bga));
    }
}
