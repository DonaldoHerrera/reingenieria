package com.soundcloud.android.discovery.systemplaylist;

import com.soundcloud.android.tracks.C6185ma;

/* compiled from: SystemPlaylistItem.kt */
public final class W extends C3532x {
    private final C3508cda d;
    private final C3508cda e;
    private final String f;
    private final C6185ma g;

    public W(C3508cda cda, C3508cda cda2, String str, C6185ma maVar) {
        C7471uYa.b(cda, "systemPlaylistUrn");
        C7471uYa.b(maVar, "trackItem");
        super(cda, cda2, str, null);
        this.d = cda;
        this.e = cda2;
        this.f = str;
        this.g = maVar;
    }

    public C3508cda a() {
        return this.e;
    }

    public C3508cda b() {
        return this.d;
    }

    public String c() {
        return this.f;
    }

    public final C6185ma d() {
        return this.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.g, (java.lang.Object) r3.g) != false) goto L_0x003f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W) {
                W w = (W) obj;
                if (C7471uYa.a((Object) b(), (Object) w.b())) {
                    if (C7471uYa.a((Object) a(), (Object) w.a())) {
                        if (C7471uYa.a((Object) c(), (Object) w.c())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda b = b();
        int i = 0;
        int hashCode = (b != null ? b.hashCode() : 0) * 31;
        C3508cda a = a();
        int hashCode2 = (hashCode + (a != null ? a.hashCode() : 0)) * 31;
        String c = c();
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        C6185ma maVar = this.g;
        if (maVar != null) {
            i = maVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemPlaylistTrackItem(systemPlaylistUrn=");
        sb.append(b());
        sb.append(", queryUrn=");
        sb.append(a());
        sb.append(", trackingFeatureName=");
        sb.append(c());
        sb.append(", trackItem=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
