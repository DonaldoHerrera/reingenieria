package defpackage;

import java.util.List;

/* renamed from: bqa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailsViewModel.kt */
public final class C5664bqa {
    private final List<C3508cda> a;

    public C5664bqa(List<C3508cda> list) {
        C7471uYa.b(list, "allTracks");
        this.a = list;
    }

    public final List<C3508cda> a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C5664bqa) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5664bqa) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C3508cda> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OnShuffleParams(allTracks=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
