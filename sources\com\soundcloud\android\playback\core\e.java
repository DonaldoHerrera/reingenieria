package com.soundcloud.android.playback.core;

/* compiled from: MediaType.kt */
public final class e {
    private final String a;
    private final String b;

    public e(String str, String str2) {
        C7471uYa.b(str, "protocol");
        C7471uYa.b(str2, "mimeType");
        this.a = str;
        this.b = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (C7471uYa.a((Object) this.a, (Object) eVar.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaType(protocol=");
        sb.append(this.a);
        sb.append(", mimeType=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
