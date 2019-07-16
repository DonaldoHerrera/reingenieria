package com.soundcloud.android.discovery.systemplaylist;

/* compiled from: SystemPlaylistItemMapper.kt */
public final class G {
    private final C3508cda a;
    private final String b;

    public G(C3508cda cda, String str) {
        this.a = cda;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final C3508cda b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof G) {
                G g = (G) obj;
                if (C7471uYa.a((Object) this.a, (Object) g.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemPlaylistParams(urn=");
        sb.append(this.a);
        sb.append(", permalink=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
