package defpackage;

import androidx.room.C;
import androidx.room.t;

/* renamed from: ff reason: default package and case insensitive filesystem */
/* compiled from: WorkSpecDao_Impl */
class C1293ff extends C {
    final /* synthetic */ C1447kf d;

    C1293ff(C1447kf kfVar, t tVar) {
        this.d = kfVar;
        super(tVar);
    }

    public String c() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
