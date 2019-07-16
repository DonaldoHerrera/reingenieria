package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: HAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncResponse.kt */
public final class C4949HAa {
    private final C4980IAa a;
    private final C4980IAa b;
    private final C4980IAa c;

    @JsonCreator
    public C4949HAa() {
        this(null, null, null, 7, null);
    }

    @JsonCreator
    public C4949HAa(@JsonProperty("tracks") C4980IAa iAa, @JsonProperty("playlists") C4980IAa iAa2, @JsonProperty("users") C4980IAa iAa3) {
        this.a = iAa;
        this.b = iAa2;
        this.c = iAa3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4949HAa) {
                C4949HAa hAa = (C4949HAa) obj;
                if (C7471uYa.a((Object) this.a, (Object) hAa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) hAa.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C4980IAa iAa = this.a;
        int i = 0;
        int hashCode = (iAa != null ? iAa.hashCode() : 0) * 31;
        C4980IAa iAa2 = this.b;
        int hashCode2 = (hashCode + (iAa2 != null ? iAa2.hashCode() : 0)) * 31;
        C4980IAa iAa3 = this.c;
        if (iAa3 != null) {
            i = iAa3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntityErrors(tracks=");
        sb.append(this.a);
        sb.append(", playlists=");
        sb.append(this.b);
        sb.append(", users=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C4949HAa(C4980IAa iAa, C4980IAa iAa2, C4980IAa iAa3, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            iAa = null;
        }
        if ((i & 2) != 0) {
            iAa2 = null;
        }
        if ((i & 4) != 0) {
            iAa3 = null;
        }
        this(iAa, iAa2, iAa3);
    }
}
