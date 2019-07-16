package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.ta reason: case insensitive filesystem */
public class C0793ta {
    private static final S a = S.a();
    private A b;
    private volatile La c;
    private volatile A d;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    private final La b(La la) {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = la;
                    this.d = A.a;
                    this.c = la;
                    this.d = A.a;
                }
            }
        }
        return this.c;
    }

    public final int a() {
        if (this.d != null) {
            return this.d.size();
        }
        if (this.c != null) {
            return this.c.d();
        }
        return 0;
    }

    public final La a(La la) {
        La la2 = this.c;
        this.b = null;
        this.d = null;
        this.c = la;
        return la2;
    }

    public final A b() {
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d != null) {
                A a2 = this.d;
                return a2;
            }
            this.d = this.c == null ? A.a : this.c.b();
            A a3 = this.d;
            return a3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0793ta)) {
            return false;
        }
        C0793ta taVar = (C0793ta) obj;
        La la = this.c;
        La la2 = taVar.c;
        return (la == null && la2 == null) ? b().equals(taVar.b()) : (la == null || la2 == null) ? la != null ? la.equals(taVar.b(la.j())) : b(la2.j()).equals(la2) : la.equals(la2);
    }

    public int hashCode() {
        return 1;
    }
}
