package defpackage;

import androidx.room.C;
import androidx.room.t;

/* renamed from: if reason: invalid class name and default package */
/* compiled from: WorkSpecDao_Impl */
class Cif extends C {
    final /* synthetic */ C1447kf d;

    Cif(C1447kf kfVar, t tVar) {
        this.d = kfVar;
        super(tVar);
    }

    public String c() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
