package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: kka reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ResetPasswordBody */
final class C4598kka extends C4674tka {
    private final String a;

    C4598kka(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null identifier");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("identifier")
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4674tka)) {
            return false;
        }
        return this.a.equals(((C4674tka) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResetPasswordBody{identifier=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
