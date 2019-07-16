package defpackage;

import android.database.Cursor;
import androidx.room.C0434c;
import androidx.room.t;
import androidx.room.w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Pe reason: default package */
/* compiled from: DependencyDao_Impl */
public final class Pe implements Ne {
    private final t a;
    private final C0434c b;

    public Pe(t tVar) {
        this.a = tVar;
        this.b = new Oe(this, tVar);
    }

    public void a(Me me) {
        this.a.b();
        this.a.c();
        try {
            this.b.a(me);
            this.a.m();
        } finally {
            this.a.e();
        }
    }

    public boolean b(String str) {
        w a2 = w.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a2.c(1);
        } else {
            a2.a(1, str);
        }
        this.a.b();
        boolean z = false;
        Cursor a3 = Md.a(this.a, a2, false);
        try {
            if (a3.moveToFirst() && a3.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public boolean c(String str) {
        w a2 = w.a("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a2.c(1);
        } else {
            a2.a(1, str);
        }
        this.a.b();
        boolean z = false;
        Cursor a3 = Md.a(this.a, a2, false);
        try {
            if (a3.moveToFirst() && a3.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public List<String> a(String str) {
        w a2 = w.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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
