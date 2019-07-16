package com.soundcloud.android.profile;

import com.soundcloud.android.tracks.C6185ma;

/* compiled from: UserPlayableItem.kt */
public final class be implements C5818mc {
    private final C3508cda a;
    private final C6185ma b;
    private final ce c;

    public be(C6185ma maVar, ce ceVar) {
        C7471uYa.b(maVar, "trackItem");
        C7471uYa.b(ceVar, "clickParams");
        this.b = maVar;
        this.c = ceVar;
        C3508cda a2 = this.b.a();
        C7471uYa.a((Object) a2, "trackItem.urn");
        this.a = a2;
    }

    public C3508cda a() {
        return this.a;
    }

    public final ce b() {
        return this.c;
    }

    public final C6185ma c() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof be) {
                be beVar = (be) obj;
                if (C7471uYa.a((Object) this.b, (Object) beVar.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C6185ma maVar = this.b;
        int i = 0;
        int hashCode = (maVar != null ? maVar.hashCode() : 0) * 31;
        ce ceVar = this.c;
        if (ceVar != null) {
            i = ceVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserTracksItem(trackItem=");
        sb.append(this.b);
        sb.append(", clickParams=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
