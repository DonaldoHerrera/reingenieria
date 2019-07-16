package defpackage;

import androidx.room.C0434c;
import androidx.room.t;

/* renamed from: Xe reason: default package */
/* compiled from: WorkNameDao_Impl */
class Xe extends C0434c<Ve> {
    final /* synthetic */ Ye d;

    Xe(Ye ye, t tVar) {
        this.d = ye;
        super(tVar);
    }

    public String c() {
        return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
    }

    public void a(Yd yd, Ve ve) {
        String str = ve.a;
        if (str == null) {
            yd.c(1);
        } else {
            yd.a(1, str);
        }
        String str2 = ve.b;
        if (str2 == null) {
            yd.c(2);
        } else {
            yd.a(2, str2);
        }
    }
}
