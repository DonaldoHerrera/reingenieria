package defpackage;

import java.util.List;

/* renamed from: fcb reason: default package and case insensitive filesystem */
/* compiled from: FunctionClassScope.kt */
public final class C6449fcb extends Aqb {
    public C6449fcb(Ssb ssb, C5649bcb bcb) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(bcb, "containingClass");
        super(ssb, bcb);
    }

    /* access modifiers changed from: protected */
    public List<C5582adb> c() {
        C5029Jcb d = d();
        if (d != null) {
            int i = C6381ecb.a[((C5649bcb) d).f().ordinal()];
            if (i == 1) {
                return C6850lWa.a(C6517gcb.D.a((C5649bcb) d(), false));
            }
            if (i != 2) {
                return C6918mWa.a();
            }
            return C6850lWa.a(C6517gcb.D.a((C5649bcb) d(), true));
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
    }
}
