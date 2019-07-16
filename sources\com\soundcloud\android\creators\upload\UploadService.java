package com.soundcloud.android.creators.upload;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.features.record.J;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.features.record.ba;
import com.soundcloud.android.foundation.events.C3700b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class UploadService extends Service {
    static final String a = "UploadService";
    /* access modifiers changed from: private */
    public final Map<Long, b> b = new HashMap();
    private final IBinder c = new w(this);
    private WakeLock d;
    private WifiLock e;
    private c f;
    /* access modifiers changed from: private */
    public Handler g;
    u h;
    dfa i;
    C2350WH<Xaa> j;
    J k;
    C3700b l;
    private VPa m;

    private final class a extends C5037Jua<Xaa> {
        private a() {
        }

        /* synthetic */ a(UploadService uploadService, w wVar) {
            this();
        }

        public void a(Xaa xaa) {
            Recording b = xaa.b();
            if (xaa.n()) {
                UploadService.this.d(b);
            } else if (xaa.e() || xaa.d()) {
                a(xaa, b);
                UploadService.this.e();
                UploadService.this.b.remove(Long.valueOf(b.getId()));
                UploadService.this.c(b);
            } else if (xaa.l() || xaa.j()) {
                UploadService.this.c();
            } else if (xaa.m() || xaa.k()) {
                UploadService.this.f();
                UploadService.this.d(b);
            } else if (xaa.r()) {
                UploadService.this.h.a(b, 0);
                UploadService.this.b();
            } else if (xaa.q()) {
                UploadService.this.h.a(b, xaa.a());
            } else if (xaa.s() && ((b) UploadService.this.b.get(Long.valueOf(b.getId()))) != null) {
                ba.a(UploadService.this.getApplicationContext(), UploadService.this.k).a(true);
                UploadService.this.e();
                UploadService.this.c(b);
                UploadService.this.j.accept(Xaa.i(b));
            }
        }

        private void a(Xaa xaa, Recording recording) {
            if (xaa.d()) {
                recording.T();
            } else if (xaa.f()) {
                recording.R();
            } else {
                recording.S();
            }
        }
    }

    private static class b {
        final Recording a;

        public b(Recording recording) {
            this.a = recording;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Upload{recording=");
            sb.append(this.a);
            sb.append(", playbackStream=");
            sb.append(this.a.u());
            sb.append('}');
            return sb.toString();
        }
    }

    private static final class c extends Handler {
        private final WeakReference<UploadService> a;
        private final dfa b;
        private final C2350WH<Xaa> c;
        private final C3700b d;

        /* synthetic */ c(UploadService uploadService, Looper looper, dfa dfa, C2350WH wh, C3700b bVar, w wVar) {
            this(uploadService, looper, dfa, wh, bVar);
        }

        public void handleMessage(Message message) {
            UploadService uploadService = (UploadService) this.a.get();
            if (uploadService != null) {
                b bVar = (b) message.obj;
                defpackage.SDb.b a2 = SDb.a(UploadService.a);
                StringBuilder sb = new StringBuilder();
                sb.append("handleMessage(");
                sb.append(bVar);
                sb.append(")");
                a2.a(sb.toString(), new Object[0]);
                if (bVar.a.Q()) {
                    uploadService.g.post(new l(bVar.a));
                } else if (bVar.a.P()) {
                    uploadService.g.post(new p(bVar.a));
                } else if (bVar.a.O()) {
                    uploadService.g.post(new k(bVar.a, this.c));
                } else {
                    z zVar = new z(uploadService, this.b, bVar.a, this.c, this.d);
                    post(zVar);
                }
            }
        }

        private c(UploadService uploadService, Looper looper, dfa dfa, C2350WH<Xaa> wh, C3700b bVar) {
            super(looper);
            this.b = dfa;
            this.c = wh;
            this.a = new WeakReference<>(uploadService);
            this.d = bVar;
        }
    }

    public UploadService() {
        SoundCloudApplication.f().a(this);
    }

    private void g() {
        WifiLock wifiLock = this.e;
        if (wifiLock != null && wifiLock.isHeld()) {
            this.e.release();
        }
    }

    public IBinder onBind(Intent intent) {
        return this.c;
    }

    public void onCreate() {
        super.onCreate();
        SDb.a(a).a("upload service started", new Object[0]);
        c cVar = new c(this, a("Uploader", 0), this.i, this.j, this.l, null);
        this.f = cVar;
        this.g = new Handler(a("Processing", 10));
        this.d = ((PowerManager) getSystemService("power")).newWakeLock(1, a);
        this.e = C4739AHa.a((Context) this, a);
        C2350WH<Xaa> wh = this.j;
        a aVar = new a(this, null);
        wh.c(aVar);
        this.m = aVar;
    }

    public void onDestroy() {
        SDb.a(a).a("onDestroy()", new Object[0]);
        this.f.getLooper().quit();
        this.g.getLooper().quit();
        this.m.dispose();
        if (a()) {
            SDb.a(a).f("Service being destroyed while still uploading.", new Object[0]);
            for (b bVar : this.b.values()) {
                a(bVar.a);
            }
        }
        SDb.a(a).a("shutdown complete.", new Object[0]);
    }

    /* access modifiers changed from: private */
    public void c(Recording recording) {
        if (recording.M()) {
            this.h.c(recording);
        } else if (recording.K()) {
            this.h.b(recording);
        } else {
            this.h.a();
        }
        this.b.remove(Long.valueOf(recording.getId()));
        if (!a()) {
            stopSelf();
        }
    }

    /* access modifiers changed from: private */
    public void d(Recording recording) {
        this.h.a(recording);
        Message.obtain(this.f, 0, b(recording)).sendToTarget();
    }

    /* access modifiers changed from: private */
    public void e() {
        SDb.a(a).a("releaseLocks", new Object[0]);
        f();
        g();
    }

    /* access modifiers changed from: private */
    public void f() {
        WakeLock wakeLock = this.d;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.d.release();
        }
    }

    private b b(Recording recording) {
        if (!this.b.containsKey(Long.valueOf(recording.getId()))) {
            this.b.put(Long.valueOf(recording.getId()), new b(recording));
        }
        return (b) this.b.get(Long.valueOf(recording.getId()));
    }

    public boolean a() {
        return !this.b.isEmpty() || this.f.hasMessages(0);
    }

    private static Looper a(String str, int i2) {
        HandlerThread handlerThread = new HandlerThread(str, i2);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    private void d() {
        WifiLock wifiLock = this.e;
        if (wifiLock != null && !wifiLock.isHeld()) {
            this.e.acquire();
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        SDb.a(a).a("acquireLocks", new Object[0]);
        c();
        d();
    }

    /* access modifiers changed from: 0000 */
    public void a(Recording recording) {
        b bVar = (b) this.b.get(Long.valueOf(recording.getId()));
        if (bVar != null) {
            this.f.removeMessages(0, bVar);
        }
        this.j.accept(Xaa.a(recording));
        if (this.b.isEmpty()) {
            SDb.a(a).a("onCancel() called without any active uploads", new Object[0]);
            stopSelf();
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        WakeLock wakeLock = this.d;
        if (wakeLock != null && !wakeLock.isHeld()) {
            this.d.acquire();
        }
    }
}
