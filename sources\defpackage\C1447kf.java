package defpackage;

import android.database.Cursor;
import androidx.room.C;
import androidx.room.C0434c;
import androidx.room.t;
import androidx.room.w;
import androidx.work.c;
import androidx.work.e;
import androidx.work.q.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: kf reason: default package and case insensitive filesystem */
/* compiled from: WorkSpecDao_Impl */
public final class C1447kf implements C0305af {
    private final t a;
    private final C0434c b;
    private final C c;
    private final C d;
    private final C e;
    private final C f;
    private final C g;
    private final C h;
    private final C i;
    private final C j;

    public C1447kf(t tVar) {
        this.a = tVar;
        this.b = new C0490bf(this, tVar);
        this.c = new C0521cf(this, tVar);
        this.d = new C1232df(this, tVar);
        this.e = new C1262ef(this, tVar);
        this.f = new C1293ff(this, tVar);
        this.g = new C1324gf(this, tVar);
        this.h = new C1355hf(this, tVar);
        this.i = new Cif(this, tVar);
        this.j = new C1416jf(this, tVar);
    }

    public void a(_e _eVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.a(_eVar);
            this.a.m();
        } finally {
            this.a.e();
        }
    }

    public void b(String str, long j2) {
        this.a.b();
        Yd a2 = this.e.a();
        a2.a(1, j2);
        if (str == null) {
            a2.c(2);
        } else {
            a2.a(2, str);
        }
        this.a.c();
        try {
            a2.v();
            this.a.m();
        } finally {
            this.a.e();
            this.e.a(a2);
        }
    }

    public _e c(String str) {
        w wVar;
        _e _eVar;
        String str2 = str;
        w a2 = w.a("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            a2.c(1);
        } else {
            a2.a(1, str2);
        }
        this.a.b();
        Cursor a3 = Md.a(this.a, a2, false);
        try {
            int b2 = Ld.b(a3, "id");
            int b3 = Ld.b(a3, "state");
            int b4 = Ld.b(a3, "worker_class_name");
            int b5 = Ld.b(a3, "input_merger_class_name");
            int b6 = Ld.b(a3, "input");
            int b7 = Ld.b(a3, "output");
            int b8 = Ld.b(a3, "initial_delay");
            int b9 = Ld.b(a3, "interval_duration");
            int b10 = Ld.b(a3, "flex_duration");
            int b11 = Ld.b(a3, "run_attempt_count");
            int b12 = Ld.b(a3, "backoff_policy");
            int b13 = Ld.b(a3, "backoff_delay_duration");
            int b14 = Ld.b(a3, "period_start_time");
            int b15 = Ld.b(a3, "minimum_retention_duration");
            wVar = a2;
            try {
                int b16 = Ld.b(a3, "schedule_requested_at");
                int b17 = Ld.b(a3, "required_network_type");
                int i2 = b15;
                int b18 = Ld.b(a3, "requires_charging");
                int i3 = b14;
                int b19 = Ld.b(a3, "requires_device_idle");
                int i4 = b13;
                int b20 = Ld.b(a3, "requires_battery_not_low");
                int i5 = b12;
                int b21 = Ld.b(a3, "requires_storage_not_low");
                int i6 = b11;
                int b22 = Ld.b(a3, "trigger_content_update_delay");
                int i7 = b10;
                int b23 = Ld.b(a3, "trigger_max_content_delay");
                int i8 = b9;
                int b24 = Ld.b(a3, "content_uri_triggers");
                if (a3.moveToFirst()) {
                    String string = a3.getString(b2);
                    String string2 = a3.getString(b4);
                    int i9 = b8;
                    c cVar = new c();
                    cVar.a(C1632qf.b(a3.getInt(b17)));
                    cVar.b(a3.getInt(b18) != 0);
                    cVar.c(a3.getInt(b19) != 0);
                    cVar.a(a3.getInt(b20) != 0);
                    cVar.d(a3.getInt(b21) != 0);
                    cVar.a(a3.getLong(b22));
                    cVar.b(a3.getLong(b23));
                    cVar.a(C1632qf.a(a3.getBlob(b24)));
                    _eVar = new _e(string, string2);
                    _eVar.d = C1632qf.c(a3.getInt(b3));
                    _eVar.f = a3.getString(b5);
                    _eVar.g = e.b(a3.getBlob(b6));
                    _eVar.h = e.b(a3.getBlob(b7));
                    _eVar.i = a3.getLong(i9);
                    _eVar.j = a3.getLong(i8);
                    _eVar.k = a3.getLong(i7);
                    _eVar.m = a3.getInt(i6);
                    _eVar.n = C1632qf.a(a3.getInt(i5));
                    _eVar.o = a3.getLong(i4);
                    _eVar.p = a3.getLong(i3);
                    _eVar.q = a3.getLong(i2);
                    _eVar.r = a3.getLong(b16);
                    _eVar.l = cVar;
                } else {
                    _eVar = null;
                }
                a3.close();
                wVar.b();
                return _eVar;
            } catch (Throwable th) {
                th = th;
                a3.close();
                wVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wVar = a2;
            a3.close();
            wVar.b();
            throw th;
        }
    }

    public List<String> d(String str) {
        w a2 = w.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
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

    public void delete(String str) {
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

    public List<e> e(String str) {
        w a2 = w.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
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
                arrayList.add(e.b(a3.getBlob(0)));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public List<a> f(String str) {
        w a2 = w.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a2.c(1);
        } else {
            a2.a(1, str);
        }
        this.a.b();
        Cursor a3 = Md.a(this.a, a2, false);
        try {
            int b2 = Ld.b(a3, "id");
            int b3 = Ld.b(a3, "state");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                a aVar = new a();
                aVar.a = a3.getString(b2);
                aVar.b = C1632qf.c(a3.getInt(b3));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public int g(String str) {
        this.a.b();
        Yd a2 = this.g.a();
        if (str == null) {
            a2.c(1);
        } else {
            a2.a(1, str);
        }
        this.a.c();
        try {
            int v = a2.v();
            this.a.m();
            return v;
        } finally {
            this.a.e();
            this.g.a(a2);
        }
    }

    public List<b> h(String str) {
        Cursor a2;
        w a3 = w.a("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            a3.c(1);
        } else {
            a3.a(1, str);
        }
        this.a.b();
        this.a.c();
        try {
            a2 = Md.a(this.a, a3, true);
            int b2 = Ld.b(a2, "id");
            int b3 = Ld.b(a2, "state");
            int b4 = Ld.b(a2, "output");
            int b5 = Ld.b(a2, "run_attempt_count");
            T t = new T();
            while (a2.moveToNext()) {
                if (!a2.isNull(b2)) {
                    String string = a2.getString(b2);
                    if (((ArrayList) t.get(string)) == null) {
                        t.put(string, new ArrayList());
                    }
                }
            }
            a2.moveToPosition(-1);
            a(t);
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                ArrayList arrayList2 = null;
                if (!a2.isNull(b2)) {
                    arrayList2 = (ArrayList) t.get(a2.getString(b2));
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                b bVar = new b();
                bVar.a = a2.getString(b2);
                bVar.b = C1632qf.c(a2.getInt(b3));
                bVar.c = e.b(a2.getBlob(b4));
                bVar.d = a2.getInt(b5);
                bVar.e = arrayList2;
                arrayList.add(bVar);
            }
            this.a.m();
            a2.close();
            a3.b();
            this.a.e();
            return arrayList;
        } catch (Throwable th) {
            this.a.e();
            throw th;
        }
    }

    public int i(String str) {
        this.a.b();
        Yd a2 = this.f.a();
        if (str == null) {
            a2.c(1);
        } else {
            a2.a(1, str);
        }
        this.a.c();
        try {
            int v = a2.v();
            this.a.m();
            return v;
        } finally {
            this.a.e();
            this.f.a(a2);
        }
    }

    public void a(String str, e eVar) {
        this.a.b();
        Yd a2 = this.d.a();
        byte[] a3 = e.a(eVar);
        if (a3 == null) {
            a2.c(1);
        } else {
            a2.a(1, a3);
        }
        if (str == null) {
            a2.c(2);
        } else {
            a2.a(2, str);
        }
        this.a.c();
        try {
            a2.v();
            this.a.m();
        } finally {
            this.a.e();
            this.d.a(a2);
        }
    }

    public int b() {
        this.a.b();
        Yd a2 = this.i.a();
        this.a.c();
        try {
            int v = a2.v();
            this.a.m();
            return v;
        } finally {
            this.a.e();
            this.i.a(a2);
        }
    }

    public List<String> d() {
        w a2 = w.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
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

    public int a(String str, long j2) {
        this.a.b();
        Yd a2 = this.h.a();
        a2.a(1, j2);
        if (str == null) {
            a2.c(2);
        } else {
            a2.a(2, str);
        }
        this.a.c();
        try {
            int v = a2.v();
            this.a.m();
            return v;
        } finally {
            this.a.e();
            this.h.a(a2);
        }
    }

    public a b(String str) {
        w a2 = w.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a2.c(1);
        } else {
            a2.a(1, str);
        }
        this.a.b();
        Cursor a3 = Md.a(this.a, a2, false);
        try {
            return a3.moveToFirst() ? C1632qf.c(a3.getInt(0)) : null;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public List<String> a(String str) {
        w a2 = w.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
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

    public List<_e> a(int i2) {
        w wVar;
        w a2 = w.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a2.a(1, (long) i2);
        this.a.b();
        Cursor a3 = Md.a(this.a, a2, false);
        try {
            int b2 = Ld.b(a3, "id");
            int b3 = Ld.b(a3, "state");
            int b4 = Ld.b(a3, "worker_class_name");
            int b5 = Ld.b(a3, "input_merger_class_name");
            int b6 = Ld.b(a3, "input");
            int b7 = Ld.b(a3, "output");
            int b8 = Ld.b(a3, "initial_delay");
            int b9 = Ld.b(a3, "interval_duration");
            int b10 = Ld.b(a3, "flex_duration");
            int b11 = Ld.b(a3, "run_attempt_count");
            int b12 = Ld.b(a3, "backoff_policy");
            int b13 = Ld.b(a3, "backoff_delay_duration");
            int b14 = Ld.b(a3, "period_start_time");
            int b15 = Ld.b(a3, "minimum_retention_duration");
            wVar = a2;
            try {
                int b16 = Ld.b(a3, "schedule_requested_at");
                int b17 = Ld.b(a3, "required_network_type");
                int i3 = b15;
                int b18 = Ld.b(a3, "requires_charging");
                int i4 = b14;
                int b19 = Ld.b(a3, "requires_device_idle");
                int i5 = b13;
                int b20 = Ld.b(a3, "requires_battery_not_low");
                int i6 = b12;
                int b21 = Ld.b(a3, "requires_storage_not_low");
                int i7 = b11;
                int b22 = Ld.b(a3, "trigger_content_update_delay");
                int i8 = b10;
                int b23 = Ld.b(a3, "trigger_max_content_delay");
                int i9 = b9;
                int b24 = Ld.b(a3, "content_uri_triggers");
                int i10 = b8;
                int i11 = b7;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(b2);
                    int i12 = b2;
                    String string2 = a3.getString(b4);
                    int i13 = b4;
                    c cVar = new c();
                    int i14 = b17;
                    cVar.a(C1632qf.b(a3.getInt(b17)));
                    cVar.b(a3.getInt(b18) != 0);
                    cVar.c(a3.getInt(b19) != 0);
                    cVar.a(a3.getInt(b20) != 0);
                    cVar.d(a3.getInt(b21) != 0);
                    int i15 = b20;
                    int i16 = b18;
                    cVar.a(a3.getLong(b22));
                    cVar.b(a3.getLong(b23));
                    cVar.a(C1632qf.a(a3.getBlob(b24)));
                    _e _eVar = new _e(string, string2);
                    _eVar.d = C1632qf.c(a3.getInt(b3));
                    _eVar.f = a3.getString(b5);
                    _eVar.g = e.b(a3.getBlob(b6));
                    int i17 = i11;
                    _eVar.h = e.b(a3.getBlob(i17));
                    i11 = i17;
                    int i18 = i16;
                    int i19 = i10;
                    _eVar.i = a3.getLong(i19);
                    int i20 = b19;
                    i10 = i19;
                    int i21 = i9;
                    _eVar.j = a3.getLong(i21);
                    i9 = i21;
                    int i22 = i20;
                    int i23 = i8;
                    _eVar.k = a3.getLong(i23);
                    int i24 = i7;
                    _eVar.m = a3.getInt(i24);
                    int i25 = i6;
                    i7 = i24;
                    _eVar.n = C1632qf.a(a3.getInt(i25));
                    i8 = i23;
                    int i26 = i5;
                    int i27 = i22;
                    _eVar.o = a3.getLong(i26);
                    int i28 = i26;
                    i6 = i25;
                    int i29 = i4;
                    _eVar.p = a3.getLong(i29);
                    i4 = i29;
                    int i30 = i28;
                    int i31 = i3;
                    _eVar.q = a3.getLong(i31);
                    i3 = i31;
                    int i32 = i30;
                    int i33 = b16;
                    _eVar.r = a3.getLong(i33);
                    _eVar.l = cVar;
                    arrayList.add(_eVar);
                    b16 = i33;
                    b18 = i18;
                    b19 = i27;
                    b4 = i13;
                    b20 = i15;
                    b17 = i14;
                    i5 = i32;
                    b2 = i12;
                }
                a3.close();
                wVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                wVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wVar = a2;
            a3.close();
            wVar.b();
            throw th;
        }
    }

    public List<_e> c() {
        w wVar;
        w a2 = w.a("SELECT * FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor a3 = Md.a(this.a, a2, false);
        try {
            int b2 = Ld.b(a3, "id");
            int b3 = Ld.b(a3, "state");
            int b4 = Ld.b(a3, "worker_class_name");
            int b5 = Ld.b(a3, "input_merger_class_name");
            int b6 = Ld.b(a3, "input");
            int b7 = Ld.b(a3, "output");
            int b8 = Ld.b(a3, "initial_delay");
            int b9 = Ld.b(a3, "interval_duration");
            int b10 = Ld.b(a3, "flex_duration");
            int b11 = Ld.b(a3, "run_attempt_count");
            int b12 = Ld.b(a3, "backoff_policy");
            int b13 = Ld.b(a3, "backoff_delay_duration");
            int b14 = Ld.b(a3, "period_start_time");
            int b15 = Ld.b(a3, "minimum_retention_duration");
            wVar = a2;
            try {
                int b16 = Ld.b(a3, "schedule_requested_at");
                int b17 = Ld.b(a3, "required_network_type");
                int i2 = b15;
                int b18 = Ld.b(a3, "requires_charging");
                int i3 = b14;
                int b19 = Ld.b(a3, "requires_device_idle");
                int i4 = b13;
                int b20 = Ld.b(a3, "requires_battery_not_low");
                int i5 = b12;
                int b21 = Ld.b(a3, "requires_storage_not_low");
                int i6 = b11;
                int b22 = Ld.b(a3, "trigger_content_update_delay");
                int i7 = b10;
                int b23 = Ld.b(a3, "trigger_max_content_delay");
                int i8 = b9;
                int b24 = Ld.b(a3, "content_uri_triggers");
                int i9 = b8;
                int i10 = b7;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(b2);
                    int i11 = b2;
                    String string2 = a3.getString(b4);
                    int i12 = b4;
                    c cVar = new c();
                    int i13 = b17;
                    cVar.a(C1632qf.b(a3.getInt(b17)));
                    cVar.b(a3.getInt(b18) != 0);
                    cVar.c(a3.getInt(b19) != 0);
                    cVar.a(a3.getInt(b20) != 0);
                    cVar.d(a3.getInt(b21) != 0);
                    int i14 = b19;
                    int i15 = b18;
                    cVar.a(a3.getLong(b22));
                    cVar.b(a3.getLong(b23));
                    cVar.a(C1632qf.a(a3.getBlob(b24)));
                    _e _eVar = new _e(string, string2);
                    _eVar.d = C1632qf.c(a3.getInt(b3));
                    _eVar.f = a3.getString(b5);
                    _eVar.g = e.b(a3.getBlob(b6));
                    int i16 = i10;
                    _eVar.h = e.b(a3.getBlob(i16));
                    i10 = i16;
                    int i17 = i15;
                    int i18 = i9;
                    _eVar.i = a3.getLong(i18);
                    i9 = i18;
                    int i19 = b3;
                    int i20 = i8;
                    _eVar.j = a3.getLong(i20);
                    i8 = i20;
                    int i21 = i19;
                    int i22 = i7;
                    _eVar.k = a3.getLong(i22);
                    int i23 = i6;
                    _eVar.m = a3.getInt(i23);
                    int i24 = i5;
                    i6 = i23;
                    _eVar.n = C1632qf.a(a3.getInt(i24));
                    i7 = i22;
                    int i25 = i4;
                    int i26 = i21;
                    _eVar.o = a3.getLong(i25);
                    int i27 = i25;
                    i5 = i24;
                    int i28 = i3;
                    _eVar.p = a3.getLong(i28);
                    i3 = i28;
                    int i29 = i27;
                    int i30 = i2;
                    _eVar.q = a3.getLong(i30);
                    i2 = i30;
                    int i31 = i29;
                    int i32 = b16;
                    _eVar.r = a3.getLong(i32);
                    _eVar.l = cVar;
                    arrayList.add(_eVar);
                    b16 = i32;
                    b18 = i17;
                    b2 = i11;
                    b4 = i12;
                    b19 = i14;
                    b17 = i13;
                    int i33 = i26;
                    i4 = i31;
                    b3 = i33;
                }
                a3.close();
                wVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                wVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wVar = a2;
            a3.close();
            wVar.b();
            throw th;
        }
    }

    public List<_e> a() {
        w wVar;
        w a2 = w.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor a3 = Md.a(this.a, a2, false);
        try {
            int b2 = Ld.b(a3, "id");
            int b3 = Ld.b(a3, "state");
            int b4 = Ld.b(a3, "worker_class_name");
            int b5 = Ld.b(a3, "input_merger_class_name");
            int b6 = Ld.b(a3, "input");
            int b7 = Ld.b(a3, "output");
            int b8 = Ld.b(a3, "initial_delay");
            int b9 = Ld.b(a3, "interval_duration");
            int b10 = Ld.b(a3, "flex_duration");
            int b11 = Ld.b(a3, "run_attempt_count");
            int b12 = Ld.b(a3, "backoff_policy");
            int b13 = Ld.b(a3, "backoff_delay_duration");
            int b14 = Ld.b(a3, "period_start_time");
            int b15 = Ld.b(a3, "minimum_retention_duration");
            wVar = a2;
            try {
                int b16 = Ld.b(a3, "schedule_requested_at");
                int b17 = Ld.b(a3, "required_network_type");
                int i2 = b15;
                int b18 = Ld.b(a3, "requires_charging");
                int i3 = b14;
                int b19 = Ld.b(a3, "requires_device_idle");
                int i4 = b13;
                int b20 = Ld.b(a3, "requires_battery_not_low");
                int i5 = b12;
                int b21 = Ld.b(a3, "requires_storage_not_low");
                int i6 = b11;
                int b22 = Ld.b(a3, "trigger_content_update_delay");
                int i7 = b10;
                int b23 = Ld.b(a3, "trigger_max_content_delay");
                int i8 = b9;
                int b24 = Ld.b(a3, "content_uri_triggers");
                int i9 = b8;
                int i10 = b7;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(b2);
                    int i11 = b2;
                    String string2 = a3.getString(b4);
                    int i12 = b4;
                    c cVar = new c();
                    int i13 = b17;
                    cVar.a(C1632qf.b(a3.getInt(b17)));
                    cVar.b(a3.getInt(b18) != 0);
                    cVar.c(a3.getInt(b19) != 0);
                    cVar.a(a3.getInt(b20) != 0);
                    cVar.d(a3.getInt(b21) != 0);
                    int i14 = b19;
                    int i15 = b18;
                    cVar.a(a3.getLong(b22));
                    cVar.b(a3.getLong(b23));
                    cVar.a(C1632qf.a(a3.getBlob(b24)));
                    _e _eVar = new _e(string, string2);
                    _eVar.d = C1632qf.c(a3.getInt(b3));
                    _eVar.f = a3.getString(b5);
                    _eVar.g = e.b(a3.getBlob(b6));
                    int i16 = i10;
                    _eVar.h = e.b(a3.getBlob(i16));
                    i10 = i16;
                    int i17 = i15;
                    int i18 = i9;
                    _eVar.i = a3.getLong(i18);
                    i9 = i18;
                    int i19 = b3;
                    int i20 = i8;
                    _eVar.j = a3.getLong(i20);
                    i8 = i20;
                    int i21 = i19;
                    int i22 = i7;
                    _eVar.k = a3.getLong(i22);
                    int i23 = i6;
                    _eVar.m = a3.getInt(i23);
                    int i24 = i5;
                    i6 = i23;
                    _eVar.n = C1632qf.a(a3.getInt(i24));
                    i7 = i22;
                    int i25 = i4;
                    int i26 = i21;
                    _eVar.o = a3.getLong(i25);
                    int i27 = i25;
                    i5 = i24;
                    int i28 = i3;
                    _eVar.p = a3.getLong(i28);
                    i3 = i28;
                    int i29 = i27;
                    int i30 = i2;
                    _eVar.q = a3.getLong(i30);
                    i2 = i30;
                    int i31 = i29;
                    int i32 = b16;
                    _eVar.r = a3.getLong(i32);
                    _eVar.l = cVar;
                    arrayList.add(_eVar);
                    b16 = i32;
                    b18 = i17;
                    b2 = i11;
                    b4 = i12;
                    b19 = i14;
                    b17 = i13;
                    int i33 = i26;
                    i4 = i31;
                    b3 = i33;
                }
                a3.close();
                wVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                wVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wVar = a2;
            a3.close();
            wVar.b();
            throw th;
        }
    }

    public int a(a aVar, String... strArr) {
        this.a.b();
        StringBuilder a2 = Nd.a();
        a2.append("UPDATE workspec SET state=");
        a2.append("?");
        a2.append(" WHERE id IN (");
        Nd.a(a2, strArr.length);
        a2.append(")");
        Yd a3 = this.a.a(a2.toString());
        a3.a(1, (long) C1632qf.a(aVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                a3.c(i2);
            } else {
                a3.a(i2, str);
            }
            i2++;
        }
        this.a.c();
        try {
            int v = a3.v();
            this.a.m();
            return v;
        } finally {
            this.a.e();
        }
    }

    private void a(T<String, ArrayList<String>> t) {
        int i2;
        Set<String> keySet = t.keySet();
        if (!keySet.isEmpty()) {
            if (t.size() > 999) {
                T t2 = new T((int) C1325gg.INAPP_MESSAGE_DURATION_MIN_MILLIS);
                int size = t.size();
                T t3 = t2;
                int i3 = 0;
                loop0:
                while (true) {
                    i2 = 0;
                    while (i3 < size) {
                        t3.put(t.b(i3), t.d(i3));
                        i3++;
                        i2++;
                        if (i2 == 999) {
                            a(t3);
                            t3 = new T((int) C1325gg.INAPP_MESSAGE_DURATION_MIN_MILLIS);
                        }
                    }
                    break loop0;
                }
                if (i2 > 0) {
                    a(t3);
                }
                return;
            }
            StringBuilder a2 = Nd.a();
            a2.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            Nd.a(a2, size2);
            a2.append(")");
            w a3 = w.a(a2.toString(), size2 + 0);
            int i4 = 1;
            for (String str : keySet) {
                if (str == null) {
                    a3.c(i4);
                } else {
                    a3.a(i4, str);
                }
                i4++;
            }
            Cursor a4 = Md.a(this.a, a3, false);
            try {
                int a5 = Ld.a(a4, "work_spec_id");
                if (a5 != -1) {
                    while (a4.moveToNext()) {
                        if (!a4.isNull(a5)) {
                            ArrayList arrayList = (ArrayList) t.get(a4.getString(a5));
                            if (arrayList != null) {
                                arrayList.add(a4.getString(0));
                            }
                        }
                    }
                    a4.close();
                }
            } finally {
                a4.close();
            }
        }
    }
}
