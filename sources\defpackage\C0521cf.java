package defpackage;

import androidx.room.C;
import androidx.room.t;

/* renamed from: cf reason: default package and case insensitive filesystem */
/* compiled from: WorkSpecDao_Impl */
class C0521cf extends C {
    final /* synthetic */ C1447kf d;

    C0521cf(C1447kf kfVar, t tVar) {
        this.d = kfVar;
        super(tVar);
    }

    public String c() {
        return "DELETE FROM workspec WHERE id=?";
    }
}
