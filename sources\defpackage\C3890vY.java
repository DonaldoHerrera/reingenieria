package defpackage;

import java.util.List;

/* renamed from: vY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryResult.kt */
public final class C3890vY {
    private final List<C3503cY> a;
    private final Throwable b;

    public C3890vY() {
        this(null, null, 3, null);
    }

    public C3890vY(List<? extends C3503cY> list, Throwable th) {
        C7471uYa.b(list, "cards");
        this.a = list;
        this.b = th;
    }

    public final List<C3503cY> a() {
        return this.a;
    }

    public final Throwable b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3890vY) {
                C3890vY vYVar = (C3890vY) obj;
                if (C7471uYa.a((Object) this.a, (Object) vYVar.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C3503cY> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Throwable th = this.b;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoveryResult(cards=");
        sb.append(this.a);
        sb.append(", syncError=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C3890vY(List list, Throwable th, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            list = C6918mWa.a();
        }
        if ((i & 2) != 0) {
            th = null;
        }
        this(list, th);
    }
}
