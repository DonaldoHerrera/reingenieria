package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: hka reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_EmailSignUpBody */
final class C4574hka extends C4647qka {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final C4638pka f;
    private final String g;

    C4574hka(String str, String str2, String str3, String str4, String str5, C4638pka pka, String str6) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = str5;
                        this.f = pka;
                        if (str6 != null) {
                            this.g = str6;
                            return;
                        }
                        throw new NullPointerException("Null signature");
                    }
                    throw new NullPointerException("Null password");
                }
                throw new NullPointerException("Null email");
            }
            throw new NullPointerException("Null clientSecret");
        }
        throw new NullPointerException("Null clientId");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("client_id")
    public String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("client_secret")
    public String b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("dob")
    public C4638pka c() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("email_address")
    public String d() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("gender")
    public String e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r4.g.equals(r5.g()) != false) goto L_0x0073;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4647qka)) {
            return false;
        }
        C4647qka qka = (C4647qka) obj;
        if (this.a.equals(qka.a()) && this.b.equals(qka.b()) && this.c.equals(qka.d()) && this.d.equals(qka.f())) {
            String str = this.e;
            if (str != null ? str.equals(qka.e()) : qka.e() == null) {
                C4638pka pka = this.f;
                if (pka != null ? pka.equals(qka.c()) : qka.c() == null) {
                }
            }
        }
        z = false;
        return z;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("password")
    public String f() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("signature")
    public String g() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.e;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        C4638pka pka = this.f;
        if (pka != null) {
            i = pka.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.g.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmailSignUpBody{clientId=");
        sb.append(this.a);
        sb.append(", clientSecret=");
        sb.append(this.b);
        sb.append(", email=");
        sb.append(this.c);
        sb.append(", password=");
        sb.append(this.d);
        sb.append(", gender=");
        sb.append(this.e);
        sb.append(", dateOfBirth=");
        sb.append(this.f);
        sb.append(", signature=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
