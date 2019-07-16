package defpackage;

import java.util.List;

/* renamed from: rkb reason: default package and case insensitive filesystem */
/* compiled from: DeserializationComponentsForJava.kt */
public final class C7277rkb {
    private final C6739jrb a;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0071, code lost:
        if (r0 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0064, code lost:
        if (r1 != null) goto L_0x0069;
     */
    public C7277rkb(Ssb ssb, C6450fdb fdb, C6807krb krb, C7484ukb ukb, C7208qkb qkb, C6522ghb ghb, C6586hdb hdb, C7357srb srb, Efb efb, C6671irb irb) {
        C7478ueb ueb;
        C7616web web;
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(fdb, "moduleDescriptor");
        C7471uYa.b(krb, "configuration");
        C7471uYa.b(ukb, "classDataFinder");
        C7471uYa.b(qkb, "annotationAndConstantLoader");
        C7471uYa.b(ghb, "packageFragmentProvider");
        C7471uYa.b(hdb, "notFoundClasses");
        C7471uYa.b(srb, "errorReporter");
        C7471uYa.b(efb, "lookupTracker");
        C7471uYa.b(irb, "contractDeserializer");
        C5301Sbb E = fdb.E();
        if (!(E instanceof C7200qcb)) {
            E = null;
        }
        C7200qcb qcb = (C7200qcb) E;
        a aVar = a.a;
        C7553vkb vkb = C7553vkb.a;
        List a2 = C6918mWa.a();
        if (qcb != null) {
            ueb = qcb.F();
        }
        ueb = a.a;
        C7478ueb ueb2 = ueb;
        if (qcb != null) {
            web = qcb.F();
        }
        web = b.a;
        C6739jrb jrb = r1;
        C6739jrb jrb2 = new C6739jrb(ssb, fdb, krb, ukb, qkb, ghb, aVar, srb, efb, vkb, a2, hdb, irb, ueb2, web, C6936mnb.b.a());
        this.a = jrb;
    }

    public final C6739jrb a() {
        return this.a;
    }
}
