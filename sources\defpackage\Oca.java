package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: Oca reason: default package */
/* compiled from: Link.kt */
public final class Oca {
    private final String a;

    @JsonCreator
    public Oca() {
        this(null, 1, null);
    }

    @JsonCreator
    public Oca(@JsonProperty("href") String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.Oca) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Oca) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Link(href=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ Oca(String str, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            str = null;
        }
        this(str);
    }
}
