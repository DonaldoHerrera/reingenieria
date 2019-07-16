package defpackage;

import android.database.Cursor;
import androidx.room.C0434c;
import androidx.room.t;
import androidx.room.w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: of reason: default package and case insensitive filesystem */
/* compiled from: WorkTagDao_Impl */
public final class C1571of implements C1509mf {
    private final t a;
    private final C0434c b;

    public C1571of(t tVar) {
        this.a = tVar;
        this.b = new C1540nf(this, tVar);
    }

    public void a(C1478lf lfVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.a(lfVar);
            this.a.m();
        } finally {
            this.a.e();
        }
    }

    public List<String> a(String str) {
        w a2 = w.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a2.c(1);
        } else {
            a2.a(1, str);
        }
        this.a.b();
        Cursor a3 = Md.a(this.a, a2, false);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(a3.getString(0));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.b();
        }
    }
}
