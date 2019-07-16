package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: uAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncResponse.kt */
public final class C7443uAa {
    private final C4949HAa a;
    private final C4949HAa b;
    private final C4949HAa c;

    @JsonCreator
    public C7443uAa() {
        this(null, null, null, 7, null);
    }

    @JsonCreator
    public C7443uAa(@JsonProperty("likes") C4949HAa hAa, @JsonProperty("posts") C4949HAa hAa2, @JsonProperty("followings") C4949HAa hAa3) {
        this.a = hAa;
        this.b = hAa2;
        this.c = hAa3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7443uAa) {
                C7443uAa uaa = (C7443uAa) obj;
                if (C7471uYa.a((Object) this.a, (Object) uaa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) uaa.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C4949HAa hAa = this.a;
        int i = 0;
        int hashCode = (hAa != null ? hAa.hashCode() : 0) * 31;
        C4949HAa hAa2 = this.b;
        int hashCode2 = (hashCode + (hAa2 != null ? hAa2.hashCode() : 0)) * 31;
        C4949HAa hAa3 = this.c;
        if (hAa3 != null) {
            i = hAa3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionErrors(likes=");
        sb.append(this.a);
        sb.append(", posts=");
        sb.append(this.b);
        sb.append(", followings=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C7443uAa(C4949HAa hAa, C4949HAa hAa2, C4949HAa hAa3, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            hAa = null;
        }
        if ((i & 2) != 0) {
            hAa2 = null;
        }
        if ((i & 4) != 0) {
            hAa3 = null;
        }
        this(hAa, hAa2, hAa3);
    }
}
