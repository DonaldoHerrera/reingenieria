package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.k.b;
import androidx.core.app.k.d;
import androidx.core.app.k.e;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class f {
    private final Executor a;
    private final Context b;
    private final e c;
    private final Bundle d;

    public f(Context context, Bundle bundle, Executor executor) {
        this.a = executor;
        this.b = context;
        this.d = bundle;
        this.c = new e(context, context.getPackageName());
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        boolean z;
        if ("1".equals(e.a(this.d, "gcm.n.noui"))) {
            return true;
        }
        if (!((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10);
            }
            int myPid = Process.myPid();
            List runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                    if (runningAppProcessInfo.pid == myPid) {
                        if (runningAppProcessInfo.importance == 100) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        g a2 = g.a(e.a(this.d, "gcm.n.image"));
        if (a2 != null) {
            a2.a(this.a);
        }
        d a3 = this.c.a(this.d);
        d dVar = a3.a;
        String str = "FirebaseMessaging";
        if (a2 != null) {
            try {
                Bitmap bitmap = (Bitmap) Zy.a(a2.a(), 5, TimeUnit.SECONDS);
                dVar.a(bitmap);
                b bVar = new b();
                bVar.b(bitmap);
                bVar.a((Bitmap) null);
                dVar.a((e) bVar);
            } catch (ExecutionException unused) {
            } catch (InterruptedException unused2) {
                Log.w(str, "Interrupted while downloading image, showing notification without it");
                a2.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused3) {
                Log.w(str, "Failed to download image in time, showing notification without it");
                a2.close();
            }
        }
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(a3.b, 0, a3.a.a());
        return true;
    }
}
