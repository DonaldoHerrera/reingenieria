package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.GraphRequest.b;
import com.facebook.internal.ia;
import com.facebook.internal.ja;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.g reason: case insensitive filesystem */
/* compiled from: AccessTokenManager */
public final class C0537g {
    private static volatile C0537g a;
    private final C1600pd b;
    private final C0532b c;
    private AccessToken d;
    /* access modifiers changed from: private */
    public AtomicBoolean e = new AtomicBoolean(false);
    private Date f = new Date(0);

    /* renamed from: com.facebook.g$a */
    /* compiled from: AccessTokenManager */
    private static class a {
        public String a;
        public int b;
        public Long c;

        private a() {
        }

        /* synthetic */ a(C0533c cVar) {
            this();
        }
    }

    C0537g(C1600pd pdVar, C0532b bVar) {
        ja.a((Object) pdVar, "localBroadcastManager");
        ja.a((Object) bVar, "accessTokenCache");
        this.b = pdVar;
        this.c = bVar;
    }

    static C0537g d() {
        if (a == null) {
            synchronized (C0537g.class) {
                if (a == null) {
                    a = new C0537g(C1600pd.a(B.e()), new C0532b());
                }
            }
        }
        return a;
    }

    private void f() {
        Context e2 = B.e();
        AccessToken c2 = AccessToken.c();
        AlarmManager alarmManager = (AlarmManager) e2.getSystemService("alarm");
        if (AccessToken.m() && c2.g() != null && alarmManager != null) {
            Intent intent = new Intent(e2, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            alarmManager.set(1, c2.g().getTime(), PendingIntent.getBroadcast(e2, 0, intent, 0));
        }
    }

    private boolean g() {
        boolean z = false;
        if (this.d == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        if (this.d.j().a() && valueOf.longValue() - this.f.getTime() > 3600000 && valueOf.longValue() - this.d.h().getTime() > 86400000) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (g()) {
            a((com.facebook.AccessToken.a) null);
        }
    }

    /* access modifiers changed from: 0000 */
    public AccessToken c() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        AccessToken b2 = this.c.b();
        if (b2 == null) {
            return false;
        }
        a(b2, false);
        return true;
    }

    private static GraphRequest b(AccessToken accessToken, b bVar) {
        AccessToken accessToken2 = accessToken;
        GraphRequest graphRequest = new GraphRequest(accessToken2, "me/permissions", new Bundle(), M.GET, bVar);
        return graphRequest;
    }

    /* access modifiers changed from: 0000 */
    public void a(AccessToken accessToken) {
        a(accessToken, true);
    }

    private void a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.d;
        this.d = accessToken;
        this.e.set(false);
        this.f = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.c.a(accessToken);
            } else {
                this.c.a();
                ia.a(B.e());
            }
        }
        if (!ia.a(accessToken2, accessToken)) {
            a(accessToken2, accessToken);
            f();
        }
    }

    /* access modifiers changed from: private */
    public void b(com.facebook.AccessToken.a aVar) {
        com.facebook.AccessToken.a aVar2 = aVar;
        AccessToken accessToken = this.d;
        if (accessToken == null) {
            if (aVar2 != null) {
                aVar2.a(new C0594t("No current access token to refresh"));
            }
        } else if (!this.e.compareAndSet(false, true)) {
            if (aVar2 != null) {
                aVar2.a(new C0594t("Refresh already in progress"));
            }
        } else {
            this.f = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            a aVar3 = new a(null);
            C0534d dVar = r0;
            HashSet hashSet4 = hashSet2;
            C0534d dVar2 = new C0534d(this, atomicBoolean, hashSet, hashSet2, hashSet3);
            K k = new K(b(accessToken, dVar), a(accessToken, (b) new C0535e(this, aVar3)));
            C0536f fVar = new C0536f(this, accessToken, aVar, atomicBoolean, aVar3, hashSet, hashSet4, hashSet3);
            k.a((com.facebook.K.a) fVar);
            k.f();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        AccessToken accessToken = this.d;
        a(accessToken, accessToken);
    }

    private void a(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(B.e(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.b.a(intent);
    }

    private static GraphRequest a(AccessToken accessToken, b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        AccessToken accessToken2 = accessToken;
        GraphRequest graphRequest = new GraphRequest(accessToken2, "oauth/access_token", bundle, M.GET, bVar);
        return graphRequest;
    }

    /* access modifiers changed from: 0000 */
    public void a(com.facebook.AccessToken.a aVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            b(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new C0533c(this, aVar));
        }
    }
}
