package androidx.work.impl;

import android.content.Context;
import androidx.room.s;
import androidx.room.t;
import androidx.room.t.a;
import androidx.room.t.b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends t {
    private static final long l = TimeUnit.DAYS.toMillis(7);

    public static WorkDatabase a(Context context, Executor executor, boolean z) {
        a aVar;
        if (z) {
            aVar = s.a(context, WorkDatabase.class);
            aVar.a();
        } else {
            a a = s.a(context, WorkDatabase.class, "androidx.work.workdb");
            a.a(executor);
            aVar = a;
        }
        aVar.a(o());
        aVar.a(k.a);
        aVar.a(new k.a(context, 2, 3));
        aVar.a(k.b);
        aVar.a(k.c);
        aVar.a(new k.a(context, 5, 6));
        aVar.c();
        return (WorkDatabase) aVar.b();
    }

    static b o() {
        return new g();
    }

    static long p() {
        return System.currentTimeMillis() - l;
    }

    static String q() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
        sb.append(p());
        sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return sb.toString();
    }

    public abstract Ne n();

    public abstract Re r();

    public abstract We s();

    public abstract C0305af t();

    public abstract C1509mf u();
}
