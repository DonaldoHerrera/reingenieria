package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;

final class A implements Runnable {
    private final long a;
    private final WakeLock b = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
    private final FirebaseInstanceId c;
    private final C d;

    @VisibleForTesting
    A(FirebaseInstanceId firebaseInstanceId, C2510q qVar, C c2, long j) {
        this.c = firebaseInstanceId;
        this.d = c2;
        this.a = j;
        this.b.setReferenceCounted(false);
    }

    @VisibleForTesting
    private final boolean c() {
        String str = "FirebaseInstanceId";
        B e = this.c.e();
        if (!this.c.k() && !this.c.a(e)) {
            return true;
        }
        try {
            String f = this.c.f();
            if (f == null) {
                Log.e(str, "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Token successfully retrieved");
            }
            if (e == null || (e != null && !f.equals(e.b))) {
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", f);
                Context a2 = a();
                Intent intent2 = new Intent(a2, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                a2.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException | SecurityException e2) {
            String str2 = "Token retrieval failed: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final Context a() {
        return this.c.d().b();
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        try {
            if (C2518z.a().a(a())) {
                this.b.acquire();
            }
            this.c.a(true);
            if (!this.c.i()) {
                this.c.a(false);
            } else if (!C2518z.a().b(a()) || b()) {
                if (!c() || !this.d.a(this.c)) {
                    this.c.a(this.a);
                } else {
                    this.c.a(false);
                }
                if (C2518z.a().a(a())) {
                    this.b.release();
                }
            } else {
                new E(this).a();
                if (C2518z.a().a(a())) {
                    this.b.release();
                }
            }
        } finally {
            if (C2518z.a().a(a())) {
                this.b.release();
            }
        }
    }
}
