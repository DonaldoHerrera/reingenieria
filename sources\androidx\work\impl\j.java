package androidx.work.impl;

/* compiled from: WorkDatabaseMigrations */
class j extends Kd {
    j(int i, int i2) {
        super(i, i2);
    }

    public void a(Ud ud) {
        ud.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        ud.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
