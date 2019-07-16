package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.ja;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.b reason: case insensitive filesystem */
/* compiled from: AccessTokenCache */
class C0532b {
    private final SharedPreferences a;
    private final a b;
    private N c;

    /* renamed from: com.facebook.b$a */
    /* compiled from: AccessTokenCache */
    static class a {
        a() {
        }

        public N a() {
            return new N(B.e());
        }
    }

    C0532b(SharedPreferences sharedPreferences, a aVar) {
        this.a = sharedPreferences;
        this.b = aVar;
    }

    private AccessToken c() {
        String string = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string != null) {
            try {
                return AccessToken.a(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private AccessToken d() {
        Bundle b2 = e().b();
        if (b2 == null || !N.d(b2)) {
            return null;
        }
        return AccessToken.a(b2);
    }

    private N e() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = this.b.a();
                }
            }
        }
        return this.c;
    }

    private boolean f() {
        return this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private boolean g() {
        return B.u();
    }

    public void a(AccessToken accessToken) {
        ja.a((Object) accessToken, "accessToken");
        try {
            this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.o().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public AccessToken b() {
        if (f()) {
            return c();
        }
        if (!g()) {
            return null;
        }
        AccessToken d = d();
        if (d == null) {
            return d;
        }
        a(d);
        e().a();
        return d;
    }

    public C0532b() {
        this(B.e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new a());
    }

    public void a() {
        this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (g()) {
            e().a();
        }
    }
}
