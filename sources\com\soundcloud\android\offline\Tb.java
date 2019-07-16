package com.soundcloud.android.offline;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import androidx.core.app.k.d;
import androidx.core.app.n;
import com.google.common.base.Predicate;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.o;
import com.soundcloud.android.ia.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: DownloadNotificationController */
class Tb {
    private final Context a;
    private final Resources b;
    private final n c;
    private int d;
    private long e;
    private long f;
    private List<C4152qc> g = new ArrayList();
    private C4152qc h;
    private d i;
    private a j;

    /* compiled from: DownloadNotificationController */
    private static final class a {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final int b;
        /* access modifiers changed from: private */
        public final int c;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!C4804CKa.a(Integer.valueOf(this.a), Integer.valueOf(aVar.a)) || !C4804CKa.a(Integer.valueOf(this.b), Integer.valueOf(aVar.b)) || !C4804CKa.a(Integer.valueOf(this.c), Integer.valueOf(aVar.c))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return C4804CKa.a(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        private a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    Tb(Context context, n nVar, Resources resources) {
        this.a = context;
        this.b = resources;
        this.c = nVar;
    }

    private int a(float f2, long j2) {
        return (int) ((f2 * 1000.0f) / ((float) j2));
    }

    private void g(C4152qc qcVar) {
        if (f()) {
            this.c.a(6, c());
        } else if (g()) {
            this.c.a(6, d());
        } else if (qcVar == null || this.d == e()) {
            this.c.a(6);
        } else {
            this.c.a(6, a(qcVar.a));
        }
    }

    private void h(C4152qc qcVar) {
        a aVar = new a(a(this.g.size(), this.d), this.d, a((float) ((int) (this.f + qcVar.a())), this.e));
        if (!aVar.equals(this.j)) {
            this.j = aVar;
            this.c.a(6, a(qcVar.a, aVar));
        }
    }

    /* access modifiers changed from: 0000 */
    public Notification a() {
        d dVar = new d(this.a, "channel_download");
        dVar.e(h.ic_notification_cloud);
        dVar.c((CharSequence) this.a.getString(p.offline_update_checking));
        dVar.a("service");
        return dVar.a();
    }

    /* access modifiers changed from: 0000 */
    public void b(C4152qc qcVar, boolean z) {
        if (z) {
            g(qcVar);
        } else {
            this.c.a(6);
        }
        b();
    }

    /* access modifiers changed from: 0000 */
    public void c(C4152qc qcVar) {
        int i2 = this.d;
        if (i2 > 0) {
            this.d = i2 - 1;
            h(qcVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(C4152qc qcVar) {
        this.f += qcVar.b();
        this.h = null;
        this.g.add(qcVar);
        h(qcVar);
    }

    /* access modifiers changed from: 0000 */
    public void e(C4152qc qcVar) {
        this.h = qcVar;
        h(qcVar);
    }

    /* access modifiers changed from: 0000 */
    public void f(C4152qc qcVar) {
        this.h = null;
        this.g.add(qcVar);
        h(qcVar);
        this.f += qcVar.b();
    }

    private int e() {
        return C3063jD.a((Collection<E>) this.g, (Predicate<? super E>) C4083f.a).size();
    }

    private Notification c() {
        d a2 = a(h.ic_notification_cloud);
        a2.a(Aja.a(this.a));
        a2.c((CharSequence) this.b.getString(p.sd_card_cannot_be_found));
        a2.b((CharSequence) this.b.getString(p.tap_here_to_change_storage_location));
        return a2.a();
    }

    public void b() {
        this.d = 0;
        this.f = 0;
        this.g = new ArrayList();
    }

    private Notification d() {
        d a2 = a(h.ic_notification_cloud);
        a2.a(Aja.d(this.a));
        a2.c((CharSequence) this.b.getString(p.offline_update_storage_limit_reached_title));
        a2.b((CharSequence) this.b.getString(p.offline_update_storage_limit_reached_message));
        return a2.a();
    }

    private boolean f() {
        return C1943BD.f(this.g, C4059b.a).isPresent();
    }

    /* access modifiers changed from: 0000 */
    public Notification a(C4134nc ncVar) {
        long j2;
        int e2 = ncVar.e() + this.g.size();
        if (this.h != null) {
            e2++;
        }
        this.d = e2;
        C4152qc qcVar = this.h;
        if (qcVar == null) {
            j2 = this.f;
        } else {
            j2 = this.f + qcVar.b();
        }
        this.e = j2;
        for (C4146pc g2 : ncVar.b()) {
            this.e += g2.g();
        }
        this.i = new d(this.a, "channel_download");
        C4152qc qcVar2 = this.h;
        if (qcVar2 == null) {
            return a(ncVar.a(), new a(a(this.g.size(), this.d), this.d, a((float) ((int) this.f), this.e)));
        }
        return a(qcVar2.a, new a(a(this.g.size(), this.d), this.d, a((float) ((int) (this.f + this.h.a())), this.e)));
    }

    static /* synthetic */ boolean b(C4152qc qcVar) {
        return qcVar.j() || qcVar.i();
    }

    private PendingIntent b(C4146pc pcVar) {
        if (pcVar == null) {
            return Aja.c(this.a);
        }
        return Aja.b(this.a);
    }

    private boolean g() {
        return C1943BD.f(this.g, C4089g.a).isPresent();
    }

    static /* synthetic */ boolean a(C4152qc qcVar) {
        return qcVar.e() || qcVar.f() || qcVar.l();
    }

    /* access modifiers changed from: 0000 */
    public void a(C4152qc qcVar, boolean z) {
        if (z) {
            d a2 = a(h.ic_notification_cloud);
            a2.a(b(qcVar.a));
            a2.c((CharSequence) this.b.getString(p.offline_update_paused));
            a2.b((CharSequence) this.b.getString(qcVar.c ? p.no_network_connection : p.no_wifi_connection));
            this.c.a(6, a2.a());
            return;
        }
        this.c.a(6);
    }

    private Notification a(C4146pc pcVar) {
        d a2 = a(h.ic_notification_download_completed);
        a2.a(b(pcVar));
        a2.c((CharSequence) this.b.getString(p.offline_update_completed_title));
        a2.b((CharSequence) this.b.getString(p.offline_update_completed_message));
        return a2.a();
    }

    private int a(int i2, int i3) {
        return Math.min(i2 + 1, i3);
    }

    private Notification a(C4146pc pcVar, a aVar) {
        String quantityString = this.b.getQuantityString(o.downloading_track_of_tracks, aVar.b, new Object[]{Integer.valueOf(aVar.a), Integer.valueOf(aVar.b)});
        this.i.e(h.ic_notification_cloud);
        this.i.f(1);
        this.i.c(true);
        this.i.a(b(pcVar));
        this.i.c((CharSequence) this.b.getString(p.offline_update_in_progress));
        this.i.a(1000, aVar.c, false);
        this.i.b((CharSequence) quantityString);
        return this.i.a();
    }

    private d a(int i2) {
        d dVar = new d(this.a, "channel_download");
        dVar.e(i2);
        dVar.f(1);
        dVar.c(false);
        dVar.a(true);
        return dVar;
    }
}
