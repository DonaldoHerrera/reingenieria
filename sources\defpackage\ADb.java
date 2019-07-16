package defpackage;

/* renamed from: ADb reason: default package */
/* compiled from: TemporalQueries */
class ADb implements CDb<C7239rBb> {
    ADb() {
    }

    public C7239rBb a(C7036oDb odb) {
        if (odb.b(C6423fDb.NANO_OF_DAY)) {
            return C7239rBb.a(odb.d(C6423fDb.NANO_OF_DAY));
        }
        return null;
    }
}
