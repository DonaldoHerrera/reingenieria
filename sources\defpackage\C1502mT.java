package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: mT reason: default package and case insensitive filesystem */
/* compiled from: StoreTracksCommand */
public class C1502mT extends C1286fT<Iterable<Yda>, C6499gLa> {
    /* access modifiers changed from: private */
    public final C3800jea b;

    public C1502mT(C5500ZKa zKa, C3800jea jea) {
        super(zKa);
        this.b = jea;
    }

    /* access modifiers changed from: private */
    public static C5054KLa c(Iterable<? extends Yda> iterable) {
        a aVar = new a(d());
        for (Yda a : iterable) {
            aVar.a(a(a));
        }
        return aVar.a();
    }

    /* access modifiers changed from: private */
    public static C5054KLa d(Iterable<? extends Yda> iterable) {
        a aVar = new a(e());
        for (Yda b2 : iterable) {
            aVar.a(b(b2));
        }
        return aVar.a();
    }

    private static List<C5085LLa> e() {
        return Arrays.asList(new C5085LLa[]{e.d, e.e, e.p, e.l, e.m, e.s, e.q, e.r, e.f, e.j, e.y, e.x, e.B, e.D, e.E, e.F, e.H, e.N, e.R, e.S});
    }

    private static List<Object> b(Yda yda) {
        Object[] objArr = new Object[20];
        objArr[0] = Long.valueOf(yda.w().c());
        objArr[1] = Integer.valueOf(0);
        objArr[2] = yda.v();
        objArr[3] = Long.valueOf(yda.g());
        objArr[4] = Long.valueOf(yda.q());
        objArr[5] = yda.x();
        objArr[6] = yda.l();
        String str = null;
        objArr[7] = C5206PKa.c(yda.a()) ? null : yda.a();
        objArr[8] = Long.valueOf(yda.d().getTime());
        objArr[9] = yda.h();
        objArr[10] = yda.p().e;
        objArr[11] = Boolean.valueOf(yda.c());
        objArr[12] = Integer.valueOf(yda.n().a().c());
        objArr[13] = Integer.valueOf(yda.n().a().a());
        objArr[14] = Integer.valueOf(yda.n().a().b());
        objArr[15] = Integer.valueOf(yda.n().a().d());
        objArr[16] = Long.valueOf(yda.n().b().l().c());
        objArr[17] = C5206PKa.c(yda.e()) ? null : yda.e();
        objArr[18] = Boolean.valueOf(yda.f());
        if (!C5206PKa.c(yda.o())) {
            str = yda.o();
        }
        objArr[19] = str;
        return Arrays.asList(objArr);
    }

    /* access modifiers changed from: protected */
    public C6499gLa a(C5500ZKa zKa, Iterable<Yda> iterable) {
        return zKa.a((a) new C1471lT(this, iterable));
    }

    private static List<Object> a(Yda yda) {
        if (yda.m() != null) {
            Object[] objArr = new Object[10];
            objArr[0] = Long.valueOf(yda.w().c());
            objArr[1] = Boolean.valueOf(yda.j());
            objArr[2] = Boolean.valueOf(yda.b());
            objArr[3] = Boolean.valueOf(yda.r());
            objArr[4] = yda.m();
            objArr[5] = Boolean.valueOf(yda.u());
            objArr[6] = Long.valueOf(System.currentTimeMillis());
            objArr[7] = C5206PKa.c(yda.k()) ? null : yda.k();
            objArr[8] = Boolean.valueOf(yda.t());
            objArr[9] = Boolean.valueOf(yda.s());
            return Arrays.asList(objArr);
        }
        throw new IllegalStateException(String.format("Track policy should not be null: %s", new Object[]{yda}));
    }

    private static List<C5085LLa> d() {
        return Arrays.asList(new C5085LLa[]{f.d, f.e, f.f, f.g, f.j, f.l, f.m, f.k, f.h, f.i});
    }
}
