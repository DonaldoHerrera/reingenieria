package defpackage;

/* renamed from: tba reason: default package and case insensitive filesystem */
/* compiled from: FollowingDatabaseOpenHelper.kt */
public final class C3877tba extends a {
    public C3877tba() {
        super(1);
    }

    public void b(Ud ud, int i, int i2) {
        C7471uYa.b(ud, "db");
    }

    public void c(Ud ud) {
        C7471uYa.b(ud, "db");
        ud.g("CREATE TABLE following (\n    user_urn TEXT NOT NULL,\n    position INTEGER NOT NULL DEFAULT 0,\n    added_at INTEGER,\n    removed_at INTEGER,\n    PRIMARY KEY(user_urn) ON CONFLICT REPLACE\n)");
    }
}
