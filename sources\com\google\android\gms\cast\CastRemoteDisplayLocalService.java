package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.view.Display;
import androidx.mediarouter.media.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.C0710ia;
import com.google.android.gms.internal.cast.Ca;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(19)
public abstract class CastRemoteDisplayLocalService extends Service {
    private static final C0710ia a = new C0710ia("CastRemoteDisplayLocalService");
    private static final int b = C0680m.cast_notification_id;
    private static final Object c = new Object();
    private static AtomicBoolean d = new AtomicBoolean(false);
    private static CastRemoteDisplayLocalService e;
    private String f;
    /* access modifiers changed from: private */
    public WeakReference<a> g;
    private c h;
    private Notification i;
    /* access modifiers changed from: private */
    public CastDevice j;
    /* access modifiers changed from: private */
    public Display k;
    private Context l;
    private ServiceConnection m;
    private Handler n;
    private h o;
    /* access modifiers changed from: private */
    public boolean p = false;
    private C0631e q;
    private final androidx.mediarouter.media.h.a r = new Z(this);
    private final IBinder s = new b();

    public interface a {
        void a(CastRemoteDisplayLocalService castRemoteDisplayLocalService);

        void a(Status status);
    }

    class b extends Binder {
        b() {
        }
    }

    private static final class c extends BroadcastReceiver {
    }

    /* access modifiers changed from: private */
    public final void a(boolean z) {
        a("Stopping Service");
        Preconditions.checkMainThread("stopServiceInstanceInternal must be called on the main thread");
        if (!z && this.o != null) {
            a("Setting default route");
            h hVar = this.o;
            hVar.a(hVar.b());
        }
        if (this.h != null) {
            a("Unregistering notification receiver");
            unregisterReceiver(this.h);
        }
        a("stopRemoteDisplaySession");
        a("stopRemoteDisplay");
        this.q.a().a((Ry<TResult>) new C0683p<TResult>(this));
        if (this.g.get() != null) {
            ((a) this.g.get()).a(this);
        }
        a();
        a("Stopping the remote display Service");
        stopForeground(true);
        stopSelf();
        if (this.o != null) {
            Preconditions.checkMainThread("CastRemoteDisplayLocalService calls must be done on the main thread");
            a("removeMediaRouterCallback");
            this.o.a(this.r);
        }
        Context context = this.l;
        if (context != null) {
            ServiceConnection serviceConnection = this.m;
            if (serviceConnection != null) {
                try {
                    context.unbindService(serviceConnection);
                } catch (IllegalArgumentException unused) {
                    a("No need to unbind service, already unbound");
                }
                this.m = null;
                this.l = null;
            }
        }
        this.f = null;
        this.i = null;
        this.k = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r1.n == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r1.n.post(new com.google.android.gms.cast.aa(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r1.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        return;
     */
    private static void b(boolean z) {
        a.a("Stopping Service", new Object[0]);
        d.set(false);
        synchronized (c) {
            if (e == null) {
                a.b("Service is already being stopped", new Object[0]);
            } else {
                CastRemoteDisplayLocalService castRemoteDisplayLocalService = e;
                e = null;
            }
        }
    }

    public abstract void a();

    public IBinder onBind(Intent intent) {
        a("onBind");
        return this.s;
    }

    public void onCreate() {
        a("onCreate");
        super.onCreate();
        this.n = new Ca(getMainLooper());
        this.n.postDelayed(new Y(this), 100);
        if (this.q == null) {
            this.q = C0629c.a(this);
        }
        if (PlatformVersion.isAtLeastO()) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            NotificationChannel notificationChannel = new NotificationChannel("cast_remote_display_local_service", getString(C0681n.cast_notification_default_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        a("onStartCommand");
        this.p = true;
        return 2;
    }

    public static void b() {
        b(false);
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        a.b("[Instance: %s] %s", this, str);
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        a.a("[Instance: %s] %s", this, str);
    }
}
