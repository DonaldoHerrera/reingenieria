package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class b {
    private static final Lock a = new ReentrantLock();
    private static b b;
    private final Lock c = new ReentrantLock();
    private final SharedPreferences d;

    @VisibleForTesting
    private b(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @KeepForSdk
    public static b a(Context context) {
        Preconditions.checkNotNull(context);
        a.lock();
        try {
            if (b == null) {
                b = new b(context.getApplicationContext());
            }
            return b;
        } finally {
            a.unlock();
        }
    }

    @KeepForSdk
    public GoogleSignInAccount b() {
        return a(c("defaultGoogleSignInAccount"));
    }

    @KeepForSdk
    public GoogleSignInOptions c() {
        return b(c("defaultGoogleSignInAccount"));
    }

    @KeepForSdk
    public String d() {
        return c("refreshToken");
    }

    public final void e() {
        String str = "defaultGoogleSignInAccount";
        String c2 = c(str);
        d(str);
        if (!TextUtils.isEmpty(c2)) {
            d(b("googleSignInAccount", c2));
            d(b("googleSignInOptions", c2));
        }
    }

    private final void d(String str) {
        this.c.lock();
        try {
            this.d.edit().remove(str).apply();
        } finally {
            this.c.unlock();
        }
    }

    @VisibleForTesting
    private final GoogleSignInOptions b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c2 = c(b("googleSignInOptions", str));
        if (c2 != null) {
            try {
                return GoogleSignInOptions.a(c2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private final String c(String str) {
        this.c.lock();
        try {
            return this.d.getString(str, null);
        } finally {
            this.c.unlock();
        }
    }

    private static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @KeepForSdk
    public void a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        a("defaultGoogleSignInAccount", googleSignInAccount.ba());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String ba = googleSignInAccount.ba();
        a(b("googleSignInAccount", ba), googleSignInAccount.ca());
        a(b("googleSignInOptions", ba), googleSignInOptions.X());
    }

    private final void a(String str, String str2) {
        this.c.lock();
        try {
            this.d.edit().putString(str, str2).apply();
        } finally {
            this.c.unlock();
        }
    }

    @VisibleForTesting
    private final GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c2 = c(b("googleSignInAccount", str));
        if (c2 != null) {
            try {
                return GoogleSignInAccount.a(c2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @KeepForSdk
    public void a() {
        this.c.lock();
        try {
            this.d.edit().clear().apply();
        } finally {
            this.c.unlock();
        }
    }
}
