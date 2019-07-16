package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: nO reason: default package and case insensitive filesystem */
/* compiled from: MobilePlaySession.kt */
public final class C3150nO {
    private final List<C2320UN> a;

    @JsonCreator
    public C3150nO(List<C2320UN> list) {
        C7471uYa.b(list, "mobilPlaySessions");
        this.a = list;
    }

    @JsonProperty("mobile_play_sessions")
    public final List<C2320UN> a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C3150nO) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3150nO) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C2320UN> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MobilePlaySessions(mobilPlaySessions=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
