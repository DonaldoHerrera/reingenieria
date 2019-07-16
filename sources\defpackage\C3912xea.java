package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: xea reason: default package and case insensitive filesystem */
/* compiled from: ApiPolicyInfoAndMedia.kt */
public final class C3912xea {
    private final C3904wea a;
    private final Zda b;

    @JsonCreator
    public C3912xea(@JsonProperty("policy") C3904wea wea, @JsonProperty("media") Zda zda) {
        C7471uYa.b(wea, "apiPolicyInfo");
        this.a = wea;
        this.b = zda;
    }

    public final C3904wea a() {
        return this.a;
    }

    public final Zda b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3912xea) {
                C3912xea xea = (C3912xea) obj;
                if (C7471uYa.a((Object) this.a, (Object) xea.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3904wea wea = this.a;
        int i = 0;
        int hashCode = (wea != null ? wea.hashCode() : 0) * 31;
        Zda zda = this.b;
        if (zda != null) {
            i = zda.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiPolicyInfoAndMedia(apiPolicyInfo=");
        sb.append(this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
