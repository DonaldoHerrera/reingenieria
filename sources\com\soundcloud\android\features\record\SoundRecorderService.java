package com.soundcloud.android.features.record;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import androidx.core.app.k.d;
import androidx.core.app.n;
import com.soundcloud.android.features.record.G.h;
import com.soundcloud.flippernative.BuildConfig;
import java.lang.ref.WeakReference;

public class SoundRecorderService extends Service {
    /* access modifiers changed from: private */
    public static final String a = "SoundRecorderService";
    private final IBinder b = new ca(this);
    /* access modifiers changed from: private */
    public ba c;
    private WakeLock d;
    private final a e = new a(this);
    private PendingIntent f;
    private n g;
    private C1600pd h;
    /* access modifiers changed from: private */
    public long i;
    /* access modifiers changed from: private */
    public int j;
    J k;
    private final BroadcastReceiver l = new da(this);

    private static final class a extends Handler {
        private final WeakReference<SoundRecorderService> a;

        a(SoundRecorderService soundRecorderService) {
            this.a = new WeakReference<>(soundRecorderService);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            SoundRecorderService soundRecorderService = (SoundRecorderService) this.a.get();
            if (soundRecorderService != null && !soundRecorderService.c.i()) {
                Log.d(SoundRecorderService.a, "DelayedStopHandler: stopping service");
                soundRecorderService.stopSelf(soundRecorderService.j);
            }
        }
    }

    /* access modifiers changed from: private */
    public void f() {
        startForeground(0, c());
    }

    public IBinder onBind(Intent intent) {
        return this.b;
    }

    public void onCreate() {
        super.onCreate();
        dagger.android.a.a((Service) this);
        Log.d(a, "create service started");
        this.g = n.a((Context) this);
        this.d = ((PowerManager) getSystemService("power")).newWakeLock(536870918, a);
        this.c = ba.a((Context) this, this.k);
        this.h = C1600pd.a((Context) this);
        this.h.a(this.l, ba.b());
    }

    public void onDestroy() {
        super.onDestroy();
        this.e.removeCallbacksAndMessages(null);
        this.h.a(this.l);
        a(0);
        a(1);
        d();
        this.d = null;
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        this.j = i3;
        return 1;
    }

    private Notification c() {
        this.f = PendingIntent.getActivity(this, 0, this.k.a(com.soundcloud.android.features.record.J.a.VIEW), 134217728);
        return a(getString(G.n.cloud_recorder_event_title), getString(G.n.cloud_recorder_event_message_recordtime, new Object[]{BuildConfig.VERSION_NAME}), "channel_record", this.f).a();
    }

    private void d() {
        WakeLock wakeLock = this.d;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.d.release();
        }
    }

    private void e() {
        Log.d(a, "scheduleServiceShutdownCheck()");
        this.e.removeCallbacksAndMessages(null);
        this.e.sendEmptyMessageDelayed(0, 30000);
    }

    /* access modifiers changed from: private */
    public void b(int i2) {
        this.g.a(i2);
    }

    /* access modifiers changed from: private */
    public void b() {
        WakeLock wakeLock = this.d;
        if (wakeLock != null && !wakeLock.isHeld()) {
            this.d.acquire();
        }
    }

    private d a(String str, String str2, String str3, PendingIntent pendingIntent) {
        d dVar = new d(this, str3);
        dVar.e(h.ic_notification_cloud);
        dVar.c((CharSequence) str);
        dVar.b((CharSequence) str2);
        dVar.a(pendingIntent);
        dVar.c(true);
        dVar.f(1);
        return dVar;
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        b(i2);
        e();
        if (!this.c.i()) {
            stopForeground(true);
        }
    }

    /* access modifiers changed from: private */
    public void a(Recording recording) {
        startForeground(1, a(this.k.a(com.soundcloud.android.features.record.J.a.VIEW), recording));
    }

    private Notification a(Intent intent, Recording recording) {
        return a(getString(G.n.cloud_recorder_playback_event_title), recording.e(getApplicationContext()), "channel_record", PendingIntent.getActivity(getApplicationContext(), 0, intent, 134217728)).a();
    }

    /* access modifiers changed from: private */
    public void a(long j2) {
        String str = "channel_record";
        this.g.a(0, a(getString(G.n.cloud_recorder_event_title), getString(G.n.cloud_recorder_event_message_recordtime, new Object[]{C7315sGa.a(getResources(), (double) j2, false)}), str, this.f).a());
    }
}
