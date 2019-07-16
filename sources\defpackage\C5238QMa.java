package defpackage;

import android.util.Log;

/* renamed from: QMa reason: default package and case insensitive filesystem */
/* compiled from: DefaultLogger */
public class C5238QMa implements C5701cNa {
    private int a;

    public C5238QMa(int i) {
        this.a = i;
    }

    public void a(String str, String str2, Throwable th) {
        if (isLoggable(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    public void b(String str, String str2, Throwable th) {
        if (isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public void c(String str, String str2, Throwable th) {
        if (isLoggable(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (isLoggable(str, 2)) {
            Log.v(str, str2, th);
        }
    }

    public void e(String str, String str2, Throwable th) {
        if (isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    public void i(String str, String str2) {
        c(str, str2, null);
    }

    public boolean isLoggable(String str, int i) {
        return this.a <= i || Log.isLoggable(str, i);
    }

    public void log(int i, String str, String str2) {
        a(i, str, str2, false);
    }

    public void w(String str, String str2) {
        b(str, str2, null);
    }

    public C5238QMa() {
        this.a = 4;
    }

    public void a(String str, String str2) {
        d(str, str2, null);
    }

    public void d(String str, String str2) {
        a(str, str2, null);
    }

    public void e(String str, String str2) {
        e(str, str2, null);
    }

    public void a(int i, String str, String str2, boolean z) {
        if (z || isLoggable(str, i)) {
            Log.println(i, str, str2);
        }
    }
}
