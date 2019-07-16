package defpackage;

import java.io.IOException;

/* renamed from: wv reason: default package and case insensitive filesystem */
public class C1827wv<T> extends Tt {
    private final C1796vu c;
    private final String d;
    private final String e;
    private final C1710sy f;
    private C1830wy g = new C1830wy();
    private C1830wy h;
    private int i = -1;
    private String j;
    private Class<T> k;

    protected C1827wv(C1796vu vuVar, String str, String str2, C1710sy syVar, Class<T> cls) {
        Pu.a(cls);
        this.k = cls;
        Pu.a(vuVar);
        this.c = vuVar;
        Pu.a(str);
        this.d = str;
        Pu.a(str2);
        this.e = str2;
        this.f = syVar;
        this.g.g("Google-API-Java-Client");
        this.g.a("X-Goog-Api-Client", (Object) C0476aw.b().a(vuVar.getClass().getSimpleName()));
    }

    /* access modifiers changed from: protected */
    public IOException a(C0279Xs xs) {
        return new C0292_s(xs);
    }

    /* renamed from: c */
    public C1827wv<T> a(String str, Object obj) {
        super.a(str, obj);
        return this;
    }

    public C1796vu k() {
        return this.c;
    }

    public final C1830wy l() {
        return this.g;
    }

    public final C1830wy m() {
        return this.h;
    }

    public final T n() throws IOException {
        C0274Ws a = k().b().a(this.d, new C1740ty(C1307ft.a(this.c.a(), this.e, (Object) this, true)), this.f);
        new C0264Us().a(a);
        a.a(k().c());
        if (this.f == null && (this.d.equals("POST") || this.d.equals("PUT") || this.d.equals("PATCH"))) {
            a.a((C1710sy) new C1590oy());
        }
        a.j().putAll(this.g);
        a.a((C1800vy) new C1680ry());
        a.a((C0504bt) new C1828ww(this, a.l(), a));
        C0279Xs d2 = a.d();
        this.h = d2.i();
        this.i = d2.d();
        this.j = d2.e();
        return d2.a(this.k);
    }
}
