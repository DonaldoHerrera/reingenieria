package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/* renamed from: nCb reason: default package and case insensitive filesystem */
/* compiled from: HijrahEra */
public enum C6965nCb implements C6693jCb {
    BEFORE_AH,
    AH;

    public static C6965nCb a(int i) {
        if (i == 0) {
            return BEFORE_AH;
        }
        if (i == 1) {
            return AH;
        }
        throw new C5687cBb("HijrahEra not valid");
    }

    private Object writeReplace() {
        return new ACb(4, this);
    }

    public boolean b(C7381tDb tdb) {
        boolean z = true;
        if (tdb instanceof C6423fDb) {
            if (tdb != C6423fDb.ERA) {
                z = false;
            }
            return z;
        }
        if (tdb == null || !tdb.a(this)) {
            z = false;
        }
        return z;
    }

    public int c(C7381tDb tdb) {
        if (tdb == C6423fDb.ERA) {
            return getValue();
        }
        return a(tdb).a(d(tdb), tdb);
    }

    public long d(C7381tDb tdb) {
        if (tdb == C6423fDb.ERA) {
            return (long) getValue();
        }
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
    }

    public int getValue() {
        return ordinal();
    }

    public FDb a(C7381tDb tdb) {
        if (tdb == C6423fDb.ERA) {
            return FDb.a(1, 1);
        }
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public int b(int i) {
        return this == AH ? i : 1 - i;
    }

    public C6967nDb a(C6967nDb ndb) {
        return ndb.a((C7381tDb) C6423fDb.ERA, (long) getValue());
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.e()) {
            return C6491gDb.ERAS;
        }
        if (cDb == BDb.a() || cDb == BDb.f() || cDb == BDb.g() || cDb == BDb.d() || cDb == BDb.b() || cDb == BDb.c()) {
            return null;
        }
        return cDb.a(this);
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }

    static C6965nCb a(DataInput dataInput) throws IOException {
        return a((int) dataInput.readByte());
    }
}
