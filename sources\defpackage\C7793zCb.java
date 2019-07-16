package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/* renamed from: zCb reason: default package and case insensitive filesystem */
/* compiled from: MinguoEra */
public enum C7793zCb implements C6693jCb {
    BEFORE_ROC,
    ROC;

    public static C7793zCb a(int i) {
        if (i == 0) {
            return BEFORE_ROC;
        }
        if (i == 1) {
            return ROC;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid era: ");
        sb.append(i);
        throw new C5687cBb(sb.toString());
    }

    private Object writeReplace() {
        return new ACb(6, this);
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
            return tdb.range();
        }
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
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

    static C7793zCb a(DataInput dataInput) throws IOException {
        return a((int) dataInput.readByte());
    }
}
