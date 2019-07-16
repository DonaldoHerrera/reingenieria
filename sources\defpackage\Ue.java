package defpackage;

import android.database.Cursor;
import androidx.room.C;
import androidx.room.C0434c;
import androidx.room.t;
import androidx.room.w;

/* renamed from: Ue reason: default package */
/* compiled from: SystemIdInfoDao_Impl */
public final class Ue implements Re {
    private final t a;
    private final C0434c b;
    private final C c;

    public Ue(t tVar) {
        this.a = tVar;
        this.b = new Se(this, tVar);
        this.c = new Te(this, tVar);
    }

    public void a(Qe qe) {
        this.a.b();
        this.a.c();
        try {
            this.b.a(qe);
            this.a.m();
        } finally {
            this.a.e();
        }
    }

    public void b(String str) {
        this.a.b();
        Yd a2 = this.c.a();
        if (str == null) {
            a2.c(1);
        } else {
            a2.a(1, str);
        }
        this.a.c();
        try {
            a2.v();
            this.a.m();
        } finally {
            this.a.e();
            this.c.a(a2);
        }
    }

    public Qe a(String str) {
        w a2 = w.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a2.c(1);
        } else {
            a2.a(1, str);
        }
        this.a.b();
        Cursor a3 = Md.a(this.a, a2, false);
        try {
            return a3.moveToFirst() ? new Qe(a3.getString(Ld.b(a3, "work_spec_id")), a3.getInt(Ld.b(a3, "system_id"))) : null;
        } finally {
            a3.close();
            a2.b();
        }
    }
}
