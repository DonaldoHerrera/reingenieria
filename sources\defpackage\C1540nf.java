package defpackage;

import androidx.room.C0434c;
import androidx.room.t;

/* renamed from: nf reason: default package and case insensitive filesystem */
/* compiled from: WorkTagDao_Impl */
class C1540nf extends C0434c<C1478lf> {
    final /* synthetic */ C1571of d;

    C1540nf(C1571of ofVar, t tVar) {
        this.d = ofVar;
        super(tVar);
    }

    public String c() {
        return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
    }

    public void a(Yd yd, C1478lf lfVar) {
        String str = lfVar.a;
        if (str == null) {
            yd.c(1);
        } else {
            yd.a(1, str);
        }
        String str2 = lfVar.b;
        if (str2 == null) {
            yd.c(2);
        } else {
            yd.a(2, str2);
        }
    }
}
