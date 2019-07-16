package defpackage;

/* renamed from: epb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorEquivalenceForOverrides.kt */
public final class C6395epb {
    public static final C6395epb a = new C6395epb();

    private C6395epb() {
    }

    public final boolean a(C5272Rcb rcb, C5272Rcb rcb2) {
        if ((rcb instanceof C5029Jcb) && (rcb2 instanceof C5029Jcb)) {
            return a((C5029Jcb) rcb, (C5029Jcb) rcb2);
        }
        if ((rcb instanceof C4905Fdb) && (rcb2 instanceof C4905Fdb)) {
            return a(this, (C4905Fdb) rcb, (C4905Fdb) rcb2, (C6308dYa) null, 4, (Object) null);
        } else if ((rcb instanceof C4904Fcb) && (rcb2 instanceof C4904Fcb)) {
            return a(this, (C4904Fcb) rcb, (C4904Fcb) rcb2, false, 4, (Object) null);
        } else if (!(rcb instanceof C6790kdb) || !(rcb2 instanceof C6790kdb)) {
            return C7471uYa.a((Object) rcb, (Object) rcb2);
        } else {
            return C7471uYa.a((Object) ((C6790kdb) rcb).q(), (Object) ((C6790kdb) rcb2).q());
        }
    }

    private final boolean a(C5029Jcb jcb, C5029Jcb jcb2) {
        return C7471uYa.a((Object) jcb.Q(), (Object) jcb2.Q());
    }

    static /* synthetic */ boolean a(C6395epb epb, C4905Fdb fdb, C4905Fdb fdb2, C6308dYa dya, int i, Object obj) {
        if ((i & 4) != 0) {
            dya = C6327dpb.a;
        }
        return epb.a(fdb, fdb2, dya);
    }

    /* access modifiers changed from: private */
    public final boolean a(C4905Fdb fdb, C4905Fdb fdb2, C6308dYa<? super C5272Rcb, ? super C5272Rcb, Boolean> dya) {
        boolean z = true;
        if (C7471uYa.a((Object) fdb, (Object) fdb2)) {
            return true;
        }
        if (C7471uYa.a((Object) fdb.e(), (Object) fdb2.e()) || !a((C5272Rcb) fdb, (C5272Rcb) fdb2, dya)) {
            return false;
        }
        if (fdb.getIndex() != fdb2.getIndex()) {
            z = false;
        }
        return z;
    }

    public static /* synthetic */ boolean a(C6395epb epb, C4904Fcb fcb, C4904Fcb fcb2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return epb.a(fcb, fcb2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (r8.a() == defpackage.C7629wpb.a.C0186a.OVERRIDABLE) goto L_0x007c;
     */
    public final boolean a(C4904Fcb fcb, C4904Fcb fcb2, boolean z) {
        C7471uYa.b(fcb, "a");
        C7471uYa.b(fcb2, "b");
        boolean z2 = true;
        if (C7471uYa.a((Object) fcb, (Object) fcb2)) {
            return true;
        }
        if ((!C7471uYa.a((Object) fcb.getName(), (Object) fcb2.getName())) || C7471uYa.a((Object) fcb.e(), (Object) fcb2.e()) || C6531gpb.p(fcb) || C6531gpb.p(fcb2) || !a((C5272Rcb) fcb, (C5272Rcb) fcb2, (C6308dYa<? super C5272Rcb, ? super C5272Rcb, Boolean>) C5595apb.a)) {
            return false;
        }
        C7629wpb a2 = C7629wpb.a((a) new C6259cpb(fcb, fcb2));
        C7471uYa.a((Object) a2, "OverridingUtil.createWit…= a && y == b})\n        }");
        a a3 = a2.a(fcb, fcb2, (C5029Jcb) null, !z);
        String str = "overridingUtil.isOverrid… null, !ignoreReturnType)";
        C7471uYa.a((Object) a3, str);
        if (a3.a() == C0186a.OVERRIDABLE) {
            a a4 = a2.a(fcb2, fcb, (C5029Jcb) null, !z);
            C7471uYa.a((Object) a4, str);
        }
        z2 = false;
        return z2;
    }

    private final boolean a(C5272Rcb rcb, C5272Rcb rcb2, C6308dYa<? super C5272Rcb, ? super C5272Rcb, Boolean> dya) {
        C5272Rcb e = rcb.e();
        C5272Rcb e2 = rcb2.e();
        if ((e instanceof C4935Gcb) || (e2 instanceof C4935Gcb)) {
            return ((Boolean) dya.invoke(e, e2)).booleanValue();
        }
        return a(e, e2);
    }
}
