package com.soundcloud.android.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.s;
import com.soundcloud.android.foundation.events.t;
import com.soundcloud.android.foundation.events.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class OfflineContentService extends Service implements b {
    Vb a;
    C4197yd b;
    Tb c;
    C2248QR d;
    C4118ke e;
    C4134nc f;
    a g;
    HPa h;
    C2014EO i;
    Qb j;
    /* access modifiers changed from: private */
    public Ob k;
    private VPa l = C4881Eua.b();
    private boolean m;
    private boolean n;
    /* access modifiers changed from: private */
    public long o;

    private class a extends C5068Kua<Id> {
        private a() {
        }

        /* renamed from: a */
        public void onSuccess(Id id) {
            ArrayList a = C2063HD.a((Iterable<? extends E>) id.e());
            boolean a2 = id.i().a();
            if (OfflineContentService.this.k.c()) {
                C4146pc b = OfflineContentService.this.k.b();
                if (a.contains(b) && OfflineContentService.this.a.d()) {
                    OfflineContentService.this.a((List<C4146pc>) a, b);
                } else if (!OfflineContentService.this.a.d()) {
                    OfflineContentService.this.a((List<C4146pc>) a, a2, b);
                } else {
                    OfflineContentService.this.b(a, a2, b);
                }
            } else {
                OfflineContentService.this.a((List<C4146pc>) a);
                OfflineContentService.this.a(a2);
                OfflineContentService.this.e(null);
                OfflineContentService.this.o = 0;
                OfflineContentService.this.i.a(u.OFFLINE_SYNC);
            }
            super.onSuccess(id);
        }
    }

    public OfflineContentService() {
        SoundCloudApplication.f().a(this);
    }

    static /* synthetic */ Id a(Id id, Set set) throws Exception {
        return id;
    }

    public static void c(Context context) {
        Intent a2 = a(context, "action_start_download");
        a2.putExtra("extra_show_result", true);
        context.startService(a2);
    }

    public static void d(Context context) {
        context.startService(a(context, "action_stop_download"));
    }

    /* access modifiers changed from: private */
    public void e(C4152qc qcVar) {
        if (this.f.c()) {
            this.j.a("downloadNextOrFinish> Download queue is empty. Stopping.");
            f(qcVar);
            return;
        }
        C4146pc d2 = this.f.d();
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("downloadNextOrFinish> Downloading ");
        sb.append(d2.a());
        qb.a(sb.toString());
        a(d2);
    }

    private void f(C4152qc qcVar) {
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("stopAndFinish> last result = [");
        sb.append(qcVar);
        sb.append("]");
        qb.a(sb.toString());
        b();
        this.c.b(qcVar, this.n);
    }

    private void g(C4152qc qcVar) {
        this.j.a("stopAndRetryLater>");
        this.d.b(C2286SR.RETRY_OFFLINE_SYNC);
        b();
        this.c.a(qcVar, this.n);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.k = this.g.a(this);
    }

    public void onDestroy() {
        this.j.a("onDestroy");
        this.l.dispose();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        String action = intent.getAction();
        String str = "action_stop_download";
        this.m = str.equals(intent.getAction());
        this.n = intent.getBooleanExtra("extra_show_result", this.n);
        startForeground(6, this.c.a());
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append(" Starting offlineContentService for action: ");
        sb.append(action);
        qb.a(sb.toString());
        this.d.a(C2286SR.RETRY_OFFLINE_SYNC);
        if ("action_start_download".equalsIgnoreCase(action)) {
            this.l.dispose();
            IPa c2 = this.b.l().a(this.h).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4155ra<Object,Object>(this)).c((C6776kQa<? super T>) new C4150qa<Object>(this));
            a aVar = new a();
            c2.c(aVar);
            this.l = aVar;
        } else if (str.equalsIgnoreCase(action)) {
            this.l.dispose();
            if (this.k.c()) {
                this.k.a();
            } else {
                f(null);
            }
        }
        return 2;
    }

    public static void b(Context context) {
        androidx.core.content.a.a(context, a(context, "action_start_download"));
    }

    public void d(C4152qc qcVar) {
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("onCancel> state = [");
        sb.append(qcVar);
        sb.append("]");
        qb.a(sb.toString());
        if (this.m) {
            this.j.a("onCancel> Service is stopping.");
            this.c.b();
            f(qcVar);
            return;
        }
        this.j.a("onCancel> Download next.");
        this.c.c(qcVar);
        e(qcVar);
    }

    public /* synthetic */ void b(Id id) throws Exception {
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("Received OfflineContentRequests: ");
        sb.append(id.c());
        qb.a(sb.toString());
    }

    public void c(C4152qc qcVar) {
        this.c.e(qcVar);
    }

    public void b(C4152qc qcVar) {
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("onError> Download failed. state = [");
        sb.append(qcVar);
        sb.append("]");
        qb.a(sb.toString());
        if (qcVar.l()) {
            this.e.e(qcVar.a.a());
        } else {
            this.e.d(qcVar.a.a());
        }
        this.c.d(qcVar);
        if (qcVar.e()) {
            this.j.a("onError> Connection error.");
            g(qcVar);
        } else if (qcVar.h()) {
            this.j.a("onError> Inaccessible storage location");
            f(qcVar);
        } else if (qcVar.i()) {
            this.j.a("onError> Not enough minimum space");
            f(qcVar);
        } else {
            this.j.a("onError> Download next.");
            e(qcVar);
        }
    }

    public static void a(Context context) {
        context.startService(a(context, "action_start_download"));
    }

    private static Intent a(Context context, String str) {
        Intent intent = new Intent(context, OfflineContentService.class);
        intent.setAction(str);
        return intent;
    }

    public /* synthetic */ MPa a(Id id) throws Exception {
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("Tracks to remove: ");
        sb.append(id.d().size());
        qb.a(sb.toString());
        return this.a.b((Collection<C3508cda>) id.d()).e(new C4144pa(id));
    }

    public void a(C4152qc qcVar) {
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("onSuccess> Download finished state = [");
        sb.append(qcVar);
        sb.append("]");
        qb.a(sb.toString());
        this.c.f(qcVar);
        this.e.a(qcVar.a.a());
        this.b.a(true);
        this.o += qcVar.a.f();
        e(qcVar);
    }

    private void a(C4146pc pcVar) {
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("download> request = [");
        sb.append(pcVar);
        sb.append("]");
        qb.a(sb.toString());
        this.k.sendMessage(this.k.obtainMessage(0, pcVar));
        this.e.b(pcVar.a());
    }

    private void b() {
        this.j.a("Stopping the service");
        a();
        this.l.dispose();
        this.k.d();
        stopForeground(true);
        stopSelf();
    }

    private void a() {
        if (this.o > 0) {
            this.i.b(C1994DO.a().a(u.OFFLINE_SYNC).a(new t().b(s.DOWNLOADED_DURATION, this.o)).b());
        }
    }

    /* access modifiers changed from: private */
    public void b(List<C4146pc> list, boolean z, C4146pc pcVar) {
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("Cancelling ");
        sb.append(pcVar);
        qb.a(sb.toString());
        a(list);
        a(z);
        this.k.a();
        this.e.c(pcVar.a());
    }

    /* access modifiers changed from: private */
    public void a(List<C4146pc> list, boolean z, C4146pc pcVar) {
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("Canceling, no valid connection ");
        sb.append(pcVar);
        qb.a(sb.toString());
        a(list);
        a(z);
        this.k.a();
        this.e.d(pcVar.a());
    }

    /* access modifiers changed from: private */
    public void a(List<C4146pc> list, C4146pc pcVar) {
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("Keep downloading.");
        sb.append(pcVar);
        qb.a(sb.toString());
        list.remove(pcVar);
        a(list);
        startForeground(6, this.c.a(this.f));
        this.e.b(pcVar.a());
    }

    /* access modifiers changed from: private */
    public void a(List<C4146pc> list) {
        Qb qb = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("setNewRequests requests = [");
        sb.append(list);
        sb.append("]");
        qb.a(sb.toString());
        this.f.a(list);
        this.e.c((Collection<C3508cda>) C2063HD.a((Iterable<? extends E>) C3063jD.a((Collection<F>) list, C4146pc.a)));
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        if (z || this.f.c()) {
            this.c.b();
        } else {
            startForeground(6, this.c.a(this.f));
        }
    }
}
