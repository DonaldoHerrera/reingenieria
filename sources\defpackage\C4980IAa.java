package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: IAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncResponse.kt */
public final class C4980IAa {
    private final long a;
    private final String b;

    @JsonCreator
    public C4980IAa(@JsonProperty("code") long j, @JsonProperty("description") String str) {
        C7471uYa.b(str, "description");
        this.a = j;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4980IAa) {
                C4980IAa iAa = (C4980IAa) obj;
                if (!(this.a == iAa.a) || !C7471uYa.a((Object) this.b, (Object) iAa.b)) {
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
        sb.append("Error(code=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
