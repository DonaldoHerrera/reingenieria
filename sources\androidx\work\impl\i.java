package androidx.work.impl;

import android.os.Build.VERSION;

/* compiled from: WorkDatabaseMigrations */
class i extends Kd {
    i(int i, int i2) {
        super(i, i2);
    }

    public void a(Ud ud) {
        if (VERSION.SDK_INT >= 23) {
            ud.g("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }
}
