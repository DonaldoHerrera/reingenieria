package defpackage;

import androidx.room.C;
import androidx.room.t;

/* renamed from: df reason: default package and case insensitive filesystem */
/* compiled from: WorkSpecDao_Impl */
class C1232df extends C {
    final /* synthetic */ C1447kf d;

    C1232df(C1447kf kfVar, t tVar) {
        this.d = kfVar;
        super(tVar);
    }

    public String c() {
        return "UPDATE workspec SET output=? WHERE id=?";
    }
}
