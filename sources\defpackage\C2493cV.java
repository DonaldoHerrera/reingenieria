package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: cV reason: default package and case insensitive filesystem */
/* compiled from: Upsell.kt */
public final class C2493cV {
    private final String a;
    private final int b;

    @JsonCreator
    public C2493cV(@JsonProperty("id") String str, @JsonProperty("trial_days") int i) {
        C7471uYa.b(str, "id");
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2493cV) {
                C2493cV cVVar = (C2493cV) obj;
                if (C7471uYa.a((Object) this.a, (Object) cVVar.a)) {
                    if (this.b == cVVar.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Upsell(id=");
        sb.append(this.a);
        sb.append(", trialDays=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
