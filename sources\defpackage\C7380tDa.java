package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: tDa reason: default package and case insensitive filesystem */
/* compiled from: MediaPayload.kt */
public final class C7380tDa {
    private final List<C7449uDa> a;

    @JsonCreator
    public C7380tDa(@JsonProperty("transcodings") List<C7449uDa> list) {
        C7471uYa.b(list, "transcodings");
        this.a = list;
    }

    public final List<C7449uDa> a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C7380tDa) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7380tDa) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C7449uDa> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaPayload(transcodings=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
