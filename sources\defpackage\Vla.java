package defpackage;

/* renamed from: Vla reason: default package */
/* compiled from: FlipperEvent.kt */
public final class Vla {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final int h;

    public Vla(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2) {
        C7471uYa.b(str, "category");
        C7471uYa.b(str2, "playerVariant");
        C7471uYa.b(str3, "sourceFile");
        C7471uYa.b(str4, "message");
        C7471uYa.b(str5, "cdn");
        C7471uYa.b(str6, "format");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Vla) {
                Vla vla = (Vla) obj;
                if (C7471uYa.a((Object) this.a, (Object) vla.a) && C7471uYa.a((Object) this.b, (Object) vla.b) && C7471uYa.a((Object) this.c, (Object) vla.c)) {
                    if ((this.d == vla.d) && C7471uYa.a((Object) this.e, (Object) vla.e) && C7471uYa.a((Object) this.f, (Object) vla.f) && C7471uYa.a((Object) this.g, (Object) vla.g)) {
                        if (this.h == vla.h) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.c;
    }

    public final boolean g() {
        return C7471uYa.a((Object) this.a, (Object) "hls_stream-network");
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FlipperError(category=");
        sb.append(this.a);
        sb.append(", playerVariant=");
        sb.append(this.b);
        sb.append(", sourceFile=");
        sb.append(this.c);
        sb.append(", line=");
        sb.append(this.d);
        sb.append(", message=");
        sb.append(this.e);
        sb.append(", cdn=");
        sb.append(this.f);
        sb.append(", format=");
        sb.append(this.g);
        sb.append(", bitrate=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
