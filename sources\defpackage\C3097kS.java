package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: kS reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_CastMessage */
final class C3097kS extends C3241rS {
    private final String a;
    private final C3261sS b;

    C3097kS(String str, C3261sS sSVar) {
        if (str != null) {
            this.a = str;
            this.b = sSVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("payload")
    public C3261sS a() {
        return this.b;
    }

    @JsonProperty("type")
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3241rS)) {
            return false;
        }
        C3241rS rSVar = (C3241rS) obj;
        if (this.a.equals(rSVar.b())) {
            C3261sS sSVar = this.b;
            if (sSVar != null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        C3261sS sSVar = this.b;
        return hashCode ^ (sSVar == null ? 0 : sSVar.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CastMessage{type=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
