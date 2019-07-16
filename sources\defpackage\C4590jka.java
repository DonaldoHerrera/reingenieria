package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: jka reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_GoogleToken */
final class C4590jka extends C4665ska {
    private final String a;

    C4590jka(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null token");
    }

    @JsonProperty("token")
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4665ska)) {
            return false;
        }
        return this.a.equals(((C4665ska) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleToken{token=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
