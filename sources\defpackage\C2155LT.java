package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: LT reason: default package and case insensitive filesystem */
/* compiled from: ApiPrivacySettings.kt */
public final class C2155LT {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    @JsonCreator
    public C2155LT(@JsonProperty("analytics_opt_in") boolean z, @JsonProperty("communications_opt_in") boolean z2, @JsonProperty("targeted_advertising_opt_in") boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @JsonProperty("analytics_opt_in")
    public final boolean a() {
        return this.a;
    }

    @JsonProperty("communications_opt_in")
    public final boolean b() {
        return this.b;
    }

    @JsonProperty("targeted_advertising_opt_in")
    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2155LT) {
                C2155LT lt = (C2155LT) obj;
                if (this.a == lt.a) {
                    if (this.b == lt.b) {
                        if (this.c == lt.c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.b;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.c;
        if (!z3) {
            i = z3;
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiPrivacySettings(hasAnalyticsOptIn=");
        sb.append(this.a);
        sb.append(", hasCommunicationsOptIn=");
        sb.append(this.b);
        sb.append(", hasTargetedAdvertisingOptIn=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
