package defpackage;

import com.soundcloud.android.accounts.C2526g;

/* renamed from: UP reason: default package and case insensitive filesystem */
/* compiled from: OAuth */
public class C2322UP {
    private final String a;
    private final String b;
    private final C2526g c;

    public C2322UP(C2526g gVar, C2041FV fv) {
        this("dbdsA8b6V6Lw7wzu1x0T4CLxt58yd4Bf", fv.b("NykCWyEEEyUrRCd2AQAtEAUdfy9HKAAkKRwjJh4cMSk="), gVar);
    }

    public static String a(C2358WP wp) {
        String a2 = wp != null && wp.e() ? wp.a() : "invalidated";
        StringBuilder sb = new StringBuilder();
        sb.append("OAuth ");
        sb.append(a2);
        return sb.toString();
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public C2322UP(String str, String str2, C2526g gVar) {
        this.a = str;
        this.b = str2;
        this.c = gVar;
    }

    public String a() {
        return a(this.c.e());
    }
}
