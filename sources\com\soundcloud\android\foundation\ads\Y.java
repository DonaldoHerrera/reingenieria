package com.soundcloud.android.foundation.ads;

/* compiled from: UrlWithPlaceholder.kt */
public final class Y {
    private final String a;

    public Y(String str) {
        C7471uYa.b(str, "raw");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.foundation.ads.Y) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Y) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UrlWithPlaceholder(raw=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
