package defpackage;

import java.util.Locale;

/* renamed from: UCb reason: default package */
/* compiled from: DateTimePrintContext */
final class UCb {
    private C7036oDb a;
    private Locale b;
    private WCb c;
    private int d;

    UCb(C7036oDb odb, JCb jCb) {
        this.a = a(odb, jCb);
        this.b = jCb.c();
        this.c = jCb.b();
    }

    private static C7036oDb a(C7036oDb odb, JCb jCb) {
        C6625iCb a2 = jCb.a();
        NBb d2 = jCb.d();
        if (a2 == null && d2 == null) {
            return odb;
        }
        C6625iCb icb = (C6625iCb) odb.a(BDb.a());
        NBb nBb = (NBb) odb.a(BDb.g());
        XBb xBb = null;
        if (C6355eDb.a((Object) icb, (Object) a2)) {
            a2 = null;
        }
        if (C6355eDb.a((Object) nBb, (Object) d2)) {
            d2 = null;
        }
        if (a2 == null && d2 == null) {
            return odb;
        }
        C6625iCb icb2 = a2 != null ? a2 : icb;
        if (d2 != null) {
            nBb = d2;
        }
        String str = " ";
        if (d2 != null) {
            if (odb.b(C6423fDb.INSTANT_SECONDS)) {
                if (icb2 == null) {
                    icb2 = C7034oCb.e;
                }
                return icb2.a(C6623iBb.a(odb), d2);
            }
            NBb c2 = d2.c();
            PBb pBb = (PBb) odb.a(BDb.d());
            if ((c2 instanceof PBb) && pBb != null && !c2.equals(pBb)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid override zone for temporal: ");
                sb.append(d2);
                sb.append(str);
                sb.append(odb);
                throw new C5687cBb(sb.toString());
            }
        }
        if (a2 != null) {
            if (odb.b(C6423fDb.EPOCH_DAY)) {
                xBb = icb2.a(odb);
            } else if (!(a2 == C7034oCb.e && icb == null)) {
                C6423fDb[] values = C6423fDb.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    C6423fDb fdb = values[i];
                    if (!fdb.isDateBased() || !odb.b(fdb)) {
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid override chronology for temporal: ");
                        sb2.append(a2);
                        sb2.append(str);
                        sb2.append(odb);
                        throw new C5687cBb(sb2.toString());
                    }
                }
            }
        }
        return new TCb(xBb, odb, icb2, nBb);
    }

    /* access modifiers changed from: 0000 */
    public Locale b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public WCb c() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public C7036oDb d() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.d++;
    }

    public String toString() {
        return this.a.toString();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.d--;
    }

    /* access modifiers changed from: 0000 */
    public <R> R a(CDb<R> cDb) {
        R a2 = this.a.a(cDb);
        if (a2 != null || this.d != 0) {
            return a2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to extract value: ");
        sb.append(this.a.getClass());
        throw new C5687cBb(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public Long a(C7381tDb tdb) {
        try {
            return Long.valueOf(this.a.d(tdb));
        } catch (C5687cBb e) {
            if (this.d > 0) {
                return null;
            }
            throw e;
        }
    }
}
