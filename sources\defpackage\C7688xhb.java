package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: xhb reason: default package and case insensitive filesystem */
/* compiled from: LazyJavaAnnotationDescriptor.kt */
public final class C7688xhb implements C6315deb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C7688xhb.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), HYa.a((DYa) new EYa(HYa.a(C7688xhb.class), C1325gg.TYPE, "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), HYa.a((DYa) new EYa(HYa.a(C7688xhb.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    private final Qsb b = this.f.e().b((PXa<? extends T>) new C7550vhb<Object>(this));
    private final Psb c = this.f.e().a((PXa<? extends T>) new C7619whb<Object>(this));
    private final Cib d = this.f.a().q().a(this.g);
    private final Psb e = this.f.e().a((PXa<? extends T>) new C7481uhb<Object>(this));
    /* access modifiers changed from: private */
    public final C6590hhb f;
    /* access modifiers changed from: private */
    public final Eib g;

    public C7688xhb(C6590hhb hhb, Eib eib) {
        C7471uYa.b(hhb, "c");
        C7471uYa.b(eib, "javaAnnotation");
        this.f = hhb;
        this.g = eib;
    }

    public Map<C7694xnb, Npb<?>> a() {
        return (Map) Rsb.a(this.e, (Object) this, a[2]);
    }

    public Etb getType() {
        return (Etb) Rsb.a(this.c, (Object) this, a[1]);
    }

    public C7349snb q() {
        return (C7349snb) Rsb.a(this.b, (Object) this, a[0]);
    }

    public String toString() {
        return Cob.a(Cob.f, this, null, 2, null);
    }

    public Cib getSource() {
        return this.d;
    }

    /* access modifiers changed from: private */
    public final Npb<?> a(Fib fib) {
        if (fib instanceof Sib) {
            return Qpb.a.a(((Sib) fib).getValue());
        }
        if (fib instanceof Qib) {
            Qib qib = (Qib) fib;
            return a(qib.c(), qib.d());
        } else if (fib instanceof Iib) {
            C7694xnb name = fib.getName();
            if (name == null) {
                name = C6657igb.c;
                C7471uYa.a((Object) name, "DEFAULT_ANNOTATION_MEMBER_NAME");
            }
            return a(name, ((Iib) fib).getElements());
        } else if (fib instanceof Gib) {
            return a(((Gib) fib).a());
        } else {
            if (fib instanceof Lib) {
                return a(((Lib) fib).b());
            }
            return null;
        }
    }

    private final Npb<?> a(Eib eib) {
        return new Hpb(new C7688xhb(this.f, eib));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r3 != null) goto L_0x003e;
     */
    private final Npb<?> a(C7694xnb xnb, List<? extends Fib> list) {
        C7706xtb xtb;
        Etb type = getType();
        C7471uYa.a((Object) type, C1325gg.TYPE);
        if (C7844ztb.a(type)) {
            return null;
        }
        C5029Jcb b2 = C7148pqb.b((C6315deb) this);
        if (b2 != null) {
            C5061Kdb a2 = C7411tgb.a(xnb, b2);
            if (a2 != null) {
                xtb = a2.getType();
            }
            xtb = this.f.a().j().E().a(C6473fub.INVARIANT, (C7706xtb) C7154ptb.c("Unknown array element type"));
            C7471uYa.a((Object) xtb, "DescriptorResolverUtils.…e\")\n                    )");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
            for (Fib a3 : list) {
                Object a4 = a(a3);
                if (a4 == null) {
                    a4 = new _pb();
                }
                arrayList.add(a4);
            }
            return Qpb.a.a((List<? extends Npb<?>>) arrayList, xtb);
        }
        C7471uYa.a();
        throw null;
    }

    private final Npb<?> a(C7280rnb rnb, C7694xnb xnb) {
        if (rnb == null || xnb == null) {
            return null;
        }
        return new Spb(rnb, xnb);
    }

    private final Npb<?> a(Zib zib) {
        return Ypb.b.a(this.f.g().a(zib, C7482uib.a(Lgb.COMMON, false, (C4905Fdb) null, 3, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final C5029Jcb a(C7349snb snb) {
        C6450fdb d2 = this.f.d();
        C7280rnb a2 = C7280rnb.a(snb);
        C7471uYa.a((Object) a2, "ClassId.topLevel(fqName)");
        return C5535_cb.a(d2, a2, this.f.a().b().b().n());
    }
}
