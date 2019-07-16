package com.soundcloud.android.accounts;

/* renamed from: com.soundcloud.android.accounts.i reason: case insensitive filesystem */
/* compiled from: AutoValue_Me */
final class C2528i extends E {
    private final C3776gea a;
    private final C2212OT b;
    private final boolean c;

    C2528i(C3776gea gea, C2212OT ot, boolean z) {
        if (gea != null) {
            this.a = gea;
            this.b = ot;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null user");
    }

    public C2212OT a() {
        return this.b;
    }

    public C3776gea b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r4.c == r5.c()) goto L_0x0036;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e = (E) obj;
        if (this.a.equals(e.b())) {
            C2212OT ot = this.b;
            if (ot != null ? ot.equals(e.a()) : e.a() == null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        C2212OT ot = this.b;
        return ((hashCode ^ (ot == null ? 0 : ot.hashCode())) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Me{user=");
        sb.append(this.a);
        sb.append(", configuration=");
        sb.append(this.b);
        sb.append(", primaryEmailConfirmed=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
