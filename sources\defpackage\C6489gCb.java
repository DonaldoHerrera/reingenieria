package defpackage;

import com.google.common.base.Ascii;
import defpackage.XBb;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;

/* renamed from: gCb reason: default package and case insensitive filesystem */
/* compiled from: ChronoZonedDateTimeImpl */
final class C6489gCb<D extends XBb> extends C6353eCb<D> implements Serializable {
    private final C5553aCb<D> b;
    private final PBb c;
    private final NBb d;

    private C6489gCb(C5553aCb<D> acb, PBb pBb, NBb nBb) {
        C6355eDb.a(acb, "dateTime");
        this.b = acb;
        C6355eDb.a(pBb, "offset");
        this.c = pBb;
        C6355eDb.a(nBb, "zone");
        this.d = nBb;
    }

    static C6353eCb<?> readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        ZBb zBb = (ZBb) objectInput.readObject();
        PBb pBb = (PBb) objectInput.readObject();
        return zBb.a((NBb) pBb).a((NBb) objectInput.readObject());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new ACb(Ascii.CR, this);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6353eCb)) {
            return false;
        }
        if (compareTo((C6353eCb) obj) != 0) {
            z = false;
        }
        return z;
    }

    public PBb getOffset() {
        return this.c;
    }

    public NBb getZone() {
        return this.d;
    }

    public int hashCode() {
        return (toLocalDateTime().hashCode() ^ getOffset().hashCode()) ^ Integer.rotateLeft(getZone().hashCode(), 3);
    }

    public ZBb<D> toLocalDateTime() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toLocalDateTime().toString());
        sb.append(getOffset().toString());
        String sb2 = sb.toString();
        if (getOffset() == getZone()) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append('[');
        sb3.append(getZone().toString());
        sb3.append(']');
        return sb3.toString();
    }

    /* access modifiers changed from: 0000 */
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
        objectOutput.writeObject(this.d);
    }

    static <R extends XBb> C6353eCb<R> a(C5553aCb<R> acb, NBb nBb, PBb pBb) {
        C6355eDb.a(acb, "localDateTime");
        C6355eDb.a(nBb, "zone");
        if (nBb instanceof PBb) {
            return new C6489gCb(acb, (PBb) nBb, nBb);
        }
        NDb b2 = nBb.b();
        C7032oBb a = C7032oBb.a((C7036oDb) acb);
        List b3 = b2.b(a);
        if (b3.size() == 1) {
            pBb = (PBb) b3.get(0);
        } else if (b3.size() == 0) {
            KDb a2 = b2.a(a);
            acb = acb.a(a2.c().a());
            pBb = a2.e();
        } else if (pBb == null || !b3.contains(pBb)) {
            pBb = (PBb) b3.get(0);
        }
        C6355eDb.a(pBb, "offset");
        return new C6489gCb(acb, pBb, nBb);
    }

    public boolean b(C7381tDb tdb) {
        return (tdb instanceof C6423fDb) || (tdb != null && tdb.a(this));
    }

    public C6353eCb<D> b(long j, DDb dDb) {
        if (dDb instanceof C6491gDb) {
            return a((C7105pDb) this.b.b(j, dDb));
        }
        return toLocalDate().getChronology().c(dDb.a(this, j));
    }

    static <R extends XBb> C6489gCb<R> a(C6625iCb icb, C6623iBb ibb, NBb nBb) {
        PBb a = nBb.b().a(ibb);
        C6355eDb.a(a, "offset");
        return new C6489gCb<>((C5553aCb) icb.c((C7036oDb) C7032oBb.a(ibb.J(), ibb.K(), a)), a, nBb);
    }

    private C6489gCb<D> a(C6623iBb ibb, NBb nBb) {
        return a(toLocalDate().getChronology(), ibb, nBb);
    }

    public C6353eCb<D> a(NBb nBb) {
        return a(this.b, nBb, this.c);
    }

    public C6353eCb<D> a(C7381tDb tdb, long j) {
        if (!(tdb instanceof C6423fDb)) {
            return toLocalDate().getChronology().c(tdb.a(this, j));
        }
        C6423fDb fdb = (C6423fDb) tdb;
        int i = C6421fCb.a[fdb.ordinal()];
        if (i == 1) {
            return b(j - toEpochSecond(), (DDb) C6491gDb.SECONDS);
        }
        if (i != 2) {
            return a(this.b.a(tdb, j), this.d, this.c);
        }
        return a(this.b.b(PBb.a(fdb.a(j))), this.d);
    }
}
