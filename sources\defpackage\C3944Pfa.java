package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: Pfa reason: default package and case insensitive filesystem */
/* compiled from: DefaultVault.kt */
final class C3944Pfa<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Qfa a;
    final /* synthetic */ APa b;
    final /* synthetic */ Set c;

    C3944Pfa(Qfa qfa, APa aPa, Set set) {
        this.a = qfa;
        this.b = aPa;
        this.c = set;
    }

    /* renamed from: a */
    public final APa<Wfa<Key, List<Model>>> apply(Wfa<Key, List<Model>> wfa) {
        C7471uYa.b(wfa, "result");
        if (wfa instanceof Yfa) {
            return this.b;
        }
        if (wfa instanceof Vfa) {
            return this.a.e(this.c).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C3941Mfa<Object,Object>(this)).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C3943Ofa<Object,Object>(this));
        }
        return APa.c(wfa);
    }
}
