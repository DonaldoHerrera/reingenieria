package defpackage;

import java.io.Serializable;

/* renamed from: MVa reason: default package */
/* compiled from: Tuples.kt */
public final class MVa<A, B, C> implements Serializable {
    private final A a;
    private final B b;
    private final C c;

    public MVa(A a2, B b2, C c2) {
        this.a = a2;
        this.b = b2;
        this.c = c2;
    }

    public final A a() {
        return this.a;
    }

    public final B b() {
        return this.b;
    }

    public final C c() {
        return this.c;
    }

    public final C d() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MVa) {
                MVa mVa = (MVa) obj;
                if (C7471uYa.a((Object) this.a, (Object) mVa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) mVa.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a2 = this.a;
        int i = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.b;
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        C c2 = this.c;
        if (c2 != null) {
            i = c2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.a);
        String str = ", ";
        sb.append(str);
        sb.append(this.b);
        sb.append(str);
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
