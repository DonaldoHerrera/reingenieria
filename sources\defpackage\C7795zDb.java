package defpackage;

/* renamed from: zDb reason: default package and case insensitive filesystem */
/* compiled from: TemporalQueries */
class C7795zDb implements CDb<C6827lBb> {
    C7795zDb() {
    }

    public C6827lBb a(C7036oDb odb) {
        if (odb.b(C6423fDb.EPOCH_DAY)) {
            return C6827lBb.c(odb.d(C6423fDb.EPOCH_DAY));
        }
        return null;
    }
}
