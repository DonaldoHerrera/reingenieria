package defpackage;

/* renamed from: bDb reason: default package and case insensitive filesystem */
/* compiled from: DefaultInterfaceEra */
public abstract class C5623bDb extends C6287dDb implements C6693jCb {
    public C6967nDb a(C6967nDb ndb) {
        return ndb.a((C7381tDb) C6423fDb.ERA, (long) getValue());
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
