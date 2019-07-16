package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: wka reason: default package and case insensitive filesystem */
/* compiled from: SocialSignUpBody */
public abstract class C4701wka implements C4692vka {
    public static C4701wka a(String str, String str2, String str3, String str4, String str5, long j, long j2, String str6) {
        C4614mka mka = new C4614mka(str, str2, str3, C4656rka.a(str4), str5, C4638pka.a(j, j2), str6);
        return mka;
    }

    public static C4701wka b(String str, String str2, String str3, String str4, String str5, long j, long j2, String str6) {
        C4614mka mka = new C4614mka(str, str2, str3, C4665ska.a(str4), str5, C4638pka.a(j, j2), str6);
        return mka;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("auth_method")
    public abstract String a();

    /* access modifiers changed from: 0000 */
    @JsonProperty("client_id")
    public abstract String b();

    /* access modifiers changed from: 0000 */
    @JsonProperty("client_secret")
    public abstract String c();

    /* access modifiers changed from: 0000 */
    @JsonProperty("credentials")
    public abstract C4630oka d();

    /* access modifiers changed from: 0000 */
    @JsonProperty("dob")
    public abstract C4638pka e();

    /* access modifiers changed from: 0000 */
    @JsonProperty("gender")
    public abstract String f();

    /* access modifiers changed from: 0000 */
    @JsonProperty("signature")
    public abstract String g();
}
