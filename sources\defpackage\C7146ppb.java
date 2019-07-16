package defpackage;

import java.util.Map;

/* renamed from: ppb reason: default package and case insensitive filesystem */
/* compiled from: OverridingUtil */
class C7146ppb implements a {
    final /* synthetic */ Map a;
    final /* synthetic */ C7629wpb b;

    C7146ppb(C7629wpb wpb, Map map) {
        this.b = wpb;
        this.a = map;
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$3";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public boolean a(Ptb ptb, Ptb ptb2) {
        boolean z = false;
        if (ptb == null) {
            a(0);
            throw null;
        } else if (ptb2 == null) {
            a(1);
            throw null;
        } else if (this.b.c.a(ptb, ptb2)) {
            return true;
        } else {
            Ptb ptb3 = (Ptb) this.a.get(ptb);
            Ptb ptb4 = (Ptb) this.a.get(ptb2);
            if ((ptb3 != null && ptb3.equals(ptb2)) || (ptb4 != null && ptb4.equals(ptb))) {
                z = true;
            }
            return z;
        }
    }
}
