package defpackage;

import androidx.room.C0434c;
import androidx.room.t;

/* renamed from: Se reason: default package */
/* compiled from: SystemIdInfoDao_Impl */
class Se extends C0434c<Qe> {
    final /* synthetic */ Ue d;

    Se(Ue ue, t tVar) {
        this.d = ue;
        super(tVar);
    }

    public String c() {
        return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
    }

    public void a(Yd yd, Qe qe) {
        String str = qe.a;
        if (str == null) {
            yd.c(1);
        } else {
            yd.a(1, str);
        }
        yd.a(2, (long) qe.b);
    }
}
