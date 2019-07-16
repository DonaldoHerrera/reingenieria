package defpackage;

import androidx.room.C;
import androidx.room.t;

/* renamed from: Te reason: default package */
/* compiled from: SystemIdInfoDao_Impl */
class Te extends C {
    final /* synthetic */ Ue d;

    Te(Ue ue, t tVar) {
        this.d = ue;
        super(tVar);
    }

    public String c() {
        return "DELETE FROM SystemIdInfo where work_spec_id=?";
    }
}
