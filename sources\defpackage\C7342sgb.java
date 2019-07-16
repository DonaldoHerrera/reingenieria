package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: sgb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorResolverUtils */
class C7342sgb extends C6871lpb {
    final /* synthetic */ C7357srb a;
    final /* synthetic */ Set b;
    final /* synthetic */ boolean c;

    C7342sgb(C7357srb srb, Set set, boolean z) {
        this.a = srb;
        this.b = set;
        this.c = z;
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void a(C4935Gcb gcb) {
        if (gcb != null) {
            C7629wpb.a(gcb, (_Xa<C4935Gcb, RVa>) new C7273rgb<C4935Gcb,RVa>(this));
            this.b.add(gcb);
            return;
        }
        a(0);
        throw null;
    }

    public void c(C4935Gcb gcb, C4935Gcb gcb2) {
        if (gcb == null) {
            a(1);
            throw null;
        } else if (gcb2 == null) {
            a(2);
            throw null;
        }
    }

    public void a(C4935Gcb gcb, Collection<? extends C4935Gcb> collection) {
        if (gcb == null) {
            a(3);
            throw null;
        } else if (collection == null) {
            a(4);
            throw null;
        } else if (!this.c || gcb.g() == a.FAKE_OVERRIDE) {
            super.a(gcb, collection);
        }
    }
}
