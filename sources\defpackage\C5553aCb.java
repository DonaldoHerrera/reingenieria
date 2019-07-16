package defpackage;

import com.google.common.base.Ascii;
import defpackage.XBb;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: aCb reason: default package and case insensitive filesystem */
/* compiled from: ChronoLocalDateTimeImpl */
final class C5553aCb<D extends XBb> extends ZBb<D> implements C6967nDb, C7105pDb, Serializable {
    private final D b;
    private final C7239rBb c;

    private C5553aCb(D d, C7239rBb rbb) {
        C6355eDb.a(d, "date");
        C6355eDb.a(rbb, "time");
        this.b = d;
        this.c = rbb;
    }

    private C5553aCb<D> e(long j) {
        return a(this.b, 0, 0, 0, j);
    }

    static ZBb<?> readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((XBb) objectInput.readObject()).a((C7239rBb) objectInput.readObject());
    }

    private Object writeReplace() {
        return new ACb(Ascii.FF, this);
    }

    public int c(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return a(tdb).a(d(tdb), tdb);
        }
        return tdb.isTimeBased() ? this.c.c(tdb) : this.b.c(tdb);
    }

    public long d(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        return tdb.isTimeBased() ? this.c.d(tdb) : this.b.d(tdb);
    }

    public D toLocalDate() {
        return this.b;
    }

    public C7239rBb toLocalTime() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }

    public boolean b(C7381tDb tdb) {
        boolean z = true;
        if (tdb instanceof C6423fDb) {
            if (!tdb.isDateBased() && !tdb.isTimeBased()) {
                z = false;
            }
            return z;
        }
        if (tdb == null || !tdb.a(this)) {
            z = false;
        }
        return z;
    }

    private C5553aCb<D> c(long j) {
        return a(this.b, j, 0, 0, 0);
    }

    private C5553aCb<D> d(long j) {
        return a(this.b, 0, j, 0, 0);
    }

    static <R extends XBb> C5553aCb<R> a(R r, C7239rBb rbb) {
        return new C5553aCb<>(r, rbb);
    }

    private C5553aCb<D> a(C6967nDb ndb, C7239rBb rbb) {
        if (this.b == ndb && this.c == rbb) {
            return this;
        }
        return new C5553aCb<>(this.b.getChronology().a(ndb), rbb);
    }

    public C5553aCb<D> b(long j, DDb dDb) {
        if (!(dDb instanceof C6491gDb)) {
            return this.b.getChronology().b(dDb.a(this, j));
        }
        switch (_Bb.a[((C6491gDb) dDb).ordinal()]) {
            case 1:
                return e(j);
            case 2:
                return b(j / 86400000000L).e((j % 86400000000L) * 1000);
            case 3:
                return b(j / 86400000).e((j % 86400000) * 1000000);
            case 4:
                return a(j);
            case 5:
                return d(j);
            case 6:
                return c(j);
            case 7:
                return b(j / 256).c((j % 256) * 12);
            default:
                return a((C6967nDb) this.b.b(j, dDb), this.c);
        }
    }

    public FDb a(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        return tdb.isTimeBased() ? this.c.a(tdb) : this.b.a(tdb);
    }

    public C5553aCb<D> a(C7105pDb pdb) {
        if (pdb instanceof XBb) {
            return a((C6967nDb) (XBb) pdb, this.c);
        }
        if (pdb instanceof C7239rBb) {
            return a((C6967nDb) this.b, (C7239rBb) pdb);
        }
        if (pdb instanceof C5553aCb) {
            return this.b.getChronology().b((C6967nDb) (C5553aCb) pdb);
        }
        return this.b.getChronology().b((C6967nDb) (C5553aCb) pdb.a(this));
    }

    private C5553aCb<D> b(long j) {
        return a((C6967nDb) this.b.b(j, (DDb) C6491gDb.DAYS), this.c);
    }

    public C5553aCb<D> a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return this.b.getChronology().b(tdb.a(this, j));
        }
        if (tdb.isTimeBased()) {
            return a((C6967nDb) this.b, this.c.a(tdb, j));
        }
        return a((C6967nDb) this.b.a(tdb, j), this.c);
    }

    /* access modifiers changed from: 0000 */
    public C5553aCb<D> a(long j) {
        return a(this.b, 0, 0, j, 0);
    }

    private C5553aCb<D> a(D d, long j, long j2, long j3, long j4) {
        D d2 = d;
        if ((j | j2 | j3 | j4) == 0) {
            return a((C6967nDb) d2, this.c);
        }
        long j5 = (j4 / 86400000000000L) + (j3 / 86400) + (j2 / 1440) + (j / 24);
        long j6 = (j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L);
        long M = this.c.M();
        long j7 = j6 + M;
        long b2 = j5 + C6355eDb.b(j7, 86400000000000L);
        long c2 = C6355eDb.c(j7, 86400000000000L);
        return a((C6967nDb) d2.b(b2, (DDb) C6491gDb.DAYS), c2 == M ? this.c : C7239rBb.a(c2));
    }

    public C6353eCb<D> a(NBb nBb) {
        return C6489gCb.a(this, nBb, (PBb) null);
    }
}
