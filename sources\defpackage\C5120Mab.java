package defpackage;

import java.lang.reflect.Type;

/* renamed from: Mab reason: default package and case insensitive filesystem */
/* compiled from: KTypeImpl.kt */
public final class C5120Mab implements HZa {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C5120Mab.class), "javaType", "getJavaType$kotlin_reflect_api()Ljava/lang/reflect/Type;")), HYa.a((DYa) new EYa(HYa.a(C5120Mab.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), HYa.a((DYa) new EYa(HYa.a(C5120Mab.class), "arguments", "getArguments()Ljava/util/List;")), HYa.a((BYa) new CYa(HYa.a(C5120Mab.class), "parameterizedTypeArguments", "<v#0>"))};
    private final a b;
    private final a c = C5300Sab.b(new C5089Lab(this));
    private final a d = C5300Sab.b(new C5058Kab(this));
    private final C7706xtb e;

    public C5120Mab(C7706xtb xtb, PXa<? extends Type> pXa) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        C7471uYa.b(pXa, "computeJavaType");
        this.e = xtb;
        this.b = C5300Sab.b(pXa);
    }

    public final Type a() {
        return (Type) this.b.a(this, a[0]);
    }

    public final C7706xtb b() {
        return this.e;
    }

    public C7541vZa e() {
        return (C7541vZa) this.c.a(this, a[1]);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5120Mab) && C7471uYa.a((Object) this.e, (Object) ((C5120Mab) obj).e);
    }

    public boolean f() {
        return this.e.Aa();
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return C5475Yab.b.a(this.e);
    }

    /* access modifiers changed from: private */
    public final C7541vZa a(C7706xtb xtb) {
        C5122Mcb c2 = xtb.za().c();
        if (c2 instanceof C5029Jcb) {
            Class a2 = C6312dbb.a((C5029Jcb) c2);
            if (a2 == null) {
                return null;
            }
            if (a2.isArray()) {
                Stb stb = (Stb) C7676xWa.k(xtb.ya());
                if (stb != null) {
                    C7706xtb type = stb.getType();
                    if (type != null) {
                        C7471uYa.a((Object) type, "type.arguments.singleOrN…return KClassImpl(jClass)");
                        C7541vZa a3 = a(type);
                        if (a3 != null) {
                            return new I_a(Rvb.a(MXa.a(SZa.a(a3))));
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot determine classifier for array element type: ");
                        sb.append(this);
                        throw new C5240Qab(sb.toString());
                    }
                }
                return new I_a(a2);
            } else if (C5605aub.g(xtb)) {
                return new I_a(a2);
            } else {
                Class d2 = Rvb.d(a2);
                if (d2 != null) {
                    a2 = d2;
                }
                return new I_a(a2);
            }
        } else if (c2 instanceof C4905Fdb) {
            return new C5210Pab((C4905Fdb) c2);
        } else {
            if (!(c2 instanceof C4874Edb)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("An operation is not implemented: ");
            sb2.append("Type alias classifiers are not yet supported");
            throw new GVa(sb2.toString());
        }
    }
}
