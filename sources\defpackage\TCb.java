package defpackage;

/* renamed from: TCb reason: default package */
/* compiled from: DateTimePrintContext */
class TCb extends C6287dDb {
    final /* synthetic */ XBb a;
    final /* synthetic */ C7036oDb b;
    final /* synthetic */ C6625iCb c;
    final /* synthetic */ NBb d;

    TCb(XBb xBb, C7036oDb odb, C6625iCb icb, NBb nBb) {
        this.a = xBb;
        this.b = odb;
        this.c = icb;
        this.d = nBb;
    }

    public FDb a(C7381tDb tdb) {
        if (this.a == null || !tdb.isDateBased()) {
            return this.b.a(tdb);
        }
        return this.a.a(tdb);
    }

    public boolean b(C7381tDb tdb) {
        if (this.a == null || !tdb.isDateBased()) {
            return this.b.b(tdb);
        }
        return this.a.b(tdb);
    }

    public long d(C7381tDb tdb) {
        if (this.a == null || !tdb.isDateBased()) {
            return this.b.d(tdb);
        }
        return this.a.d(tdb);
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.a()) {
            return this.c;
        }
        if (cDb == BDb.g()) {
            return this.d;
        }
        if (cDb == BDb.e()) {
            return this.b.a(cDb);
        }
        return cDb.a(this);
    }
}
