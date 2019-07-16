package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: zCa reason: default package and case insensitive filesystem */
/* compiled from: CollectionsUpdatesMessage.kt */
public final class C7792zCa {
    private final C4827DCa a;
    private final C4827DCa b;
    private final C4827DCa c;

    @JsonCreator
    public C7792zCa() {
        this(null, null, null, 7, null);
    }

    @JsonCreator
    public C7792zCa(@JsonProperty("likes") C4827DCa dCa, @JsonProperty("posts") C4827DCa dCa2, @JsonProperty("followings") C4827DCa dCa3) {
        this.a = dCa;
        this.b = dCa2;
        this.c = dCa3;
    }

    public final C4827DCa a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7792zCa) {
                C7792zCa zca = (C7792zCa) obj;
                if (C7471uYa.a((Object) this.a, (Object) zca.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) zca.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C4827DCa dCa = this.a;
        int i = 0;
        int hashCode = (dCa != null ? dCa.hashCode() : 0) * 31;
        C4827DCa dCa2 = this.b;
        int hashCode2 = (hashCode + (dCa2 != null ? dCa2.hashCode() : 0)) * 31;
        C4827DCa dCa3 = this.c;
        if (dCa3 != null) {
            i = dCa3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionsUpdates(likes=");
        sb.append(this.a);
        sb.append(", posts=");
        sb.append(this.b);
        sb.append(", followings=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C7792zCa(C4827DCa dCa, C4827DCa dCa2, C4827DCa dCa3, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            dCa = null;
        }
        if ((i & 2) != 0) {
            dCa2 = null;
        }
        if ((i & 4) != 0) {
            dCa3 = null;
        }
        this(dCa, dCa2, dCa3);
    }
}
