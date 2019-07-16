package defpackage;

import android.app.PendingIntent;

/* renamed from: fA reason: default package and case insensitive filesystem */
public final class C1284fA {
    private final String a;
    private final int b;
    private final int c;
    private final int d;
    private final PendingIntent e;
    private final PendingIntent f;

    public C1284fA(String str, int i, int i2, int i3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = pendingIntent;
        this.f = pendingIntent2;
    }

    public final int a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final PendingIntent a(int i) {
        if (i == 0) {
            return this.f;
        }
        if (i == 1) {
            return this.e;
        }
        return null;
    }

    public final int b() {
        return this.d;
    }

    public final boolean b(int i) {
        return i == 0 ? this.f != null : i == 1 && this.e != null;
    }

    public final int c() {
        return this.c;
    }
}
