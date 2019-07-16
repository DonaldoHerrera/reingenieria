package com.soundcloud.android.discovery.systemplaylist;

/* compiled from: SystemPlaylistViewModelItem.kt */
public class V extends ca {
    private final W d;
    private final ea e;

    public V(W w, ea eaVar) {
        C7471uYa.b(w, "systemPlaylistItem");
        C7471uYa.b(eaVar, "trackClickParams");
        super(w, eaVar, C3519j.TRACK, null);
        this.d = w;
        this.e = eaVar;
    }

    public ea c() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) c(), (java.lang.Object) r3.c()) != false) goto L_0x0027;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof V) {
                V v = (V) obj;
                if (C7471uYa.a((Object) b(), (Object) v.b())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        W b = b();
        int i = 0;
        int hashCode = (b != null ? b.hashCode() : 0) * 31;
        ea c = c();
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemPlaylistTrack(systemPlaylistItem=");
        sb.append(b());
        sb.append(", trackClickParams=");
        sb.append(c());
        sb.append(")");
        return sb.toString();
    }

    public W b() {
        return this.d;
    }
}
