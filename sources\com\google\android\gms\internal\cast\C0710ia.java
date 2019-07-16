package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.cast.ia reason: case insensitive filesystem */
public final class C0710ia {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private String e;

    private C0710ia(String str, boolean z) {
        Preconditions.checkNotEmpty(str, "The log tag cannot be null or empty.");
        this.a = str;
        this.b = str.length() <= 23;
        this.c = false;
        this.d = false;
    }

    private final String e(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.e)) {
            return str;
        }
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final void a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            str2 = String.format("[%s] ", new Object[]{str});
        }
        this.e = str2;
    }

    public final void b(String str, Object... objArr) {
        Log.e(this.a, e(str, objArr));
    }

    public final void c(String str, Object... objArr) {
        Log.i(this.a, e(str, objArr));
    }

    public final void d(String str, Object... objArr) {
        Log.w(this.a, e(str, objArr));
    }

    private final boolean a() {
        return this.c || (this.b && Log.isLoggable(this.a, 3));
    }

    public final void b(Throwable th, String str, Object... objArr) {
        Log.e(this.a, e(str, objArr), th);
    }

    public final void a(String str, Object... objArr) {
        if (a()) {
            Log.d(this.a, e(str, objArr));
        }
    }

    public final void a(Throwable th, String str, Object... objArr) {
        if (a()) {
            Log.d(this.a, e(str, objArr), th);
        }
    }

    public C0710ia(String str) {
        this(str, false);
    }
}
