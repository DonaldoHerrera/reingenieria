package defpackage;

/* renamed from: dDb reason: default package and case insensitive filesystem */
/* compiled from: DefaultInterfaceTemporalAccessor */
public abstract class C6287dDb implements C7036oDb {
    public FDb a(C7381tDb tdb) {
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        if (b(tdb)) {
            return tdb.range();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
    }

    public int c(C7381tDb tdb) {
        return a(tdb).a(d(tdb), tdb);
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.g() || cDb == BDb.a() || cDb == BDb.e()) {
            return null;
        }
        return cDb.a(this);
    }
}
