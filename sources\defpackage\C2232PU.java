package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: PU reason: default package and case insensitive filesystem */
/* compiled from: Layer.kt */
public final class C2232PU {
    private final String a;
    private final int b;
    private final String c;
    private final int d;
    private final String e;

    @JsonCreator
    public C2232PU(@JsonProperty("layer_name") String str, @JsonProperty("experiment_id") int i, @JsonProperty("experiment_name") String str2, @JsonProperty("variant_id") int i2, @JsonProperty("variant_name") String str3) {
        C7471uYa.b(str, "layerName");
        C7471uYa.b(str2, "experimentName");
        C7471uYa.b(str3, "variantName");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = str3;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2232PU) {
                C2232PU pu = (C2232PU) obj;
                if (C7471uYa.a((Object) this.a, (Object) pu.a)) {
                    if ((this.b == pu.b) && C7471uYa.a((Object) this.c, (Object) pu.c)) {
                        if (!(this.d == pu.d) || !C7471uYa.a((Object) this.e, (Object) pu.e)) {
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
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
        String str2 = this.c;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Layer(layerName=");
        sb.append(this.a);
        sb.append(", experimentId=");
        sb.append(this.b);
        sb.append(", experimentName=");
        sb.append(this.c);
        sb.append(", variantId=");
        sb.append(this.d);
        sb.append(", variantName=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
