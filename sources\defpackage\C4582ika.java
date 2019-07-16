package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: ika reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_FacebookToken */
final class C4582ika extends C4656rka {
    private final String a;

    C4582ika(String str) {
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
        if (!(obj instanceof C4656rka)) {
            return false;
        }
        return this.a.equals(((C4656rka) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FacebookToken{token=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
