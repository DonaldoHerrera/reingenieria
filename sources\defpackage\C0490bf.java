package defpackage;

import androidx.room.C0434c;
import androidx.room.t;
import androidx.work.c;
import androidx.work.e;

/* renamed from: bf reason: default package and case insensitive filesystem */
/* compiled from: WorkSpecDao_Impl */
class C0490bf extends C0434c<_e> {
    final /* synthetic */ C1447kf d;

    C0490bf(C1447kf kfVar, t tVar) {
        this.d = kfVar;
        super(tVar);
    }

    public String c() {
        return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public void a(Yd yd, _e _eVar) {
        String str = _eVar.c;
        if (str == null) {
            yd.c(1);
        } else {
            yd.a(1, str);
        }
        yd.a(2, (long) C1632qf.a(_eVar.d));
        String str2 = _eVar.e;
        if (str2 == null) {
            yd.c(3);
        } else {
            yd.a(3, str2);
        }
        String str3 = _eVar.f;
        if (str3 == null) {
            yd.c(4);
        } else {
            yd.a(4, str3);
        }
        byte[] a = e.a(_eVar.g);
        if (a == null) {
            yd.c(5);
        } else {
            yd.a(5, a);
        }
        byte[] a2 = e.a(_eVar.h);
        if (a2 == null) {
            yd.c(6);
        } else {
            yd.a(6, a2);
        }
        yd.a(7, _eVar.i);
        yd.a(8, _eVar.j);
        yd.a(9, _eVar.k);
        yd.a(10, (long) _eVar.m);
        yd.a(11, (long) C1632qf.a(_eVar.n));
        yd.a(12, _eVar.o);
        yd.a(13, _eVar.p);
        yd.a(14, _eVar.q);
        yd.a(15, _eVar.r);
        c cVar = _eVar.l;
        if (cVar != null) {
            yd.a(16, (long) C1632qf.a(cVar.b()));
            yd.a(17, cVar.g() ? 1 : 0);
            yd.a(18, cVar.h() ? 1 : 0);
            yd.a(19, cVar.f() ? 1 : 0);
            yd.a(20, cVar.i() ? 1 : 0);
            yd.a(21, cVar.c());
            yd.a(22, cVar.d());
            byte[] a3 = C1632qf.a(cVar.a());
            if (a3 == null) {
                yd.c(23);
            } else {
                yd.a(23, a3);
            }
        } else {
            yd.c(16);
            yd.c(17);
            yd.c(18);
            yd.c(19);
            yd.c(20);
            yd.c(21);
            yd.c(22);
            yd.c(23);
        }
    }
}
