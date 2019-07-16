package com.soundcloud.android.discovery.systemplaylist;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.s reason: case insensitive filesystem */
/* compiled from: SystemPlaylistViewModelItem.kt */
public class C3527s extends ca {
    private final C3528t d;
    private final ea e;

    public C3527s(C3528t tVar, ea eaVar) {
        C7471uYa.b(tVar, "systemPlaylistItem");
        C7471uYa.b(eaVar, "trackClickParams");
        super(tVar, eaVar, C3519j.HEADER, null);
        this.d = tVar;
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
            if (obj instanceof C3527s) {
                C3527s sVar = (C3527s) obj;
                if (C7471uYa.a((Object) b(), (Object) sVar.b())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3528t b = b();
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
        sb.append("SystemPlaylistHeader(systemPlaylistItem=");
        sb.append(b());
        sb.append(", trackClickParams=");
        sb.append(c());
        sb.append(")");
        return sb.toString();
    }

    public C3528t b() {
        return this.d;
    }
}
