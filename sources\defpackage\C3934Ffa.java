package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Ffa reason: default package and case insensitive filesystem */
/* compiled from: DefaultVault.kt */
final class C3934Ffa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Qfa a;

    C3934Ffa(Qfa qfa) {
        this.a = qfa;
    }

    /* renamed from: a */
    public final List<Model> apply(List<? extends Model> list) {
        C7471uYa.b(list, "models");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!this.a.h.a(this.a.g.get(this.a.f.a(next)))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
