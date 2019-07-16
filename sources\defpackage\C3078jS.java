package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: jS reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_CastCredentials */
final class C3078jS extends C3183oS {
    private final String a;

    C3078jS(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null authorization");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("authorization")
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3183oS)) {
            return false;
        }
        return this.a.equals(((C3183oS) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CastCredentials{authorization=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
