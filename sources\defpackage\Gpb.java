package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Gpb reason: default package */
/* compiled from: CapturedTypeConstructor.kt */
public final class Gpb {
    /* access modifiers changed from: private */
    public static final Stb b(Stb stb, C4905Fdb fdb) {
        Utb utb;
        if (fdb == null || stb.b() == C6473fub.INVARIANT) {
            return stb;
        }
        if (fdb.pa() != stb.b()) {
            return new Utb(a(stb));
        }
        if (stb.a()) {
            Ssb ssb = Jsb.b;
            C7471uYa.a((Object) ssb, "LockBasedStorageManager.NO_LOCKS");
            utb = new Utb(new Atb(ssb, new Epb(stb)));
        } else {
            utb = new Utb(stb.getType());
        }
        return utb;
    }

    public static final C7706xtb a(Stb stb) {
        C7471uYa.b(stb, "typeProjection");
        Bpb bpb = new Bpb(stb, null, false, null, 14, null);
        return bpb;
    }

    public static final boolean a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isCaptured");
        return xtb.za() instanceof Cpb;
    }

    public static /* synthetic */ Wtb a(Wtb wtb, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return a(wtb, z);
    }

    public static final Wtb a(Wtb wtb, boolean z) {
        C7471uYa.b(wtb, "$this$wrapWithCapturingSubstitution");
        if (!(wtb instanceof C7499utb)) {
            return new Fpb(wtb, z, wtb);
        }
        C7499utb utb = (C7499utb) wtb;
        C4905Fdb[] f = utb.f();
        List<HVa> a = C6578hWa.a((Object[]) utb.e(), (Object[]) utb.f());
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a, 10));
        for (HVa hVa : a) {
            arrayList.add(b((Stb) hVa.c(), (C4905Fdb) hVa.d()));
        }
        Object[] array = arrayList.toArray(new Stb[0]);
        if (array != null) {
            return new C7499utb(f, (Stb[]) array, z);
        }
        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
