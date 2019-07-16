package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: lka reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_SignInBody */
final class C4606lka extends C4683uka {
    private final C4630oka a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final String f;

    C4606lka(C4630oka oka, String str, String str2, String str3, boolean z, String str4) {
        if (oka != null) {
            this.a = oka;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (str3 != null) {
                        this.d = str3;
                        this.e = z;
                        if (str4 != null) {
                            this.f = str4;
                            return;
                        }
                        throw new NullPointerException("Null signature");
                    }
                    throw new NullPointerException("Null clientSecret");
                }
                throw new NullPointerException("Null clientId");
            }
            throw new NullPointerException("Null authMethod");
        }
        throw new NullPointerException("Null credentials");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("auth_method")
    public String a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("client_id")
    public String b() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("client_secret")
    public String c() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("create_if_not_found")
    public boolean d() {
        return this.e;
    }

    @JsonProperty("credentials")
    public C4630oka e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4683uka)) {
            return false;
        }
        C4683uka uka = (C4683uka) obj;
        if (!this.a.equals(uka.e()) || !this.b.equals(uka.a()) || !this.c.equals(uka.b()) || !this.d.equals(uka.c()) || this.e != uka.d() || !this.f.equals(uka.f())) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("signature")
    public String f() {
        return this.f;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignInBody{credentials=");
        sb.append(this.a);
        sb.append(", authMethod=");
        sb.append(this.b);
        sb.append(", clientId=");
        sb.append(this.c);
        sb.append(", clientSecret=");
        sb.append(this.d);
        sb.append(", createIfNotFound=");
        sb.append(this.e);
        sb.append(", signature=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
