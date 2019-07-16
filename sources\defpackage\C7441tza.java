package defpackage;

import com.soundcloud.android.collections.data.ga;

/* renamed from: tza reason: default package and case insensitive filesystem */
/* compiled from: LikeCountWriter.kt */
public class C7441tza {
    private final C4898FLa a;

    public C7441tza(C4898FLa fLa) {
        C7471uYa.b(fLa, "propellerRx");
        this.a = fLa;
    }

    private IPa<Integer> c(ga gaVar) {
        IPa<Integer> g = this.a.a((C6975nLa) ((C6975nLa) C6975nLa.a(e.c).a(e.E).a(e.d, (Object) Long.valueOf(gaVar.b().c()))).a(e.e, (Object) Integer.valueOf(b(gaVar)))).h(new C7165pza(this, gaVar)).g();
        C7471uYa.a((Object) g, "propellerRx.query(\n     … params) }.firstOrError()");
        return g;
    }

    /* access modifiers changed from: private */
    public APa<C5266RKa> b(int i, ga gaVar) {
        APa<C5266RKa> a2 = this.a.a((C5116MLa) e.c, C5296SKa.b().a(e.E, i).a(), C6907mLa.a().a(e.d, (Object) Long.valueOf(gaVar.b().c())).a(e.e, (Object) Integer.valueOf(b(gaVar))));
        C7471uYa.a((Object) a2, "propellerRx.update(\n    …E, params.type)\n        )");
        return a2;
    }

    public IPa<Integer> a(ga gaVar) {
        C7471uYa.b(gaVar, "params");
        IPa<Integer> g = c(gaVar).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C7372sza<Object,Object>(this, gaVar)).g();
        C7471uYa.a((Object) g, "obtainNewLikesCount(para…          .firstOrError()");
        return g;
    }

    /* access modifiers changed from: private */
    public Integer a(C5631bLa bla) {
        return (Integer) bla.a((C6295dLa<T>) C7234qza.a);
    }

    /* access modifiers changed from: private */
    public int a(int i, ga gaVar) {
        if (i == -1) {
            return -1;
        }
        return gaVar.a() ? i + 1 : -1 + i;
    }

    private int b(ga gaVar) {
        if (gaVar.b().x()) {
            return 0;
        }
        if (gaVar.b().u()) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot update likes count for ");
        sb.append(gaVar.b());
        throw new IllegalArgumentException(sb.toString());
    }
}
