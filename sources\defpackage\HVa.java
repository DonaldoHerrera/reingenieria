package defpackage;

import java.io.Serializable;

/* renamed from: HVa reason: default package */
/* compiled from: Tuples.kt */
public final class HVa<A, B> implements Serializable {
    private final A a;
    private final B b;

    public HVa(A a2, B b2) {
        this.a = a2;
        this.b = b2;
    }

    public final A a() {
        return this.a;
    }

    public final B b() {
        return this.b;
    }

    public final A c() {
        return this.a;
    }

    public final B d() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HVa) {
                HVa hVa = (HVa) obj;
                if (C7471uYa.a((Object) this.a, (Object) hVa.a)) {
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
        if (b2 != null) {
            i = b2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
