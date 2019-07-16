package defpackage;

import androidx.room.C;
import androidx.room.t;

/* renamed from: jf reason: default package and case insensitive filesystem */
/* compiled from: WorkSpecDao_Impl */
class C1416jf extends C {
    final /* synthetic */ C1447kf d;

    C1416jf(C1447kf kfVar, t tVar) {
        this.d = kfVar;
        super(tVar);
    }

    public String c() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
