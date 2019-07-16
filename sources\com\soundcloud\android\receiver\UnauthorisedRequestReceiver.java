package com.soundcloud.android.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.lang.ref.WeakReference;

public class UnauthorisedRequestReceiver extends BroadcastReceiver {
    private final C3218qP a;
    private final WeakReference<C0370l> b;
    private final C2437_W c;

    public static class a extends DefaultActivityLightCycle<AppCompatActivity> {
        private UnauthorisedRequestReceiver a;

        /* renamed from: a */
        public void onPause(AppCompatActivity appCompatActivity) {
            a(appCompatActivity, this.a);
        }

        /* renamed from: b */
        public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
            this.a = new UnauthorisedRequestReceiver(appCompatActivity.getApplicationContext(), appCompatActivity.getSupportFragmentManager());
        }

        private void a(AppCompatActivity appCompatActivity, BroadcastReceiver broadcastReceiver) {
            try {
                appCompatActivity.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                C7316sHa.a("Couldn't unregister receiver", (Throwable) e);
            }
        }

        /* renamed from: b */
        public void onResume(AppCompatActivity appCompatActivity) {
            appCompatActivity.registerReceiver(this.a, new IntentFilter("SoundCloudApplication.unauthorized"));
        }
    }

    public UnauthorisedRequestReceiver(Context context, C0370l lVar) {
        this(C3218qP.a(context), lVar, new C2437_W());
    }

    private C2437_W a(C2437_W _w) {
        _w.setCancelable(false);
        return _w;
    }

    public void onReceive(Context context, Intent intent) {
        if (this.a.b().booleanValue()) {
            this.a.a();
            C0370l lVar = (C0370l) this.b.get();
            if (lVar != null) {
                String str = "TokenExpiredDialog";
                if (lVar.a(str) == null) {
                    C5232QGa.a((C0361c) this.c, lVar, str);
                }
            }
        }
    }

    protected UnauthorisedRequestReceiver(C3218qP qPVar, C0370l lVar, C2437_W _w) {
        this.a = qPVar;
        this.b = new WeakReference<>(lVar);
        a(_w);
        this.c = _w;
    }
}
