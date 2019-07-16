package com.soundcloud.android.foundation.ads;

/* compiled from: AutoValue_VideoAdSource */
final class C extends ba {
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    private final int f;

    C(String str, String str2, int i, int i2, int i3) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                this.d = i;
                this.e = i2;
                this.f = i3;
                return;
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null type");
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.f;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        if (!(this.b.equals(baVar.e()) && this.c.equals(baVar.f()) && this.d == baVar.a() && this.e == baVar.g() && this.f == baVar.b())) {
            z = false;
        }
        return z;
    }

    public String f() {
        return this.c;
    }

    public int g() {
        return this.e;
    }

    public int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoAdSource{type=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", bitRateKbps=");
        sb.append(this.d);
        sb.append(", width=");
        sb.append(this.e);
        sb.append(", height=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
