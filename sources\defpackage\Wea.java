package defpackage;

/* renamed from: Wea reason: default package */
/* compiled from: LegacyTables */
public final class Wea {

    @Deprecated
    /* renamed from: Wea$a */
    /* compiled from: LegacyTables */
    static class a extends Yea {
        public static final a c = new a();
        public static final C5085LLa d = C5085LLa.a(c, "entity_id", Long.class);
        public static final C5085LLa e = C5085LLa.a(c, "entity_type", Long.class);
        public static final C5085LLa f = C5085LLa.a(c, "reposter_id", Long.class);
        public static final C5085LLa g = C5085LLa.a(c, "related_entity", String.class);
        public static final C5085LLa h = C5085LLa.a(c, "source", String.class);
        public static final C5085LLa i = C5085LLa.a(c, "source_version", String.class);
        public static final C5085LLa j = C5085LLa.a(c, "source_urn", String.class);
        public static final C5085LLa k = C5085LLa.a(c, "query_urn", String.class);
        public static final C5085LLa l = C5085LLa.a(c, "context_type", String.class);
        public static final C5085LLa m = C5085LLa.a(c, "context_urn", String.class);
        public static final C5085LLa n = C5085LLa.a(c, "context_query", String.class);
        public static final C5085LLa o = C5085LLa.a(c, "played", Boolean.class);

        a() {
            super("PlayQueue", defpackage.C5116MLa.a.a("_id"));
        }

        /* access modifiers changed from: protected */
        public String b() {
            return "CREATE TABLE IF NOT EXISTS PlayQueue (_id INTEGER PRIMARY KEY AUTOINCREMENT,entity_id INTEGER,entity_type INTEGER,reposter_id INTEGER,related_entity TEXT,source TEXT,source_version TEXT,source_urn TEXT,query_urn TEXT,context_type TEXT,context_urn TEXT,context_query TEXT,played BOOLEAN default 1);";
        }
    }
}
