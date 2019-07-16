package defpackage;

import java.lang.reflect.Field;

/* renamed from: Cab reason: default package and case insensitive filesystem */
/* compiled from: KPropertyImpl.kt */
final class C4809Cab extends C7540vYa implements PXa<Field> {
    final /* synthetic */ C7612wab a;

    C4809Cab(C7612wab wab) {
        this.a = wab;
        super(0);
    }

    public final Field d() {
        Class cls;
        C5714c_a a2 = C5504Zab.b.a(this.a.i());
        if (a2 instanceof c) {
            c cVar = (c) a2;
            C7408tdb b = cVar.b();
            a a3 = C6936mnb.a(C6936mnb.b, cVar.d(), cVar.c(), cVar.f(), false, 8, null);
            if (a3 == null) {
                return null;
            }
            if (C6589hgb.a(b) || C6936mnb.a(cVar.d())) {
                cls = this.a.g().a().getEnclosingClass();
            } else {
                C5272Rcb e = b.e();
                if (e instanceof C5029Jcb) {
                    cls = C6312dbb.a((C5029Jcb) e);
                } else {
                    cls = this.a.g().a();
                }
            }
            if (cls == null) {
                return null;
            }
            try {
                return cls.getDeclaredField(a3.c());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        } else if (a2 instanceof a) {
            return ((a) a2).b();
        } else {
            if ((a2 instanceof b) || (a2 instanceof d)) {
                return null;
            }
            throw new FVa();
        }
    }
}
