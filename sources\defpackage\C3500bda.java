package defpackage;

import java.util.Date;

/* renamed from: bda reason: default package and case insensitive filesystem */
/* compiled from: TrackMapper.kt */
public final class C3500bda {
    public static final C3509cea a(Yda yda) {
        C7471uYa.b(yda, "$this$toDomainTrack");
        C3508cda w = yda.w();
        String v = yda.v();
        Date d = yda.d();
        long q = yda.q();
        long g = yda.g();
        boolean z = yda.p() != C3492ada.PUBLIC;
        int c = yda.n().a().c();
        int a = yda.n().a().a();
        int b = yda.n().a().b();
        int d2 = yda.n().a().d();
        boolean f = yda.f();
        boolean c2 = yda.c();
        boolean j = yda.j();
        boolean b2 = yda.b();
        boolean r = yda.r();
        boolean s = yda.s();
        boolean t = yda.t();
        String k = yda.k();
        String l = yda.l();
        String a2 = yda.a();
        boolean z2 = c2;
        C3752dea dea = new C3752dea(yda.m(), new Date());
        String x = yda.x();
        String m = yda.n().b().m();
        C3508cda l2 = yda.n().b().l();
        boolean o = yda.n().b().o();
        String h = yda.h();
        String o2 = yda.o();
        C3509cea cea = new C3509cea(w, v, d, q, g, z, c, a, b, d2, f, z2, j, b2, r, s, t, k, l, a2, dea, x, m, l2, o, h, (o2 == null || !(Cxb.a(o2) ^ true)) ? null : yda.o(), yda.u());
        return cea;
    }
}
