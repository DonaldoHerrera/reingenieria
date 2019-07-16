package com.soundcloud.android.collections.data;

import java.util.Date;

/* renamed from: com.soundcloud.android.collections.data.s reason: case insensitive filesystem */
/* compiled from: Like.kt */
public final class C2862s implements C2852h {
    private final C3508cda a;
    private final Date b;

    public C2862s(C3508cda cda, Date date) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(date, "createdAt");
        this.a = cda;
        this.b = date;
    }

    public C3508cda a() {
        return this.a;
    }

    public Date b() {
        return this.b;
    }

    public C3508cda c() {
        return a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) b(), (java.lang.Object) r3.b()) != false) goto L_0x0027;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2862s) {
                C2862s sVar = (C2862s) obj;
                if (C7471uYa.a((Object) a(), (Object) sVar.a())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda a2 = a();
        int i = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        Date b2 = b();
        if (b2 != null) {
            i = b2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Like(urn=");
        sb.append(a());
        sb.append(", createdAt=");
        sb.append(b());
        sb.append(")");
        return sb.toString();
    }
}
