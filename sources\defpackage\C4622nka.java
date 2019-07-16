package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: nka reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_UserCredentials */
final class C4622nka extends C4710xka {
    private final String a;
    private final String b;

    C4622nka(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null password");
        }
        throw new NullPointerException("Null identifier");
    }

    @JsonProperty("identifier")
    public String a() {
        return this.a;
    }

    @JsonProperty("password")
    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4710xka)) {
            return false;
        }
        C4710xka xka = (C4710xka) obj;
        if (!this.a.equals(xka.a()) || !this.b.equals(xka.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserCredentials{identifier=");
        sb.append(this.a);
        sb.append(", password=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
