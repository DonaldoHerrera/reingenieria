package defpackage;

import java.util.Set;

/* renamed from: bkb reason: default package and case insensitive filesystem */
/* compiled from: signatureEnhancement.kt */
public final class C5657bkb {
    /* access modifiers changed from: private */
    public static final C6592hjb b(C6796kjb kjb, C6660ijb ijb, boolean z, boolean z2) {
        if (!z2 || kjb != C6796kjb.NOT_NULL) {
            return new C6592hjb(kjb, ijb, false, z);
        }
        return new C6592hjb(kjb, ijb, true, z);
    }

    /* access modifiers changed from: private */
    public static final <T> T b(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (C7471uYa.a((Object) t4, (Object) t) && C7471uYa.a((Object) t3, (Object) t2)) {
                t4 = null;
            } else if (t3 != null) {
                t4 = t3;
            }
            return t4;
        }
        if (t3 != null) {
            Set<? extends T> t5 = C7676xWa.t(TWa.b(set, t3));
            if (t5 != null) {
                set = t5;
            }
        }
        return C7676xWa.n(set);
    }

    /* access modifiers changed from: private */
    public static final C6796kjb b(Set<? extends C6796kjb> set, C6796kjb kjb, boolean z) {
        C6796kjb kjb2 = C6796kjb.FORCE_FLEXIBILITY;
        return kjb == kjb2 ? kjb2 : (C6796kjb) b(set, C6796kjb.NOT_NULL, C6796kjb.NULLABLE, kjb, z);
    }
}
