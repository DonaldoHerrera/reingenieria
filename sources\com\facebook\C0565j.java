package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.ia;
import com.facebook.internal.ja;

/* renamed from: com.facebook.j reason: case insensitive filesystem */
/* compiled from: AccessTokenTracker */
public abstract class C0565j {
    /* access modifiers changed from: private */
    public static final String a = "j";
    private final BroadcastReceiver b;
    private final C1600pd c;
    private boolean d = false;

    /* renamed from: com.facebook.j$a */
    /* compiled from: AccessTokenTracker */
    private class a extends BroadcastReceiver {
        private a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                ia.b(C0565j.a, "AccessTokenChanged");
                C0565j.this.a((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public C0565j() {
        ja.c();
        this.b = new a();
        this.c = C1600pd.a(B.e());
        c();
    }

    private void e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.c.a(this.b, intentFilter);
    }

    /* access modifiers changed from: protected */
    public abstract void a(AccessToken accessToken, AccessToken accessToken2);

    public boolean b() {
        return this.d;
    }

    public void c() {
        if (!this.d) {
            e();
            this.d = true;
        }
    }

    public void d() {
        if (this.d) {
            this.c.a(this.b);
            this.d = false;
        }
    }
}
