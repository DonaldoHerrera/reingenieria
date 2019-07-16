package defpackage;

import androidx.room.C0434c;
import androidx.room.t;

/* renamed from: Oe reason: default package */
/* compiled from: DependencyDao_Impl */
class Oe extends C0434c<Me> {
    final /* synthetic */ Pe d;

    Oe(Pe pe, t tVar) {
        this.d = pe;
        super(tVar);
    }

    public String c() {
        return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    public void a(Yd yd, Me me) {
        String str = me.a;
        if (str == null) {
            yd.c(1);
        } else {
            yd.a(1, str);
        }
        String str2 = me.b;
        if (str2 == null) {
            yd.c(2);
        } else {
            yd.a(2, str2);
        }
    }
}
