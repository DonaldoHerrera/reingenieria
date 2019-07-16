package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: oO reason: default package and case insensitive filesystem */
/* compiled from: MobilePlaySession.kt */
public final class C3179oO {
    private final long a;
    private final String b;

    @JsonCreator
    public C3179oO(long j, String str) {
        C7471uYa.b(str, "action");
        this.a = j;
        this.b = str;
    }

    @JsonProperty("action")
    public final String a() {
        return this.b;
    }

    @JsonProperty("ts")
    public final long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3179oO) {
                C3179oO oOVar = (C3179oO) obj;
                if (!(this.a == oOVar.a) || !C7471uYa.a((Object) this.b, (Object) oOVar.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MobilePlayState(ts=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
