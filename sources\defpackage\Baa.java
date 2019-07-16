package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Baa reason: default package */
/* compiled from: OnboardingEvent */
public final class Baa {
    private final int a;
    private final Map<String, String> b = new HashMap();

    private Baa(int i) {
        this.a = i;
    }

    public static Baa a() {
        return new Baa(3);
    }

    public static Baa b() {
        Baa baa = new Baa(8);
        baa.a("error_type", "device_block");
        return baa;
    }

    public static Baa c() {
        Baa baa = new Baa(8);
        baa.a("error_type", "logged_out");
        return baa;
    }

    public static Baa d() {
        Baa baa = new Baa(8);
        baa.a("error_type", "device_conflict");
        return baa;
    }

    public static Baa e() {
        Baa baa = new Baa(1);
        baa.a(C1325gg.TYPE, "facebook");
        return baa;
    }

    public static Baa h() {
        Baa baa = new Baa(1);
        baa.a(C1325gg.TYPE, "google_plus");
        return baa;
    }

    public static Baa i() {
        Baa baa = new Baa(0);
        baa.a(C1325gg.TYPE, "sign in");
        return baa;
    }

    public static Baa j() {
        Baa baa = new Baa(1);
        baa.a(C1325gg.TYPE, "native");
        return baa;
    }

    public static Baa k() {
        Baa baa = new Baa(0);
        baa.a(C1325gg.TYPE, "sign up");
        return baa;
    }

    public static Baa l() {
        Baa baa = new Baa(7);
        baa.a("error_type", "age_restricted");
        return baa;
    }

    public static Baa m() {
        Baa baa = new Baa(7);
        baa.a("error_type", "denied_signup");
        return baa;
    }

    public static Baa n() {
        Baa baa = new Baa(7);
        baa.a("error_type", "existing_email");
        return baa;
    }

    public static Baa o() {
        Baa baa = new Baa(7);
        baa.a("error_type", "facebook_email_denied");
        return baa;
    }

    public static Baa p() {
        Baa baa = new Baa(7);
        baa.a("error_type", "general_error");
        return baa;
    }

    public static Baa q() {
        Baa baa = new Baa(7);
        baa.a("error_type", "invalid_email");
        return baa;
    }

    public static Baa r() {
        Baa baa = new Baa(7);
        baa.a("error_type", "serve_captcha");
        return baa;
    }

    public static Baa s() {
        Baa baa = new Baa(2);
        baa.a("action", "accept");
        return baa;
    }

    public static Baa t() {
        Baa baa = new Baa(2);
        baa.a("action", "cancel");
        return baa;
    }

    public Map<String, String> f() {
        return this.b;
    }

    public String g() {
        return a(this.a);
    }

    public String toString() {
        return String.format("Onboarding Event with type '%s' and %s", new Object[]{a(this.a), this.b.toString()});
    }

    public static Baa a(String str, File file) {
        Baa baa = new Baa(4);
        String str2 = "yes";
        String str3 = "no";
        baa.a("added_username", C5206PKa.b(str) ? str2 : str3);
        if (file == null) {
            str2 = str3;
        }
        baa.a("added_picture", str2);
        return baa;
    }

    private Baa a(String str, String str2) {
        this.b.put(str, str2);
        return this;
    }

    private static String a(int i) {
        switch (i) {
            case 0:
                return "auth_prompt";
            case 1:
                return "auth_credentials";
            case 2:
                return "confirm_terms";
            case 3:
                return "auth_complete";
            case 4:
                return "user_info";
            case 5:
                return "onboarding_complete";
            case 6:
                return "email_marketing";
            case 7:
                return "signup_error";
            case 8:
                return "device_management";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown_");
                sb.append(i);
                return sb.toString();
        }
    }
}
