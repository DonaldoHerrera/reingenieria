package defpackage;

import java.util.Date;

/* renamed from: bGa reason: default package and case insensitive filesystem */
/* compiled from: DateProvider.kt */
public final class C5626bGa implements C5694cGa {
    public static final C5626bGa a = new C5626bGa();

    private C5626bGa() {
    }

    public long a() {
        return System.currentTimeMillis();
    }

    public Date b() {
        return new Date();
    }

    public boolean equals(Object obj) {
        return obj instanceof C5626bGa;
    }

    public int hashCode() {
        return C5626bGa.class.hashCode();
    }
}
