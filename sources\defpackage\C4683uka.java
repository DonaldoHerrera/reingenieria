package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: uka reason: default package and case insensitive filesystem */
/* compiled from: SignInBody */
public abstract class C4683uka {
    public static C4683uka a(String str, String str2, String str3, String str4, String str5) {
        C4606lka lka = new C4606lka(C4710xka.a(str, str2), "password", str3, str4, false, str5);
        return lka;
    }

    public static C4683uka b(String str, String str2, String str3, String str4) {
        C4606lka lka = new C4606lka(C4665ska.a(str), "google", str2, str3, false, str4);
        return lka;
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
    @JsonProperty("create_if_not_found")
    public abstract boolean d();

    @JsonProperty("credentials")
    public abstract C4630oka e();

    /* access modifiers changed from: 0000 */
    @JsonProperty("signature")
    public abstract String f();

    public static C4683uka a(String str, String str2, String str3, String str4) {
        C4606lka lka = new C4606lka(C4656rka.a(str), "facebook", str2, str3, false, str4);
        return lka;
    }
}
