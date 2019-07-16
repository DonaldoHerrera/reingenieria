package defpackage;

/* renamed from: fca reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueDatabaseOpenHelper.kt */
public final class C3766fca extends a {
    public C3766fca() {
        super(1);
    }

    public void b(Ud ud, int i, int i2) {
        C7471uYa.b(ud, "db");
    }

    public void c(Ud ud) {
        C7471uYa.b(ud, "db");
        ud.g("CREATE TABLE play_queue (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    entity_id INTEGER,\n    entity_type INTEGER,\n    reposter_id INTEGER,\n    related_entity TEXT,\n    source TEXT,\n    source_version TEXT,\n    source_urn TEXT,\n    query_urn TEXT,\n    context_type TEXT,\n    context_urn TEXT,\n    context_query TEXT,\n    played INTEGER default 1\n)");
    }
}
