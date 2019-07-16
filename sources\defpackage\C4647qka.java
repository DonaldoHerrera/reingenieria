package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: qka reason: default package and case insensitive filesystem */
/* compiled from: EmailSignUpBody */
public abstract class C4647qka implements C4692vka {
    public static C4647qka a(String str, String str2, String str3, String str4, String str5, long j, long j2, String str6) {
        C4574hka hka = new C4574hka(str, str2, str3, str4, str5, C4638pka.a(j, j2), str6);
        return hka;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("client_id")
    public abstract String a();

    /* access modifiers changed from: 0000 */
    @JsonProperty("client_secret")
    public abstract String b();

    /* access modifiers changed from: 0000 */
    @JsonProperty("dob")
    public abstract C4638pka c();

    /* access modifiers changed from: 0000 */
    @JsonProperty("email_address")
    public abstract String d();

    /* access modifiers changed from: 0000 */
    @JsonProperty("gender")
    public abstract String e();

    /* access modifiers changed from: 0000 */
    @JsonProperty("password")
    public abstract String f();

    /* access modifiers changed from: 0000 */
    @JsonProperty("signature")
    public abstract String g();
}
