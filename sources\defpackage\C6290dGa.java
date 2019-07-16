package defpackage;

import java.util.Date;

/* renamed from: dGa reason: default package and case insensitive filesystem */
/* compiled from: TestDateProvider.kt */
public final class C6290dGa implements C5694cGa {
    private long a = System.currentTimeMillis();

    public long a() {
        return this.a;
    }

    public Date b() {
        return new Date(this.a);
    }
}
