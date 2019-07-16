package defpackage;

/* renamed from: pCb reason: default package and case insensitive filesystem */
/* compiled from: IsoEra */
public enum C7103pCb implements C6693jCb {
    BCE,
    CE;

    public static C7103pCb a(int i) {
        if (i == 0) {
            return BCE;
        }
        if (i == 1) {
            return CE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid era: ");
        sb.append(i);
        throw new C5687cBb(sb.toString());
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
}
