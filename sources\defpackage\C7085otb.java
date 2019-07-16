package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: otb reason: default package and case insensitive filesystem */
/* compiled from: ErrorUtils */
class C7085otb implements Ptb {
    final /* synthetic */ a a;
    final /* synthetic */ String b;

    C7085otb(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
        if (i == 1) {
            objArr[1] = "getSupertypes";
        } else if (i != 2) {
            objArr[1] = "getParameters";
        } else {
            objArr[1] = "getBuiltIns";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    public C5301Sbb E() {
        C5121Mbb F = C5121Mbb.F();
        if (F != null) {
            return F;
        }
        a(2);
        throw null;
    }

    public Collection<C7706xtb> b() {
        List a2 = C6918mWa.a();
        if (a2 != null) {
            return a2;
        }
        a(1);
        throw null;
    }

    public C5122Mcb c() {
        return this.a;
    }

    public boolean d() {
        return false;
    }

    public List<C4905Fdb> getParameters() {
        List<C4905Fdb> a2 = C6918mWa.a();
        if (a2 != null) {
            return a2;
        }
        a(0);
        throw null;
    }

    public String toString() {
        return this.b;
    }
}
