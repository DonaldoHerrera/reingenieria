package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: dV reason: default package and case insensitive filesystem */
/* compiled from: UserPlan.kt */
public final class C2966dV {
    private final C2455aV a;
    private final boolean b;
    private final String c;
    private final List<C2493cV> d;

    public C2966dV(C2455aV aVVar, boolean z, String str, List<C2493cV> list) {
        C7471uYa.b(aVVar, "currentPlan");
        C7471uYa.b(list, "planUpsell");
        this.a = aVVar;
        this.b = z;
        this.c = str;
        this.d = list;
    }

    public final C2455aV a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final List<C2493cV> c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2966dV) {
                C2966dV dVVar = (C2966dV) obj;
                if (C7471uYa.a((Object) this.a, (Object) dVVar.a)) {
                    if (!(this.b == dVVar.b) || !C7471uYa.a((Object) this.c, (Object) dVVar.c) || !C7471uYa.a((Object) this.d, (Object) dVVar.d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C2455aV aVVar = this.a;
        int i = 0;
        int hashCode = (aVVar != null ? aVVar.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.c;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        List<C2493cV> list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserPlan(currentPlan=");
        sb.append(this.a);
        sb.append(", manageable=");
        sb.append(this.b);
        sb.append(", vendor=");
        sb.append(this.c);
        sb.append(", planUpsell=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public C2966dV(@JsonProperty("id") String str, @JsonProperty("manageable") boolean z, @JsonProperty("vendor") String str2, @JsonProperty("plan_upsells") List<C2493cV> list) {
        C7471uYa.b(str, "currentPlan");
        C7471uYa.b(list, "planUpsells");
        this(C2455aV.g.a(str), z, str2, list);
    }
}
