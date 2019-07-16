package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: MAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncResponse.kt */
public final class C5105MAa {
    private final C5136NAa a;
    private final C5136NAa b;
    private final C5136NAa c;

    @JsonCreator
    public C5105MAa() {
        this(null, null, null, 7, null);
    }

    @JsonCreator
    public C5105MAa(@JsonProperty("likes") C5136NAa nAa, @JsonProperty("posts") C5136NAa nAa2, @JsonProperty("followings") C5136NAa nAa3) {
        this.a = nAa;
        this.b = nAa2;
        this.c = nAa3;
    }

    public final C5136NAa a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5105MAa) {
                C5105MAa mAa = (C5105MAa) obj;
                if (C7471uYa.a((Object) this.a, (Object) mAa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) mAa.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C5136NAa nAa = this.a;
        int i = 0;
        int hashCode = (nAa != null ? nAa.hashCode() : 0) * 31;
        C5136NAa nAa2 = this.b;
        int hashCode2 = (hashCode + (nAa2 != null ? nAa2.hashCode() : 0)) * 31;
        C5136NAa nAa3 = this.c;
        if (nAa3 != null) {
            i = nAa3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdatedCollections(likes=");
        sb.append(this.a);
        sb.append(", posts=");
        sb.append(this.b);
        sb.append(", followings=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C5105MAa(C5136NAa nAa, C5136NAa nAa2, C5136NAa nAa3, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            nAa = null;
        }
        if ((i & 2) != 0) {
            nAa2 = null;
        }
        if ((i & 4) != 0) {
            nAa3 = null;
        }
        this(nAa, nAa2, nAa3);
    }
}
