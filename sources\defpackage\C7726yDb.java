package defpackage;

/* renamed from: yDb reason: default package and case insensitive filesystem */
/* compiled from: TemporalQueries */
class C7726yDb implements CDb<PBb> {
    C7726yDb() {
    }

    public PBb a(C7036oDb odb) {
        if (odb.b(C6423fDb.OFFSET_SECONDS)) {
            return PBb.a(odb.c(C6423fDb.OFFSET_SECONDS));
        }
        return null;
    }
}
