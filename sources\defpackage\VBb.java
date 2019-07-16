package defpackage;

import defpackage.XBb;
import java.io.Serializable;

/* renamed from: VBb reason: default package */
/* compiled from: ChronoDateImpl */
abstract class VBb<D extends XBb> extends XBb implements C6967nDb, C7105pDb, Serializable {
    VBb() {
    }

    /* access modifiers changed from: 0000 */
    public abstract VBb<D> a(long j);

    public ZBb<?> a(C7239rBb rbb) {
        return C5553aCb.a(this, rbb);
    }

    /* access modifiers changed from: 0000 */
    public abstract VBb<D> b(long j);

    /* access modifiers changed from: 0000 */
    public abstract VBb<D> c(long j);

    public VBb<D> b(long j, DDb dDb) {
        if (!(dDb instanceof C6491gDb)) {
            return (VBb) getChronology().a(dDb.a(this, j));
        }
        switch (UBb.a[((C6491gDb) dDb).ordinal()]) {
            case 1:
                return a(j);
            case 2:
                return a(C6355eDb.b(j, 7));
            case 3:
                return b(j);
            case 4:
                return c(j);
            case 5:
                return c(C6355eDb.b(j, 10));
            case 6:
                return c(C6355eDb.b(j, 100));
            case 7:
                return c(C6355eDb.b(j, 1000));
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(dDb);
                sb.append(" not valid for chronology ");
                sb.append(getChronology().getId());
                throw new C5687cBb(sb.toString());
        }
    }
}
