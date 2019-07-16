package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.common.internal.ImagesContract;

/* renamed from: uDa reason: default package and case insensitive filesystem */
/* compiled from: MediaPayload.kt */
public final class C7449uDa {
    private final String a;
    private final String b;
    private final C7518vDa c;
    private final long d;
    private final boolean e;
    private final String f;

    @JsonCreator
    public C7449uDa(@JsonProperty("url") String str, @JsonProperty("quality") String str2, @JsonProperty("format") C7518vDa vda, @JsonProperty("duration") long j, @JsonProperty("snipped") boolean z, @JsonProperty("preset") String str3) {
        C7471uYa.b(str, ImagesContract.URL);
        C7471uYa.b(str2, "quality");
        C7471uYa.b(vda, "format");
        C7471uYa.b(str3, "preset");
        this.a = str;
        this.b = str2;
        this.c = vda;
        this.d = j;
        this.e = z;
        this.f = str3;
    }

    public final C7518vDa a() {
        return this.c;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7449uDa) {
                C7449uDa uda = (C7449uDa) obj;
                if (C7471uYa.a((Object) this.a, (Object) uda.a) && C7471uYa.a((Object) this.b, (Object) uda.b) && C7471uYa.a((Object) this.c, (Object) uda.c)) {
                    if (this.d == uda.d) {
                        if (!(this.e == uda.e) || !C7471uYa.a((Object) this.f, (Object) uda.f)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C7518vDa vda = this.c;
        int hashCode3 = (hashCode2 + (vda != null ? vda.hashCode() : 0)) * 31;
        long j = this.d;
        int i2 = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.e;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaStream(url=");
        sb.append(this.a);
        sb.append(", quality=");
        sb.append(this.b);
        sb.append(", format=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", snipped=");
        sb.append(this.e);
        sb.append(", preset=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
