package defpackage;

import java.util.Iterator;

/* renamed from: dhb reason: default package and case insensitive filesystem */
/* compiled from: LazyJavaAnnotations.kt */
public final class C6318dhb implements C6723jeb {
    private final Nsb<Eib, C6315deb> a = this.b.a().r().a((_Xa<? super K, ? extends V>) new C5722chb<Object,Object>(this));
    /* access modifiers changed from: private */
    public final C6590hhb b;
    private final Hib c;

    public C6318dhb(C6590hhb hhb, Hib hib) {
        C7471uYa.b(hhb, "c");
        C7471uYa.b(hib, "annotationOwner");
        this.b = hhb;
        this.c = hib;
    }

    public boolean b(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return b.b(this, snb);
    }

    public boolean isEmpty() {
        return this.c.getAnnotations().isEmpty() && !this.c.c();
    }

    public Iterator<C6315deb> iterator() {
        Iwb d = Ywb.d(C7676xWa.d(this.c.getAnnotations()), this.a);
        C7618wgb wgb = C7618wgb.k;
        C7349snb snb = C5301Sbb.h.x;
        C7471uYa.a((Object) snb, "KotlinBuiltIns.FQ_NAMES.deprecated");
        return Ywb.e(Ywb.c(d, wgb.a(snb, this.c, this.b))).iterator();
    }

    public C6315deb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        Eib a2 = this.c.a(snb);
        if (a2 != null) {
            C6315deb deb = (C6315deb) this.a.invoke(a2);
            if (deb != null) {
                return deb;
            }
        }
        return C7618wgb.k.a(snb, this.c, this.b);
    }
}
