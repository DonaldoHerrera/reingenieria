package defpackage;

import java.util.List;

/* renamed from: Nfa reason: default package and case insensitive filesystem */
/* compiled from: DefaultVault.kt */
final class C3942Nfa extends C7540vYa implements _Xa<Wfa<Key, List<? extends Model>>, Wfa<Key, List<? extends Model>>> {
    final /* synthetic */ C3953bga a;

    C3942Nfa(C3953bga bga) {
        this.a = bga;
        super(1);
    }

    /* renamed from: a */
    public final Wfa<Key, List<Model>> invoke(Wfa<Key, List<Model>> wfa) {
        C7471uYa.b(wfa, "storageResult");
        if (!(this.a instanceof a) || !(wfa instanceof Vfa)) {
            return wfa;
        }
        Vfa vfa = (Vfa) wfa;
        return new Vfa(vfa.a(), vfa.b(), ((a) this.a).a());
    }
}
