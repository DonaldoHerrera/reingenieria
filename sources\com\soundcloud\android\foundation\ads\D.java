package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.soundcloud.android.foundation.ads.ba.a;

/* compiled from: AutoValue_VideoAdSource_ApiModel */
final class D extends a {
    private final String a;
    private final String b;
    private final int c;
    private final int d;
    private final int e;

    D(String str, String str2, int i, int i2, int i3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = i;
                this.d = i2;
                this.e = i3;
                return;
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null type");
    }

    @JsonProperty("bitrate_kbps")
    public int a() {
        return this.c;
    }

    @JsonProperty("height")
    public int b() {
        return this.e;
    }

    @JsonProperty("type")
    public String c() {
        return this.a;
    }

    @JsonProperty("url")
    public String d() {
        return this.b;
    }

    @JsonProperty("width")
    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!(this.a.equals(aVar.c()) && this.b.equals(aVar.d()) && this.c == aVar.a() && this.d == aVar.e() && this.e == aVar.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiModel{type=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", bitRate=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
