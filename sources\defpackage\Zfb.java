package defpackage;

/* renamed from: Zfb reason: default package */
/* compiled from: FieldOverridabilityCondition.kt */
public final class Zfb implements C6599hpb {
    public b a(C4904Fcb fcb, C4904Fcb fcb2, C5029Jcb jcb) {
        C7471uYa.b(fcb, "superDescriptor");
        C7471uYa.b(fcb2, "subDescriptor");
        if (!(fcb2 instanceof C7408tdb) || !(fcb instanceof C7408tdb)) {
            return b.UNKNOWN;
        }
        C7408tdb tdb = (C7408tdb) fcb2;
        C7408tdb tdb2 = (C7408tdb) fcb;
        if (!C7471uYa.a((Object) tdb.getName(), (Object) tdb2.getName())) {
            return b.UNKNOWN;
        }
        if (C7274rhb.a(tdb) && C7274rhb.a(tdb2)) {
            return b.OVERRIDABLE;
        }
        if (C7274rhb.a(tdb) || C7274rhb.a(tdb2)) {
            return b.INCOMPATIBLE;
        }
        return b.UNKNOWN;
    }

    public a a() {
        return a.BOTH;
    }
}
