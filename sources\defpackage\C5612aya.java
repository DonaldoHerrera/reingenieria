package defpackage;

import java.util.List;

/* renamed from: aya reason: default package and case insensitive filesystem */
/* compiled from: CleanupHelpersHolder.kt */
public final class C5612aya {
    private final List<Wda> a;

    public C5612aya(List<? extends Wda> list) {
        C7471uYa.b(list, "helpers");
        this.a = list;
    }

    public final List<Wda> a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C5612aya) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5612aya) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<Wda> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CleanupHelpersHolder(helpers=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
