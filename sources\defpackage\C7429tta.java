package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* renamed from: tta reason: default package and case insensitive filesystem */
/* compiled from: StorePoliciesCommand */
class C7429tta extends C1286fT<Iterable<C3904wea>, C6431fLa> {
    private final C5694cGa b;

    public C7429tta(C5500ZKa zKa, C5694cGa cga) {
        super(zKa);
        this.b = cga;
    }

    private List<C5085LLa> d() {
        return Arrays.asList(new C5085LLa[]{f.d, f.j, f.e, f.l, f.g, f.f, f.m, f.k, f.h, f.i});
    }

    /* access modifiers changed from: protected */
    public C6431fLa a(C5500ZKa zKa, Iterable<C3904wea> iterable) {
        return zKa.a((C5116MLa) f.c, a(iterable));
    }

    private C5054KLa a(Iterable<C3904wea> iterable) {
        a aVar = new a(d());
        for (C3904wea wea : iterable) {
            SDb.a("PolicyUpdater").a("Writing policy: %s", wea);
            aVar.a(Arrays.asList(new Serializable[]{Long.valueOf(wea.c().c()), wea.b(), Boolean.valueOf(wea.e()), Boolean.valueOf(wea.i()), wea.f(), wea.d(), Long.valueOf(this.b.a()), wea.a(), wea.h(), wea.g()}));
        }
        return aVar.a();
    }
}
