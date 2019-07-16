package defpackage;

import androidx.room.C;
import androidx.room.t;

/* renamed from: ef reason: default package and case insensitive filesystem */
/* compiled from: WorkSpecDao_Impl */
class C1262ef extends C {
    final /* synthetic */ C1447kf d;

    C1262ef(C1447kf kfVar, t tVar) {
        this.d = kfVar;
        super(tVar);
    }

    public String c() {
        return "UPDATE workspec SET period_start_time=? WHERE id=?";
    }
}
