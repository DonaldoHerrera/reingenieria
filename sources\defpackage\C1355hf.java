package defpackage;

import androidx.room.C;
import androidx.room.t;

/* renamed from: hf reason: default package and case insensitive filesystem */
/* compiled from: WorkSpecDao_Impl */
class C1355hf extends C {
    final /* synthetic */ C1447kf d;

    C1355hf(C1447kf kfVar, t tVar) {
        this.d = kfVar;
        super(tVar);
    }

    public String c() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
