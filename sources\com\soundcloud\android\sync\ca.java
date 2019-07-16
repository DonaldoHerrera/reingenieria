package com.soundcloud.android.sync;

/* compiled from: SyncOperations */
public class ca {
    private final T a;
    private final la b;
    private final oa c;

    public ca(T t, la laVar, oa oaVar) {
        this.a = t;
        this.b = laVar;
        this.c = oaVar;
    }

    private boolean f(na naVar) {
        return this.b.a(naVar, this.c.a(naVar).c());
    }

    public IPa<ia> b(na naVar, String str) {
        return this.a.a(naVar, str).e(C6124g.a).g(C6127j.a);
    }

    public IPa<ia> c(na naVar) {
        return this.a.a(naVar).e(C6123f.a).g(C6127j.a);
    }

    public IPa<ia> d(na naVar) {
        if (this.b.c(naVar)) {
            return IPa.a(ia.c());
        }
        return c(naVar);
    }

    public IPa<ia> e(na naVar) {
        if (!this.b.c(naVar) || !f(naVar)) {
            return c(naVar);
        }
        return IPa.a(ia.c());
    }

    public IPa<ia> a(na naVar) {
        return c(naVar).f(C6125h.a);
    }

    public IPa<ia> a(na naVar, String str) {
        return b(naVar, str).f(C6122e.a);
    }

    public IPa<ia> b(na naVar) {
        if (!this.b.c(naVar)) {
            return c(naVar);
        }
        if (f(naVar)) {
            return IPa.a(ia.c());
        }
        this.a.a(naVar).e().a((C7117pPa) new C4943Gua());
        return IPa.a(ia.e());
    }
}
