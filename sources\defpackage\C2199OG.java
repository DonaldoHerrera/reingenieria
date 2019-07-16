package defpackage;

import java.net.URL;

/* renamed from: OG reason: default package and case insensitive filesystem */
public final class C2199OG {
    private final String a;
    private final URL b;
    private final String c;

    private C2199OG(String str, URL url, String str2) {
        this.a = str;
        this.b = url;
        this.c = str2;
    }

    public static C2199OG a(String str, URL url, String str2) {
        C3067jH.a(str, "VendorKey is null or empty");
        C3067jH.a((Object) url, "ResourceURL is null");
        C3067jH.a(str2, "VerificationParameters is null or empty");
        return new C2199OG(str, url, str2);
    }

    public static C2199OG a(URL url) {
        C3067jH.a((Object) url, "ResourceURL is null");
        return new C2199OG(null, url, null);
    }

    public URL a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }
}
