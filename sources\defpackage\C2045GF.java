package defpackage;

import java.nio.charset.Charset;

/* renamed from: GF reason: default package and case insensitive filesystem */
/* compiled from: EncoderContext */
final class C2045GF {
    private final String a;
    private C2122KF b;
    private C2440aF c;
    private C2440aF d;
    private final StringBuilder e;
    int f;
    private int g;
    private C2103JF h;
    private int i;

    C2045GF(String str) {
        byte[] bytes = str.getBytes(Charset.forName("ISO-8859-1"));
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = (char) (bytes[i2] & 255);
            if (c2 != '?' || str.charAt(i2) == '?') {
                sb.append(c2);
                i2++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.a = sb.toString();
        this.b = C2122KF.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    private int l() {
        return this.a.length() - this.i;
    }

    public void a(C2122KF kf) {
        this.b = kf;
    }

    public StringBuilder b() {
        return this.e;
    }

    public char c() {
        return this.a.charAt(this.f);
    }

    public String d() {
        return this.a;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return l() - this.f;
    }

    public C2103JF g() {
        return this.h;
    }

    public boolean h() {
        return this.f < l();
    }

    public void i() {
        this.g = -1;
    }

    public void j() {
        this.h = null;
    }

    public void k() {
        c(a());
    }

    public void a(C2440aF aFVar, C2440aF aFVar2) {
        this.c = aFVar;
        this.d = aFVar2;
    }

    public void b(int i2) {
        this.g = i2;
    }

    public void c(int i2) {
        C2103JF jf = this.h;
        if (jf == null || i2 > jf.a()) {
            this.h = C2103JF.a(i2, this.b, this.c, this.d, true);
        }
    }

    public void a(int i2) {
        this.i = i2;
    }

    public void a(String str) {
        this.e.append(str);
    }

    public void a(char c2) {
        this.e.append(c2);
    }

    public int a() {
        return this.e.length();
    }
}
