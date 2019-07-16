package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: mka reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_SocialSignUpBody */
final class C4614mka extends C4701wka {
    private final String a;
    private final String b;
    private final String c;
    private final C4630oka d;
    private final String e;
    private final C4638pka f;
    private final String g;

    C4614mka(String str, String str2, String str3, C4630oka oka, String str4, C4638pka pka, String str5) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (oka != null) {
                        this.d = oka;
                        this.e = str4;
                        this.f = pka;
                        if (str5 != null) {
                            this.g = str5;
                            return;
                        }
                        throw new NullPointerException("Null signature");
                    }
                    throw new NullPointerException("Null credentials");
                }
                throw new NullPointerException("Null authMethod");
            }
            throw new NullPointerException("Null clientSecret");
        }
        throw new NullPointerException("Null clientId");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("auth_method")
    public String a() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("client_id")
    public String b() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("client_secret")
    public String c() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("credentials")
    public C4630oka d() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("dob")
    public C4638pka e() {
        return this.f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r4.g.equals(r5.g()) != false) goto L_0x0073;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4701wka)) {
            return false;
        }
        C4701wka wka = (C4701wka) obj;
        if (this.a.equals(wka.b()) && this.b.equals(wka.c()) && this.c.equals(wka.a()) && this.d.equals(wka.d())) {
            String str = this.e;
            if (str != null ? str.equals(wka.f()) : wka.f() == null) {
                C4638pka pka = this.f;
                if (pka != null ? pka.equals(wka.e()) : wka.e() == null) {
                }
            }
        }
        z = false;
        return z;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("gender")
    public String f() {
        return this.e;
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
        sb.append("SocialSignUpBody{clientId=");
        sb.append(this.a);
        sb.append(", clientSecret=");
        sb.append(this.b);
        sb.append(", authMethod=");
        sb.append(this.c);
        sb.append(", credentials=");
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
