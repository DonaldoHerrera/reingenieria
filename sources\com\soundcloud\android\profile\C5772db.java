package com.soundcloud.android.profile;

/* renamed from: com.soundcloud.android.profile.db reason: case insensitive filesystem */
/* compiled from: UserDetailsPresenter.kt */
public final class C5772db extends C5797ib {
    private final String b;

    public C5772db(String str) {
        C7471uYa.b(str, "bio");
        super(null);
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((com.soundcloud.android.profile.C5772db) r2).b) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5772db) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserBioItem(bio=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
