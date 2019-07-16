package defpackage;

import java.util.Collection;
import java.util.Map;

/* renamed from: vgb reason: default package and case insensitive filesystem */
/* compiled from: JavaAnnotationMapper.kt */
public class C7549vgb implements C6315deb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C7549vgb.class), C1325gg.TYPE, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    private final C7822zdb b;
    private final Psb c;
    private final Fib d;
    private final C7349snb e;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r4 != null) goto L_0x0027;
     */
    public C7549vgb(C6590hhb hhb, Eib eib, C7349snb snb) {
        C7822zdb zdb;
        Fib fib;
        C7471uYa.b(hhb, "c");
        C7471uYa.b(snb, "fqName");
        this.e = snb;
        if (eib != null) {
            zdb = hhb.a().q().a(eib);
        }
        zdb = C7822zdb.a;
        C7471uYa.a((Object) zdb, "SourceElement.NO_SOURCE");
        this.b = zdb;
        this.c = hhb.e().a((PXa<? extends T>) new C7480ugb<Object>(this, hhb));
        if (eib != null) {
            Collection C = eib.C();
            if (C != null) {
                fib = (Fib) C7676xWa.h((Iterable<? extends T>) C);
                this.d = fib;
            }
        }
        fib = null;
        this.d = fib;
    }

    public Map<C7694xnb, Npb<?>> a() {
        return LWa.a();
    }

    /* access modifiers changed from: protected */
    public final Fib b() {
        return this.d;
    }

    public C7822zdb getSource() {
        return this.b;
    }

    public Etb getType() {
        return (Etb) Rsb.a(this.c, (Object) this, a[0]);
    }

    public C7349snb q() {
        return this.e;
    }
}
