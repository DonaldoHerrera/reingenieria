package defpackage;

import java.util.Iterator;

/* renamed from: cW reason: default package and case insensitive filesystem */
/* compiled from: StoreUsersCommand.kt */
public class C0515cW {
    private final C5500ZKa a;

    public C0515cW(C5500ZKa zKa) {
        C7471uYa.b(zKa, "database");
        this.a = zKa;
    }

    private C5054KLa b(Iterable<C3776gea> iterable) {
        a aVar = new a(C6918mWa.b((Object[]) new C5085LLa[]{h.d, h.e, h.f, h.m, h.n, h.j, h.i, h.k, h.l, h.p, h.g, h.h, h.q, h.r, h.s}));
        Iterator it = C7676xWa.p(iterable).iterator();
        while (it.hasNext()) {
            C3776gea gea = (C3776gea) it.next();
            Object[] objArr = new Object[15];
            objArr[0] = Long.valueOf(gea.l().c());
            objArr[1] = gea.j();
            objArr[2] = gea.m();
            objArr[3] = gea.f();
            objArr[4] = gea.i();
            objArr[5] = gea.c();
            objArr[6] = gea.b();
            objArr[7] = Long.valueOf(gea.g());
            objArr[8] = Long.valueOf(gea.h());
            objArr[9] = gea.e();
            objArr[10] = gea.a();
            objArr[11] = gea.n();
            C3508cda a2 = C3775gda.a(gea.k());
            objArr[12] = a2 != null ? a2.toString() : null;
            objArr[13] = Long.valueOf(gea.d().getTime());
            objArr[14] = Boolean.valueOf(gea.o());
            aVar.a(C6918mWa.b(objArr));
        }
        C5054KLa a3 = aVar.a();
        C7471uYa.a((Object) a3, "builder.build()");
        return a3;
    }

    public C6499gLa a(Iterable<C3776gea> iterable) {
        C7471uYa.b(iterable, "input");
        C6499gLa a2 = a(this.a, iterable);
        if (a2.b()) {
            return a2;
        }
        C5529_Ka a3 = a2.a();
        if (a3 == null) {
            C7471uYa.a();
            throw null;
        }
        throw a3;
    }

    public C6499gLa a(C5500ZKa zKa, Iterable<C3776gea> iterable) {
        C7471uYa.b(zKa, "propeller");
        C7471uYa.b(iterable, "input");
        C6431fLa a2 = zKa.a((C5116MLa) h.c, b(iterable));
        C7471uYa.a((Object) a2, "propeller.bulkInsert(Use…tBulkInsertValues(input))");
        return a2;
    }
}
